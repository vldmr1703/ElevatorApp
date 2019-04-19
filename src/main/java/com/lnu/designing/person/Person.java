package com.lnu.designing.person;

public class Person  {
    private int floorId;
    private int floorIdToGo;
    private double weight;


    public Person(int floorNumber, int floorIdToGo, double weight) {
        this.floorId = floorNumber;
        this.floorIdToGo = floorIdToGo;
        this.weight = weight;

    }

    public int getFloorId() {
        return floorId;
    }

    public int getFloorIdToGo() {
        return floorIdToGo;
    }

    public double getWeight() {
        return weight;
    }
}