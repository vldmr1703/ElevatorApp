package com.lnu.designing.facade;


import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.elevator.moving.strategy.MovingStrategy;

public class ElevatorDto {
    private int elevatorId;
    private int maxWeight;
    private MovingStrategy elevatorStrategy;
    private Dispatcher dispatcher;

    public ElevatorDto(int elevatorId, int maxWeight, MovingStrategy elevatorStrategy) {
        this.elevatorId = elevatorId;
        this.maxWeight = maxWeight;
        this.elevatorStrategy = elevatorStrategy;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public MovingStrategy getMovingStrategy() {
        return elevatorStrategy;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
}
