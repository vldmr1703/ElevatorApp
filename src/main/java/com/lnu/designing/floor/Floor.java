package com.lnu.designing.floor;

import com.lnu.designing.builder.outcomponents.IncomingStrategyType;
import com.lnu.designing.floor.incoming.strategy.IncomingStrategy;
import com.lnu.designing.person.Person;

import java.util.ArrayList;
import java.util.List;


public class Floor {
    private int number;
    private List<Person> personList;
    private IncomingStrategy incomingStrategy;

    public Floor() {
        personList = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
}
