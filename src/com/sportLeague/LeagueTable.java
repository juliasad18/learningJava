package com.sportLeague;

import java.util.ArrayList;

public class LeagueTable<T extends FootballPlayer> {
    private String name;
    private ArrayList<Team<T>> leagueTeams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public boolean addTeamToLeague(Team<T> team) {
        if(team != null) {
            leagueTeams.add(team);
            return true;
        } else {
            System.out.println("No players to play.");
            return false;
        }
    }

    public void displayTeams() {
        if(leagueTeams != null) {
            for(int i = 0; i < leagueTeams.size(); i++) {
                System.out.println("Team: " + leagueTeams.get(i).getName());
                System.out.println("No of victories: " + leagueTeams.get(i).getWon());
                System.out.println("=======================");
            }
        } else {
            System.out.println("League table is empty.");
        }
    }


}
