package com.lnu.designing.facade;

import com.lnu.designing.builder.Building;
import com.lnu.designing.builder.BuildingDirector;
import com.lnu.designing.builder.outcomponents.IncomingStrategy;
import com.lnu.designing.elevator.moving.strategy.impl.WithStopElevatorStrategy;
import com.lnu.designing.person.PersonGenerator;

import java.util.ArrayList;
import java.util.List;


public class Facade {
    private int numberOfFoors;
    private int numberOfElevators;

    //+ mediator
    private BuildingDirector buildingDirector = new BuildingDirector();
    private PersonGenerator personGenerator;

    public void UITest() {
        List<FloorDto> floorDtoList = new ArrayList<>();
        List<ElevatorDto> elevatorDtoList = new ArrayList<>();

        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.RANDOM_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.RANDOM_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.ORDERING_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.RANDOM_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.RANDOM_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.ORDERING_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.ORDERING_STRATEGY));

        elevatorDtoList.add(new ElevatorDto(++numberOfElevators, 500, new WithStopElevatorStrategy()));
        elevatorDtoList.add(new ElevatorDto(++numberOfElevators, 500, new WithStopElevatorStrategy()));
        elevatorDtoList.add(new ElevatorDto(++numberOfElevators, 500, new WithStopElevatorStrategy()));
        elevatorDtoList.add(new ElevatorDto(++numberOfElevators, 500, new WithStopElevatorStrategy()));

        Building building = buildingDirector.construct(floorDtoList, elevatorDtoList);


//        PersonGenerator personGenerator = new PersonGenerator(building);

        System.out.println("Test");
    }
}
