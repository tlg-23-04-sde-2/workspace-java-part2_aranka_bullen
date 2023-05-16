package com.entertainment;

import java.util.Objects;

/*
 * Natural order is defined by brand (String).
 */

public class Television  implements Comparable<Television> {
    private String brand;
    private int volume;
    private Tuner tuner = new Tuner();

    public String Brand() {
        return brand;
    }

    Television() {
    }

    public Television(String brand, int volume) {
    }

    public String getBrand() {
        return brand;
    }

    public Tuner getTuner() {
        return this.tuner = tuner;
    }

public int getCurrentChannel(){
        return tuner.getChannel();
}
    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /*
     * Natural orfer is defined by brand (String), then by volume (int)
     *
     * To be consistent with equal we must use the same properties
     */

    public int compareTo(Television otherTelevision){
       int result = this.getBrand().compareTo(otherTelevision.getBrand());

       if(result == 0){ // tied on the bran, break the tie by volume

       }

       return result;
    }


    public int hashCode() {
        //poor written hash function, because it wasily yields "has collection
        //a "hash collisions" is when different objects hash to the same value
        //return getBrand().length() + getVolume();
        return Objects.hash(getBrand(), getVolume());
    }

    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Television) {
            Television other = (Television) obj;

            result = Objects.equals(this.getBrand(), other.getBrand()) &&   // null-safe check set up
                    this.getVolume() == other.getVolume();        // primitatives cannot be null
        }
        return result;
    }

    Television otherTelevision = new Television();
    public int compareTo(Television otherTelevision) {
        return this.getBrand().compareTo(otherTelevision.getBrand());
    }

    public String toString() {
        return String.format("Television [Brand: %s, Volume: %s]", getBrand(), getVolume());
        }


    // Television tv = new Television();


}
