package com.lnu.designing.builder.component.builder;

import com.lnu.designing.floor.Floor;
import com.lnu.designing.floor.incoming.strategy.IncomingStrategy;
import com.lnu.designing.person.Person;

public interface FloorBuilder {
    FloorBuilder createNewFloor();

    FloorBuilder setNumber(int number);

    FloorBuilder setIncomingStrategy(IncomingStrategy incomingStrategy);

    FloorBuilder setPerson(Person person);

    Floor build();
}
