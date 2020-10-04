package com.pkt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckam = new SoccerPlayer("Beckham");

        Team<FootballPlayer> pkTeam = new Team<>("pk Team");
        pkTeam.addPlayer(joe);

        Team<FootballPlayer> theOtherFootballTeam = new Team<>("the otherFootballTeam");


        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer Team");
        soccerTeam.addPlayer(beckam);


        System.out.println(pkTeam.numPlayers());
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            System.out.println( i * 2);
        }
    }
}
