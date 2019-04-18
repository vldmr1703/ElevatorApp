package com.lnu.designing.builder.componentBuilder;


import com.lnu.designing.floor.Floor;
import com.lnu.designing.builder.outcomponents.IncomingStrategy;
import com.lnu.designing.person.Person;

public class FloorBuilder {

    private Floor floor;

    public FloorBuilder() {
        floor = new Floor();
    }

    public FloorBuilder setNumber(int number) {
        floor.setNumber(number);
        return this;
    }

    public FloorBuilder setIncomingStrategy(IncomingStrategy incomingStrategy) {
        floor.setIncomingStrategy(incomingStrategy);
        return this;
    }

    public FloorBuilder setPerson(Person person) { //not in the same floor
        floor.setPerson(person);
        return this;
    }

    public Floor build(){
        Floor builtFloor = new Floor();
        builtFloor.setNumber(floor.getNumber());
        builtFloor.setIncomingStrategy(floor.getIncomingStrategy());
        return builtFloor;
    }
}
