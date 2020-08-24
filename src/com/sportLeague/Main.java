package com.sportLeague;

public class Main {
    public static void main(String[] args) {
        FootballPlayer player1 = new FootballPlayer("Martin");
        FootballPlayer player2 = new FootballPlayer("Martin");
        FootballPlayer player3 = new FootballPlayer("Martin");
        FootballPlayer player4 = new FootballPlayer("Martin");
        FootballPlayer player5 = new FootballPlayer("Martin");
        FootballPlayer player6 = new FootballPlayer("Martin");
        FootballPlayer player7 = new FootballPlayer("Martin");
        FootballPlayer player8 = new FootballPlayer("Martin");

        Team<FootballPlayer> monkeys = new Team<>("Monkeys");
        Team<FootballPlayer> elephants = new Team<>("Elephants");

        monkeys.addPlayer(player1);
        monkeys.addPlayer(player2);
        monkeys.addPlayer(player3);
        monkeys.addPlayer(player4);
        elephants.addPlayer(player5);
        elephants.addPlayer(player6);
        elephants.addPlayer(player7);
        elephants.addPlayer(player8);

        monkeys.matchResult(elephants, 10, 15);
        //elephants.matchResult(monkeys, 15, 10);

        LeagueTable<FootballPlayer> footballGame = new LeagueTable<>("Football"); //it is allowed to create LeagueTable only for Football players
        footballGame.addTeamToLeague(monkeys);
        footballGame.addTeamToLeague(elephants);

        footballGame.displayTeams();




    }
}
