package com.lnu.designing.builder;

import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.floor.Floor;

public interface BuildingBuilder {
    BuildingBuilder createNewBuilding();

    BuildingBuilder setFloor(Floor floor);

    BuildingBuilder setElevator(Elevator elevator);

    Building build();
}
