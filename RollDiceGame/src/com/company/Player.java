package com.company;

public class Player {
    private String name;
    private String gender;
    public Player(String pl_name, String pl_gender){
        this.name=pl_name;
        this.gender=pl_gender;
    }
    public int roll(){
        // create a random variable between 1 to 6
        return ((int) (Math.random()*(6-1)))+1;
    }
}
