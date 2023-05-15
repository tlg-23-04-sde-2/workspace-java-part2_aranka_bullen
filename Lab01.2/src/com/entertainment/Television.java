package com.entertainment;

import java.util.Objects;

public class Television {
    private String brand;
    private int volume;
    private Tuner tuner = new Tuner();

    public String Brand() {
        return brand;
    }

    Television(){}

    public Television(String brand, int volume){
    }

    public String getBrand() {
        return brand;
    }

    public Tuner getTuner() {
        return this.tuner= tuner;
    }


    public void changeChannel(int channel){tuner.setChannel(channel);}

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int hashCode() {
        //poor written hash function, because it wasily yields "has collection
        //a "hash collisions" is when different objects hash to the same value
        return getBrand().length() + getVolume();
        return Objects.hash(getBrand(),getVolume());
    }

    public boolean equals(Object obj) {
        boolean result = false;
        if(obj instanceof Television) {
            Television other = (Television) obj;

            result = Objects.equals(this.getBrand(), other.getBrand()) &&   // null-safe check set up
                    this.getVolume() == other.getBrand();        // primitatives cannot be null
        }
        return result;
    }

    public String toString() {
       return String.format(" Television [Brand: %s, Channel: %s]", getBrand(), getVolume());
    }
    // Television tv = new Television();
}
