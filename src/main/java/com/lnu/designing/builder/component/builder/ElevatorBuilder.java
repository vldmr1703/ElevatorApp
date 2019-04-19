package com.lnu.designing.builder.component.builder;

import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.elevator.ElevatorState;
import com.lnu.designing.elevator.moving.strategy.MovingStrategy;

public interface ElevatorBuilder {
    ElevatorBuilder createNewElevator();

    ElevatorBuilder setElevatorId(int elevatorId);

    ElevatorBuilder setDispatcher(Dispatcher dispatcher);

    ElevatorBuilder setMaxWeight(int maxWeight);

    ElevatorBuilder setElevatorState(ElevatorState elevatorState);

    ElevatorBuilder setMovingStrategy(MovingStrategy movingStrategy);

    Elevator build();
}
