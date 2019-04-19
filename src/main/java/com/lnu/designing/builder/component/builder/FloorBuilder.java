package com.lnu.designing.builder.component.builder;

import com.lnu.designing.floor.Floor;
import com.lnu.designing.floor.incoming.strategy.IncomingStrategy;

public interface FloorBuilder {
    FloorBuilder createNewFloor();

    FloorBuilder setFloorId(int number);

    FloorBuilder setIncomingStrategy(IncomingStrategy incomingStrategy);

    Floor build();
}
