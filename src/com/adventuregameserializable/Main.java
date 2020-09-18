package com.adventuregameserializable;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Locations locations = new Locations();

    public static void main(String[] args) {


        int currentState = 1;
        boolean operation = true;
        while(operation) {

            AdventureMap adventureMap = Locations.getLocations().get(currentState);

            StringBuilder stringBuilder = new StringBuilder();
            String possibleExits = "";
            for(Map.Entry<String, Integer> entry : adventureMap.getExits().entrySet()) {
                possibleExits = stringBuilder.append(entry.getKey()).append(", ").toString();
            }

            System.out.println("Where are you? " + adventureMap.getDescription());
            System.out.println("Possible directions: " + possibleExits);
            System.out.println("Choose a direction where to go...");

            String chosenDirection = scanner.nextLine().toUpperCase();


            if(chosenDirection.toLowerCase().contains("west") || chosenDirection.toLowerCase().equals("w")) {
                chosenDirection = "W";
            } else if (chosenDirection.toLowerCase().contains("east") || chosenDirection.toLowerCase().equals("e")) {
                chosenDirection = "E";
            } else if (chosenDirection.toLowerCase().contains("north") || chosenDirection.toLowerCase().equals("n")) {
                chosenDirection = "N";
            } else if (chosenDirection.toLowerCase().contains("south") || chosenDirection.toLowerCase().equals("s")) {
                chosenDirection = "S";
            } else if (chosenDirection.toLowerCase().contains("quit") || chosenDirection.toLowerCase().equals("q")) {
                System.out.println("Bye Bye!");
                break;
            }

            if(Locations.getLocations().get(currentState).doesDirectionExist(chosenDirection)) {
                int location = Locations.getLocations().get(currentState).getExits().get(chosenDirection);
                currentState = location;
            } else {
                System.out.println("You can't go this direction. Try again");
            }
        }
    }
}
