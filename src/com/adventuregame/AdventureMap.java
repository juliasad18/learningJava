package com.adventuregame;

import java.util.HashMap;
import java.util.Map;

public class AdventureMap {
    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    public AdventureMap(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
        this.exits = new HashMap<>();
    }

    public void addExits(String direction, int locationId) {
        exits.put(direction, locationId);
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

    public boolean doesDirectionExist(String direction) {
        boolean condition = false;
        for(Map.Entry element : getExits().entrySet()) {
            if(getExits().containsKey(direction)) {
                condition = true;
                break;
            } else {
                condition = false;
            }
        }
         return condition;
    }
}
