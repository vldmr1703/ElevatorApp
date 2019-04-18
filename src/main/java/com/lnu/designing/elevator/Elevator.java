package com.lnu.designing.elevator;

import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.elevator.moving.strategy.MovingStrategy;
import com.lnu.designing.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    protected int elevatorId;
    protected int currentFloor;
    protected double maxWeight;
    protected ElevatorState elevatorState;
    protected List<Person> people;
    protected List<Integer> orders;
    protected Dispatcher dispatcher;
    private MovingStrategy movingStrategy;

    public Elevator() {
        elevatorState = ElevatorState.STOP;
        orders = new ArrayList<>();
        currentFloor = 0;
    }

    public void setElevatorId(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public MovingStrategy getMovingStrategy() {
        return movingStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public List<Integer> getOrders() {
        return orders;
    }

    public final void closeDoor() {
        dispatcher.closeDoor(elevatorId);
    }

    public final void openDoor() {
        dispatcher.openDoor(elevatorId);
    }

    public void move(MovingDirection direction){
        movingStrategy.move(this, dispatcher, direction);
    };//

//    public abstract void addOrder(int floorId);
}
