package com.duckrace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuckRacer {
    private final int id;
    private String name;
    private int wins;
    private final List<Reward> rewards = new ArrayList<>();

    //constructor
    DuckRacer(int id, String name){
        this.id = id;
        setName(name);
    }

    // business accessor
     public void win(Reward reward){
        rewards.add(reward);
     }

    // accessor methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // derived property
    public int getWins() {
        return rewards.size();
    }

    /*
     * Note: currently, we are returning a direcr reference to our internal list<Reward>. this is not appriopriate as
     * it can be manipulated externally.
     *
     * Fix: instead of returning a direct reference to our internal List<Rewards>, we return read-only view of our internal
     * List<Reward>. UnsupportedOperationsExceptions should appear if violation occurs
     */
    public List<Reward> getRewards() {
      //  return rewards;
        return Collections.unmodifiableList(rewards);   // read-only view
    }

    public String toString() {
        return String.format("%s: ID= %s, Name= %s, Wins= %s, Rewards= %s.", getClass(), getId(), getName(), getWins(), getRewards());
    }
}
