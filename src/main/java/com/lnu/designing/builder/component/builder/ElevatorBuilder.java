package com.lnu.designing.builder.component.builder;

import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.elevator.ElevatorState;
import com.lnu.designing.elevator.moving.strategy.MovingStrategy;

public interface ElevatorBuilder {
    ElevatorBuilder createNewElevator();

    int getElevatorId();

    ElevatorBuilder setElevatorId(int elevatorId);

    ElevatorBuilder setMaxWeight(int maxWeight);

    ElevatorBuilder setCurrentFloor(int currentFloor);

    ElevatorBuilder setElevatorState(ElevatorState elevatorState);

    ElevatorBuilder setMovingStrategy(MovingStrategy movingStrategy);

    Elevator build();
}
