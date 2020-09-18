package com.adventuregameserializable;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Locations {
    private static Map<Integer, AdventureMap> locations = new HashMap<>();

    //using Serializable we will save all the object.Do not need to create separate files to store different elements.
    public static void main(String[] args) {
        try(ObjectOutputStream locationsFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/com/adventuregameserializable/locations.dat")))) {
            for(Map.Entry<Integer, AdventureMap> entry : locations.entrySet()) {
                locationsFile.writeObject(entry.getValue());
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    static {
        try(ObjectInputStream locationsFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/com/adventuregameserializable/locations.dat")))) {
            boolean eof = false;
            while(!eof) {  //need this , because ObjectInputStream doesn't return null when there is nothing to read
                try {
                    AdventureMap adventureMap = (AdventureMap) locationsFile.readObject();
                    locations.put(adventureMap.getLocationId(), adventureMap);
                } catch (EOFException e) {
                    e.printStackTrace();
                    eof = true; //when there is an end of the .dat file, we make eof=true, to go out from the while loop
                }
            }
        } catch (IOException | ClassNotFoundException io) {
            io.printStackTrace();
        }

//        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/adventuregameio/locations.txt"))) {
//            String newLine;
//            while((newLine = bufferedReader.readLine()) != null) {
//                String[] stringArray = newLine.split(",");
//                int locationId = Integer.parseInt(stringArray[0]);
//                String description = stringArray[1];
//                locations.put(locationId, new AdventureMap(locationId, description));
//            }
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//
//        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/adventuregameio/directions.txt"))) {
//            String newLine;
//            while((newLine = bufferedReader.readLine()) != null) {
//                String[] stringArray = newLine.split(",");
//                int locationId = Integer.parseInt(stringArray[0]);
//                String direction = stringArray[1];
//                int exit = Integer.parseInt(stringArray[2]);
//                for(Map.Entry<Integer, AdventureMap> entry : locations.entrySet()) {
//                    if(entry.getKey() == locationId) {
//                        locations.get(locationId).addExits(direction, exit);
//                    }
//                }
//            }
//        } catch(IOException e) {
//            e.printStackTrace();
//        }

    }

    public static Map<Integer, AdventureMap> getLocations() {
        return locations;
    }
}
