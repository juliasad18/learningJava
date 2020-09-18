package com.adventuregameio;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Locations {
    private static Map<Integer, AdventureMap> locations = new HashMap<>();

    //open question - why BufferedWriter is more effective than write directly into FileWriter?
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("src/com/adventuregameio/locations.txt")); BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter("src/com/adventuregameio/directions.txt"))) { //tre-with-resources : means that try bloc will automatically close the process; //to add more than one FileWriter object, need to separate them with ; --> (FileWriter fileWriter1 = new FileWriter("locations.txt"); FileWriter fileWriter2 = new FileWriter("description.txt"))
            for(Map.Entry<Integer, AdventureMap> entry : locations.entrySet()) {
                bufferedWriter1.write(entry.getValue().getLocationId() + "," + entry.getValue().getDescription() + "\n");
                for(Map.Entry<String, Integer> entry2 : entry.getValue().getExits().entrySet()) {
                    bufferedWriter2.write(entry.getValue().getLocationId() + "," + entry2.getKey() + "," + entry2.getValue() + "\n");
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    static {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/adventuregameio/locations.txt"))) {
            String newLine;
            while((newLine = bufferedReader.readLine()) != null) {
                String[] stringArray = newLine.split(",");
                int locationId = Integer.parseInt(stringArray[0]);
                String description = stringArray[1];
                locations.put(locationId, new AdventureMap(locationId, description));
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        //BufferedReader - one way how to read lines from a file; Another way - use Scanner to scan nextLine from the FileReader
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/adventuregameio/directions.txt"))) {
            String newLine;
            while((newLine = bufferedReader.readLine()) != null) {
                String[] stringArray = newLine.split(",");
                int locationId = Integer.parseInt(stringArray[0]);
                String direction = stringArray[1];
                int exit = Integer.parseInt(stringArray[2]);
                for(Map.Entry<Integer, AdventureMap> entry : locations.entrySet()) {
                    if(entry.getKey() == locationId) {
                        locations.get(locationId).addExits(direction, exit);
                    }
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }



//        AdventureMap start = new AdventureMap(0, "You are in front of your computer.");
//        AdventureMap road = new AdventureMap(1, "You are standing on the road and can choose any direction.");
//        AdventureMap hill = new AdventureMap(2, "You are at the top of a hill.");
//        AdventureMap building = new AdventureMap(3, "You are inside a building.");
//        AdventureMap valley = new AdventureMap(4, "You are in a valley beside a stream.");
//        AdventureMap forest = new AdventureMap(5, "You are in a forest.");
//
//        locations.put(0, start);
//        locations.put(1, road);
//        locations.put(2, hill);
//        locations.put(3, building);
//        locations.put(4, valley);
//        locations.put(5, forest);
//
//        locations.get(1).addExits("W", 2);
//        locations.get(1).addExits("E", 3);
//        locations.get(1).addExits("S", 4);
//        locations.get(1).addExits("N", 5);
//        locations.get(1).addExits("Q", 0);
//
//        locations.get(2).addExits("N", 5);
//        locations.get(2).addExits("Q", 0);
//
//        locations.get(3).addExits("W", 1);
//        locations.get(3).addExits("Q", 0);
//
//        locations.get(4).addExits("W", 2);
//        locations.get(4).addExits("N", 1);
//        locations.get(4).addExits("Q", 0);
//
//        locations.get(5).addExits("W", 2);
//        locations.get(5).addExits("S", 1);
//        locations.get(5).addExits("Q", 0);
    }

    public static Map<Integer, AdventureMap> getLocations() {
        return locations;
    }
}
