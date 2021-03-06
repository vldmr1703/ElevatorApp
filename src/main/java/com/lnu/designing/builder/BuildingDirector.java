package com.lnu.designing.builder;

import com.lnu.designing.builder.component.builder.ElevatorBuilder;
import com.lnu.designing.builder.component.builder.FloorBuilder;

import com.lnu.designing.builder.component.builder.impl.ElevatorBuilderImpl;
import com.lnu.designing.builder.component.builder.impl.FloorBuilderImpl;


import com.lnu.designing.builder.impl.BuildingBuilderImpl;
import com.lnu.designing.builder.outcomponents.IncomingStrategyType;
import com.lnu.designing.builder.outcomponents.MovingStrategyType;
import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.elevator.ElevatorState;
import com.lnu.designing.elevator.moving.strategy.MovingStrategy;
import com.lnu.designing.elevator.moving.strategy.impl.WithStopElevatorStrategy;
import com.lnu.designing.elevator.moving.strategy.impl.WithoutStopElevatorStrategy;
import com.lnu.designing.floor.incoming.strategy.IncomingStrategy;
import com.lnu.designing.floor.incoming.strategy.impl.OrderingIncomingStrategy;
import com.lnu.designing.floor.incoming.strategy.impl.RandomIncomingStrategy;

import java.util.EnumMap;

public class BuildingDirector {
    public static final int MAX_WEIGHT = 500;

    private BuildingBuilder buildingBuilder;
    private ElevatorBuilder elevatorBuilder;
    private FloorBuilder floorBuilder;
    private Dispatcher dispatcher;


    private static EnumMap<IncomingStrategyType, IncomingStrategy> incomingStrategyEnumMap = new EnumMap<>(IncomingStrategyType.class);
    private static EnumMap<MovingStrategyType, MovingStrategy> movingStrategyEnumMap = new EnumMap<>(MovingStrategyType.class);

    static {
        incomingStrategyEnumMap.put(IncomingStrategyType.ORDERING_STRATEGY, new OrderingIncomingStrategy());
        incomingStrategyEnumMap.put(IncomingStrategyType.RANDOM_STRATEGY, new RandomIncomingStrategy());

        movingStrategyEnumMap.put(MovingStrategyType.WITH_STOP_STRATEGY, new WithStopElevatorStrategy());
        movingStrategyEnumMap.put(MovingStrategyType.WITHOUT_STOP_STRATEGY, new WithoutStopElevatorStrategy());
    }

    public BuildingDirector(Dispatcher dispatcher) {
        buildingBuilder = new BuildingBuilderImpl();
        elevatorBuilder = new ElevatorBuilderImpl();
        floorBuilder = new FloorBuilderImpl();
        this.dispatcher = dispatcher;
    }

    public Building construct(int numberOfFloors, int numberOfElevators) {
        buildingBuilder.createNewBuilding();
        addFloors(numberOfFloors);
        addElevators(numberOfElevators);
        return buildingBuilder.build();
    }

    private void addFloors(int numberOfFloors) {
        for (int floorIndex = 1; floorIndex <= numberOfFloors; floorIndex++) {
            buildingBuilder.setFloor(
                    floorBuilder.createNewFloor()
                            .setFloorId(floorIndex)
                            .setIncomingStrategy(incomingStrategyEnumMap.get(IncomingStrategyType.getRandomIncomingStrategy()))
                            .build());
        }
    }

    private void addElevators(int numberOfElevators) {
        for (int elevatorIndex = 1; elevatorIndex <= numberOfElevators; elevatorIndex++) {
            buildingBuilder.setElevator(
                    elevatorBuilder.createNewElevator()
                            .setElevatorId(elevatorIndex)
                            .setDispatcher(dispatcher)
                            .setMaxWeight(MAX_WEIGHT)
                            .setElevatorState(ElevatorState.STOP)
                            .setMovingStrategy(movingStrategyEnumMap.get(MovingStrategyType.getRandomMovingStrategyType()))
                            .build());

        }
    }
}
