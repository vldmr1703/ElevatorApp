package com.lnu.designing.builder;

import com.lnu.designing.builder.componentBuilder.ElevatorBuilder;
import com.lnu.designing.builder.componentBuilder.FloorBuilder;
import com.lnu.designing.elevator.ElevatorState;
import com.lnu.designing.facade.ElevatorDto;
import com.lnu.designing.facade.FloorDto;

import java.util.List;

public class BuildingDirector {
    private BuildingBuilder buildingBuilder = new BuildingBuilder();
    private ElevatorBuilder elevatorBuilder = new ElevatorBuilder();
    private FloorBuilder floorBuilder = new FloorBuilder();


    public Building construct(List<FloorDto> floorDtoList, List<ElevatorDto> elevatorDtoList) {
        addFloors(floorDtoList);
        addElevators(elevatorDtoList);
        return buildingBuilder.build();
    }

    private void addFloors(List<FloorDto> floorDtoList) {
        for (FloorDto floorDto : floorDtoList) {
            buildingBuilder.setFloor(
                    floorBuilder.setNumber(floorDto.getNumber())
                            .setIncomingStrategy(floorDto.getIncomingStrategy())
                            .build());
        }
    }

    private void addElevators(List<ElevatorDto> elevatorDtoList) {
        for (ElevatorDto elevatorDto : elevatorDtoList) {
            buildingBuilder.setElevator(
                    elevatorBuilder.setElevatorId(elevatorDto.getElevatorId())
                            .setDispatcher(elevatorDto.getDispatcher())
                            .setMaxWeight(elevatorDto.getMaxWeight())
                            .setCurrentFloor(1)
                            .setElevatorState(ElevatorState.STOP)
                            .setMovingStrategy(elevatorDto.getMovingStrategy())
                            .build());

        }
    }
}
