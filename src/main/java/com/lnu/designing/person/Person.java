package com.lnu.designing.person;

public class Person  {
    private int floorNumber;
    private int floorNumberToGo;
    private double weight;

    public Person(int floorNumber, int floorNumberToGo, double weight) {
        this.floorNumber = floorNumber;
        this.floorNumberToGo = floorNumberToGo;
        this.weight = weight;

    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getFloorNumberToGo() {
        return floorNumberToGo;
    }

    public double getWeight() {
        return weight;
    }
}