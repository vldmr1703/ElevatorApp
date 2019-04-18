package com.lnu.designing.mediator;

import com.lnu.designing.elevator.MovingDirection;
import com.lnu.designing.ui.View;

import java.util.List;

public interface Presenter {
    void startMoving(int elevatorId, MovingDirection direction);
    void stopMoving(int elevatorId);
    void returnFloor(int elevatorId, int floor);
    void openDoor(int elevatorId);
    void closeDoor(int elevatorId);
    void removePeopleFromElevator(List<Integer> peopleIds, int elevatorId);
    void addPeopleToElevatorOnFloor(List<Integer> peopleIds, int floorId);
    void addFloorToQueue(int elevatorId, int floorId);
    void addPeopleToFloor(List<Integer> peopleIds, int floorId);
    void registerView(View elevators);
}
