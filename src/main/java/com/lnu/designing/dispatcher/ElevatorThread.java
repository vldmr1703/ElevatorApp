package com.lnu.designing.dispatcher;

import com.lnu.designing.elevator.Elevator;

public class ElevatorThread implements Runnable {

    private Elevator elevator;

    public ElevatorThread(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void run() {
//        elevator.move();
    }
}
