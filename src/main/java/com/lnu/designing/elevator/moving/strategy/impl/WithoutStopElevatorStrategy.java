package com.lnu.designing.elevator.moving.strategy.impl;

import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.elevator.MovingDirection;
import com.lnu.designing.elevator.moving.strategy.MovingStrategy;

public class WithoutStopElevatorStrategy implements MovingStrategy {
    @Override
    public void move(Elevator elevator, Dispatcher dispatcher, MovingDirection direction) {

    }
}
