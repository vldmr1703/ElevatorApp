package com.lnu.designing.elevator.moving.strategy;

import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.elevator.MovingDirection;

public interface MovingStrategy {
    void move(Elevator elevator, Dispatcher dispatcher, MovingDirection direction);
}
