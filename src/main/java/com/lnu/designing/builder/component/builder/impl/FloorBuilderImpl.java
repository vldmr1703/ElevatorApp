package com.lnu.designing.builder.component.builder.impl;


import com.lnu.designing.builder.component.builder.FloorBuilder;
import com.lnu.designing.floor.Floor;
import com.lnu.designing.floor.incoming.strategy.IncomingStrategy;

public class FloorBuilderImpl implements FloorBuilder {

    private Floor floor;

    @Override
    public FloorBuilder createNewFloor() {
        floor = new Floor();
        return this;
    }

    @Override
    public FloorBuilder setFloorId(int number) {
        floor.setFloorId(number);
        return this;
    }

    @Override
    public FloorBuilder setIncomingStrategy(IncomingStrategy incomingStrategy) {
        floor.setIncomingStrategy(incomingStrategy);
        return this;
    }

    @Override
    public Floor build() {
        return floor;
    }
}
