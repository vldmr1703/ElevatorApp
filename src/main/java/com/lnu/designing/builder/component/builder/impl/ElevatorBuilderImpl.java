package com.lnu.designing.builder.component.builder.impl;

import com.lnu.designing.builder.component.builder.ElevatorBuilder;
import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.elevator.ElevatorState;
import com.lnu.designing.elevator.moving.strategy.MovingStrategy;

public class ElevatorBuilderImpl implements ElevatorBuilder {
    private Elevator elevator;

    @Override
    public ElevatorBuilder createNewElevator() {
        elevator = new Elevator();
        return this;
    }

    @Override
    public ElevatorBuilder setElevatorId(int elevatorId) {
        elevator.setElevatorId(elevatorId);
        return this;
    }

    @Override
    public ElevatorBuilder setDispatcher(Dispatcher dispatcher) {
        elevator.setDispatcher(dispatcher);
        return this;
    }

    @Override
    public ElevatorBuilder setMaxWeight(int maxWeight) {
        elevator.setMaxWeight(maxWeight);
        return this;
    }

    @Override
    public ElevatorBuilder setElevatorState(ElevatorState elevatorState) {
        elevator.setElevatorState(elevatorState);
        return this;
    }

    @Override
    public ElevatorBuilder setMovingStrategy(MovingStrategy movingStrategy) {
        elevator.setMovingStrategy(movingStrategy);
        return this;
    }

    @Override
    public Elevator build() {
        return elevator;
    }
}
