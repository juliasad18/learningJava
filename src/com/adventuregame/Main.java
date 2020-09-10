package com.adventuregame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Map<Integer, AdventureMap> locations = new HashMap<>();

    public static void main(String[] args) {
        AdventureMap start = new AdventureMap(0, "You are in front of your computer.");
        AdventureMap road = new AdventureMap(1, "You are standing on the road and can choose any direction.");
        AdventureMap hill = new AdventureMap(2, "You are at the top of a hill.");
        AdventureMap building = new AdventureMap(3, "You are inside a building.");
        AdventureMap valley = new AdventureMap(4, "You are in a valley beside a stream.");
        AdventureMap forest = new AdventureMap(5, "You are in a forest.");

        locations.put(0, start);
        locations.put(1, road);
        locations.put(2, hill);
        locations.put(3, building);
        locations.put(4, valley);
        locations.put(5, forest);

        locations.get(1).addExits("W", 2);
        locations.get(1).addExits("E", 3);
        locations.get(1).addExits("S", 4);
        locations.get(1).addExits("N", 5);
        locations.get(1).addExits("Q", 0);

        locations.get(2).addExits("N", 5);
        locations.get(2).addExits("Q", 0);

        locations.get(3).addExits("W", 1);
        locations.get(3).addExits("Q", 0);

        locations.get(4).addExits("W", 2);
        locations.get(4).addExits("N", 1);
        locations.get(4).addExits("Q", 0);

        locations.get(5).addExits("W", 2);
        locations.get(5).addExits("S", 1);
        locations.get(5).addExits("Q", 0);

//        Map<String, String> vocabulary = new HashMap<>();
//        vocabulary.put("WEST", "W");
//        vocabulary.put("EAST", "E");
//        vocabulary.put("NORTH", "N");
//        vocabulary.put("SOUTH", "S");


        int currentState = 1;
        boolean operation = true;
        while(operation) {
            System.out.println("Where are you? " + locations.get(currentState).getDescription());
            System.out.println("Choose a direction where to go...");
            String chosenDirection = scanner.nextLine().toUpperCase();

//            if(chosenDirection.length() == 1) {
//                if(locations.get(currentState).doesDirectionExist(chosenDirection)) {
//                    int location = locations.get(currentState).getExits().get(chosenDirection);
//                    currentState = location;
//                } else {
//                    System.out.println("You can't go this direction. Try again");
//                }
//            } else if (chosenDirection.length() > 1) {
//                String[] separatedWords = chosenDirection.split(" ");
//                for(String word : separatedWords) {
//                    if(vocabulary.containsKey(word)) {
//                        chosenDirection = vocabulary.get(word);
//                        if(locations.get(currentState).doesDirectionExist(chosenDirection)) {
//                            int location = locations.get(currentState).getExits().get(chosenDirection);
//                            currentState = location;
//                        } else {
//                            System.out.println("You can't go this direction. Try again");
//                        }
//                    }
//                }
//            }
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

            if(locations.get(currentState).doesDirectionExist(chosenDirection)) {
                int location = locations.get(currentState).getExits().get(chosenDirection);
                currentState = location;
            } else {
                System.out.println("You can't go this direction. Try again");
            }
        }
    }
}
