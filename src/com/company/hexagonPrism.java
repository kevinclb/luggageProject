package com.company;


public class hexagonPrism extends luggage {
    public float baseEdge;
    public float height;
    public float rt = 2.6f;

    public hexagonPrism(float baseEdge,float height){
        this.type = "Hexagonal Prism";
        this.baseEdge = baseEdge;
        this.height = height;
        calculateVolume();
    }

    public void calculateVolume(){
        this.volume = rt * (baseEdge * baseEdge) * this.height;
    }

    public String toString(){
        return "Luggage type: " + this.type + "Luggage volume: " + this.volume;
    }
}


