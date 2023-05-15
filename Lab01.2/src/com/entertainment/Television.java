package com.entertainment;

public class Television {

    private String brand;
    private int volume;
    private Tuner tuner = new Tuner();
    public String Brand() {
        return brand;
    }

    Television(){}

    Television(String brand,int volume){
    }

    public String getBrand() {
        return brand;
    }

    public Tuner getTuner() {
        return tuner;
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
    public int getCurrentChannel(){
        return tuner.getChannel();
    }

    public void changeChannel(int channel){tuner.setChannel(channel);}

    public String toString() {
        String.format(" Television [Brand: %s, Channel: %s]", getBrand(), getVolume());
    }
    // Television tv = new Television();
}
