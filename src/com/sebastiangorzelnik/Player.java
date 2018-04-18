package com.sebastiangorzelnik;

public class Player {
    String name;
    int wins;
    int loses;

    public Player(String name) {
        this.name = name;
        this.wins =0;
        this.loses = 0;
    }

    public void wonMatch(){
        wins++;
    }
    public void lostMatch(){
        loses++;
    }

}
