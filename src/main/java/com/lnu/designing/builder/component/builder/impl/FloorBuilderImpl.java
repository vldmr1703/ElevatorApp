package com.lnu.designing.builder.component.builder.impl;


import com.lnu.designing.builder.component.builder.FloorBuilder;
import com.lnu.designing.floor.Floor;
import com.lnu.designing.floor.incoming.strategy.IncomingStrategy;
import com.lnu.designing.person.Person;

public class FloorBuilderImpl implements FloorBuilder {

    private Floor floor;

    @Override
    public FloorBuilder createNewFloor() {
        floor = new Floor();
        return this;
    }

    @Override
    public FloorBuilder setNumber(int number) {
        floor.setNumber(number);
        return this;
    }

    @Override
    public FloorBuilder setIncomingStrategy(IncomingStrategy incomingStrategy) {
        floor.setIncomingStrategy(incomingStrategy);
        return this;
    }

    @Override
    public FloorBuilder setPerson(Person person) { //not in the same floor
        floor.setPerson(person);
        return this;
    }

    @Override
    public Floor build() {
        return floor;
    }
}
