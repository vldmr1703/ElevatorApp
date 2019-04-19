package com.lnu.designing.main;

import com.lnu.designing.builder.Building;
import com.lnu.designing.builder.BuildingDirector;
import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.person.PersonGenerator;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int TIMEOUT_DELAY = 15;

    public static void main(String[] args) {
        BuildingDirector buildingDirector = new BuildingDirector();
        Building building = buildingDirector.construct(7, 4);

        Dispatcher dispatcher = new Dispatcher(building, null);
        PersonGenerator personGenerator = new PersonGenerator(building, dispatcher);


//            building.getElevatorList().stream().forEach(
//                    e ->{ building.getFloorList().get(e.getCurrentFloor()-1).reorderQueue(e);
//                    Executors.newScheduledThreadPool(1).scheduleAtFixedRate(() -> {}, 0, TIMEOUT_DELAY, TimeUnit.SECONDS);
//
//            );
//        }
//        personGenerator.startGenerating();

        System.out.println("Test");
    }
}
