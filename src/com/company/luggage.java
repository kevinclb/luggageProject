package com.company;

abstract class luggage implements Comparable<luggage> {
    public float volume;
    public String type;
    public luggage(){
    }
    public void setType(String type){
        this.type = type;
    }
    public int compareTo(luggage luggageInput){
        return Float.compare(this.volume, luggageInput.volume);
    }
    public String toString(){
        return "\nThis type: " + this.type + "  This volume: " + this.volume;
    }
}
