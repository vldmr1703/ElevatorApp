package com.lnu.designing.builder.componentBuilder;

import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.elevator.ElevatorState;
import com.lnu.designing.elevator.moving.strategy.MovingStrategy;

public class ElevatorBuilder {
    private Elevator elevator;

    public ElevatorBuilder() {
        elevator = new Elevator();
    }

    public ElevatorBuilder setElevatorId(int elevatorId) {
        elevator.setElevatorId(elevatorId);
        return this;
    }

    public ElevatorBuilder setDispatcher(Dispatcher dispatcher){
        elevator.setDispatcher(dispatcher);
        return this;
    }

    public ElevatorBuilder setMaxWeight(int maxWeight){
        elevator.setMaxWeight(maxWeight);
        return this;
    }

    public ElevatorBuilder setCurrentFloor(int currentFloor) {
        elevator.setCurrentFloor(currentFloor);
        return this;
    }

    public ElevatorBuilder setElevatorState(ElevatorState elevatorState){
        elevator.setElevatorState(elevatorState);
        return this;
    }

    public ElevatorBuilder setMovingStrategy(MovingStrategy movingStrategy){
        elevator.setMovingStrategy(movingStrategy);
        return this;
    }

//    public ElevatorBuilder setPerson(Person person){
//        elevator.setPerson(person);
//        return this;
//    }

    public Elevator build(){
        Elevator builtElevator = new Elevator();
        builtElevator.setElevatorId(elevator.getElevatorId());
        builtElevator.setMaxWeight(elevator.getMaxWeight());
        builtElevator.setCurrentFloor(elevator.getCurrentFloor());
        builtElevator.setElevatorState(elevator.getElevatorState());
        builtElevator.setMovingStrategy(elevator.getMovingStrategy());
        return builtElevator;
    }
}
