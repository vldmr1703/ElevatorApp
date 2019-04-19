package com.lnu.designing.builder.impl;

import com.lnu.designing.builder.Building;
import com.lnu.designing.builder.BuildingBuilder;
import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.floor.Floor;

public class BuildingBuilderImpl implements BuildingBuilder {
    private Building building;

    @Override
    public BuildingBuilder createNewBuilding() {
        building = new Building();
        return this;
    }

    @Override
    public BuildingBuilder setFloor(Floor floor) {
        building.setFloor(floor);
        return this;
    }

    @Override
    public BuildingBuilder setElevator(Elevator elevator) {
        building.setElevator(elevator);
        return this;
    }

    @Override
    public Building build() {
        return building;
    }
}