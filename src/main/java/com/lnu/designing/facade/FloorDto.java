package com.lnu.designing.facade;


import com.lnu.designing.builder.outcomponents.IncomingStrategy;

public class FloorDto {
    private int number;
    private IncomingStrategy incomingStrategy;

    public FloorDto(int number, IncomingStrategy incomingStrategy) {
        this.number = number;
        this.incomingStrategy = incomingStrategy;
    }

    public int getNumber() {
        return number;
    }

    public IncomingStrategy getIncomingStrategy() {
        return incomingStrategy;
    }
}
