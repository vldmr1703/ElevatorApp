package com.lnu.designing.mediator;

import com.lnu.designing.elevator.MovingDirection;
import com.lnu.designing.ui.View;

import java.util.List;

public class MainPresenter implements Presenter {

    private View view;

    @Override
    public void startMoving(int elevatorId, MovingDirection direction) {

    }

    @Override
    public void stopMoving(int elevatorId) {

    }

    @Override
    public void returnFloor(int elevatorId, int floor) {

    }

    @Override
    public void openDoor(int elevatorId) {

    }

    @Override
    public void closeDoor(int elevatorId) {

    }

    @Override
    public void removePeopleFromElevator(List<Integer> peopleIds, int elevatorId) {

    }

    @Override
    public void addPeopleToElevatorOnFloor(List<Integer> peopleIds, int floorId) {

    }

    @Override
    public void addFloorToQueue(int elevatorId, int floorId) {

    }

    @Override
    public void addPeopleToFloor(List<Integer> peopleIds, int floorId) {

    }

    public void registerView(View elevators) {
        this.view = elevators;
    }

}
