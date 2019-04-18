package com.lnu.designing.builder;

import com.lnu.designing.floor.Floor;
import com.lnu.designing.elevator.Elevator;

public class BuildingBuilder implements Builder {
    private Building building;

    public BuildingBuilder() {
        building = new Building();
    }

    public BuildingBuilder setFloor(Floor floor) {
        building.setFloor(floor);
        return this;
    }

    public BuildingBuilder setElevator(Elevator elevator) {
        building.setElevator(elevator);
        return this;
    }

    @Override
    public Building build() {
        Building builtBuilding = new Building();
        builtBuilding.setFloorList(building.getFloorList());
        builtBuilding.setElevatorList(building.getElevatorList());
        return builtBuilding;
    }
}