package com.lnu.designing.person;


import com.lnu.designing.builder.Building;
import com.lnu.designing.dispatcher.Dispatcher;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 15.04.2019.
 */
public class PersonGenerator {
    private Building building;
    private Dispatcher dispatcher;
    private static final double MAX_PERSON_WEIGHT = 100;
    private static final double MIN_PERSON_WEIGHT = 15;
    private static final int TIMEOUT_DELAY = 3;

    public PersonGenerator(Building building, Dispatcher dispatcher) {
        this.building = building;
        this.dispatcher = dispatcher;
    }

    public void startGenerating() {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1);
        scheduledThreadPool.scheduleAtFixedRate(() -> {
            generatePerson();
            building.getFloorList().forEach(f ->
                    f.getPersonList().forEach(p->System.out.println(p.getFloorNumber())));
        }, 0, TIMEOUT_DELAY, TimeUnit.SECONDS);
    }



    public void generatePerson() {
        System.out.println("Generate Person");
        int floorNumber = ThreadLocalRandom.current().nextInt(building.getFloorList().size() );
        int floorNumberToGo = floorNumber;
        do {
            floorNumberToGo = ThreadLocalRandom.current().nextInt(building.getFloorList().size());
        } while (floorNumber == floorNumberToGo);

        double weight = ThreadLocalRandom.current().nextDouble(MIN_PERSON_WEIGHT, MAX_PERSON_WEIGHT);

        building.getFloorList().get(floorNumber).getPersonList().add(new Person(floorNumber, floorNumberToGo, weight));
        System.out.println("Done");
    }
}
