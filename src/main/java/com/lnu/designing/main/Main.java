package com.lnu.designing.main;

import com.lnu.designing.builder.Building;
import com.lnu.designing.builder.BuildingDirector;

public class Main {

    public static void main(String[] args) {
        BuildingDirector buildingDirector = new BuildingDirector();
        Building building = buildingDirector.construct(7, 4);


//        PersonGenerator personGenerator = new PersonGenerator(building);

        System.out.println("Test");
    }
}
