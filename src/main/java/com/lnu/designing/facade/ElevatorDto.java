package com.lnu.designing.facade;


import com.lnu.designing.elevator.moving.strategy.MovingStrategy;

public class ElevatorDto {
    private int ElevatorId;
    private int maxWeight;
    private MovingStrategy elevatorStrategy;

    public ElevatorDto(int elevatorId, int maxWeight, MovingStrategy elevatorStrategy) {
        ElevatorId = elevatorId;
        this.maxWeight = maxWeight;
        this.elevatorStrategy = elevatorStrategy;
    }

    public int getElevatorId() {
        return ElevatorId;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public MovingStrategy getMovingStrategy() {
        return elevatorStrategy;
    }
}
