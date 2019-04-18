package com.lnu.designing.elevator.moving.strategy.impl;

import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.elevator.MovingDirection;
import com.lnu.designing.elevator.moving.strategy.MovingStrategy;

public class WithStopElevatorStrategy implements MovingStrategy {

    @Override
    public void move(Elevator elevator, Dispatcher dispatcher, MovingDirection direction) {
//        int elevatorId = elevator.getElevatorId();
//        List<Integer> orders = elevator.getOrders();
//        if (direction.equals(MovingDirection.UP)) {
//            elevator.setElevatorState(ElevatorState.MOVE_UP);
//        } else {
//            elevator.setElevatorState(ElevatorState.MOVE_DOWN);
//        }
//        int maxFloor = Collections.max(orders);
//        dispatcher.startMovingView(elevatorId, direction);
//        for (; elevator.getCurrentFloor() < maxFloor; elevator.currentFloor++) {
//            dispatcher.returnFloor(elevatorId, elevator.currentFloor);
//            stopMovingIfIsOrder(elevator.currentFloor, direction);
//            orders.remove(elevator.currentFloor);
//            System.out.println(elevator.currentFloor);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        dispatcher.stopMovingView(elevatorId);
    }

    private void stopMovingIfIsOrder(int floorId, Elevator elevator, Dispatcher dispatcher, MovingDirection direction) {
//        if (elevator.orders.contains(floorId)) {
//            dispatcher.stopMovingView(elevator.elevatorId);
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            dispatcher.startMovingView(elevatorId, direction);
//        }
    }

//    @Override
    public void addOrder(int floorId) {
//        if (elevatorState.equals(ElevatorState.MOVE_UP) && currentFloor <= floorId) {
//            orders.add(floorId);
//            orders.sort(Comparator.comparingInt(o -> o));
//        } else if (elevatorState.equals(ElevatorState.MOVE_DOWN) && currentFloor >= floorId) {
//            orders.sort(Comparator.comparingInt(o -> -o));
//            orders.add(floorId);
//        }
    }
}
