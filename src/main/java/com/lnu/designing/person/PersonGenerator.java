package com.lnu.designing.person;


import com.lnu.designing.dispatcher.Dispatcher;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class PersonGenerator {
  private Dispatcher dispatcher;
  private static final double MAX_PERSON_WEIGHT = 100;
  private static final double MIN_PERSON_WEIGHT = 15;
  private static final int TIMEOUT_DELAY = 15;

  private int buildingHeight;

  public PersonGenerator(Dispatcher dispatcher, int buildingHeight) {
    this.dispatcher = dispatcher;
    this.buildingHeight = buildingHeight;
  }

  public void startGenerating() {
    ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1);
    scheduledThreadPool.scheduleAtFixedRate(this::generatePerson, 0, TIMEOUT_DELAY, TimeUnit.SECONDS);
  }

  public void generatePerson() {
    int floorNumber = ThreadLocalRandom.current().nextInt(buildingHeight);
    int floorNumberToGo;
    do {
      floorNumberToGo = ThreadLocalRandom.current().nextInt(buildingHeight);
    } while (floorNumber == floorNumberToGo);

    double weight = ThreadLocalRandom.current().nextDouble(MIN_PERSON_WEIGHT, MAX_PERSON_WEIGHT);

    dispatcher.addPeopleToFloor(new Person(floorNumber, floorNumberToGo, weight));
  }
}
