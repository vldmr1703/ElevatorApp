package com.lnu.designing.floor.incoming.strategy;

import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.person.Person;

import java.util.List;

public interface IncomingStrategy {
    void reorderQueue(List<Person> personList, Elevator elevator);

}
