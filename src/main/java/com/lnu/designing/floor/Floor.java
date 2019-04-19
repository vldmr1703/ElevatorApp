package com.lnu.designing.floor;

import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.floor.incoming.strategy.IncomingStrategy;
import com.lnu.designing.person.Person;

import java.util.ArrayList;
import java.util.List;


public class Floor {
    private int floorId;
    private List<Person> personList;
    private IncomingStrategy incomingStrategy;

    public Floor() {
        personList = new ArrayList<>();
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public IncomingStrategy getIncomingStrategy() {
        return incomingStrategy;
    }

    public void setIncomingStrategy(IncomingStrategy incomingStrategy) {
        this.incomingStrategy = incomingStrategy;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPerson(Person person) {
        personList.add(person);
    }

    public void reorderQueue(Elevator elevator){
        incomingStrategy.reorderQueue(personList, elevator);//direction  floor to go lift
//        personList
    }
}
