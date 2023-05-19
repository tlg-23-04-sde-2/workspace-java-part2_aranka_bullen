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
        setBrand(brand);
        setVolume(volume);
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
     * To be consistent with equal we must use the same propertiesd
     */

    public int compareTo(Television otherTelevision){
       int result = this.getBrand().compareTo(otherTelevision.getBrand());

       if(result == 0){ // tied on the bran, break the tie by volume
           result = Integer(this.getVolume()).compareTo(otherTelevision.getVolume());
       }

       return result;
    }


    Television otherTelevision = new Television();
    public int compareTo(Television otherTelevision) {
        return this.getBrand().compareTo(otherTelevision.getBrand());
    }

    @Override //9:00 PT
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        Television that = (Television) o;

        return this.getVolume() == that.getVolume() && Objects.equals(this.getBrand(), that.getBrand())
                && Objects.equals(this.otherTelevision, that.otherTelevision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, volume, otherTelevision);
    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return volume == that.volume && Objects.equals(brand, that.brand) && Objects.equals(otherTelevision, that.otherTelevision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, volume, otherTelevision);
    }
*/


    public String toString() {
        return String.format("Television [Brand: %s, Volume: %s]", getBrand(), getVolume());
        }
*/

    // Television tv = new Television();


}
