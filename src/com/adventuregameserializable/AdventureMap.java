package com.adventuregameserializable;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


//using Serializable we will save all the object.Do not need to create separate files to store different elements.
public class AdventureMap implements Serializable {
    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    private long serialVersionUID = 1L;

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

    public int getLocationId() {
        return locationId;
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
