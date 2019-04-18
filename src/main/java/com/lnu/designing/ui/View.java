package com.lnu.designing.ui;

import com.lnu.designing.builder.Building;
import com.lnu.designing.builder.BuildingDirector;
import com.lnu.designing.builder.outcomponents.IncomingStrategy;
import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.elevator.MovingDirection;
import com.lnu.designing.elevator.moving.strategy.impl.WithStopElevatorStrategy;
import com.lnu.designing.facade.ElevatorDto;
import com.lnu.designing.facade.FloorDto;
import com.lnu.designing.mediator.MainPresenter;
import com.lnu.designing.mediator.Presenter;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class View extends JFrame {

    public final static int WIN_WIDTH = 600;
    public final static int WIN_HEIGHT = 700;
    private Presenter mediator;
    private Panel panel;
    JTextField field;


    public View(Presenter mediator, Panel panel) {
        this.mediator = mediator;
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panel = panel;
//        panel.start();
        field = new JTextField(5);
        field.setBounds(0,0, 50,50);
        panel.add(field);
        add(panel);
        setVisible(true);
    }

    public void returnFloor(int elevatorId, int floor){
        field.setText(String.valueOf(floor));
        panel.repaint();
        panel.elevators.get(elevatorId - 1).update();
    }

    public static void main(String[] args) {
        List<FloorDto> floorDtoList = new ArrayList<>();
        List<ElevatorDto> elevatorDtoList = new ArrayList<>();
        int numberOfFoors = 0;
        int numberOfElevators = 0;

        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.RANDOM_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.RANDOM_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.ORDERING_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.RANDOM_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.RANDOM_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.ORDERING_STRATEGY));
        floorDtoList.add(new FloorDto(++numberOfFoors, IncomingStrategy.ORDERING_STRATEGY));

        elevatorDtoList.add(new ElevatorDto(++numberOfElevators, 500, new WithStopElevatorStrategy()));
        elevatorDtoList.add(new ElevatorDto(++numberOfElevators, 500, new WithStopElevatorStrategy()));
        elevatorDtoList.add(new ElevatorDto(++numberOfElevators, 500, new WithStopElevatorStrategy()));
        elevatorDtoList.add(new ElevatorDto(++numberOfElevators, 500, new WithStopElevatorStrategy()));

        BuildingDirector buildingDirector = new BuildingDirector();
        Building building = buildingDirector.construct(floorDtoList, elevatorDtoList);

        Presenter presenter = new MainPresenter();
        Map<Integer, Integer> coords = new HashMap<>();
        coords.put(2, 500);
        coords.put(202, 500);
        Panel panel = new Panel(coords);
        View el = new View(presenter, panel);
        presenter.registerView(el);
        Dispatcher dispatcher = new Dispatcher(building, presenter);
        for (Elevator dto: building.getElevatorList()){
            dto.setDispatcher(dispatcher);
//            dto.getOrders().add(1);
//            dto.getOrders().add(2);
//            dto.getOrders().add(3);
//            dto.getOrders().add(4);
//            dto.getOrders().add(5);
//            dto.getOrders().add(6);
        }
        building.getElevatorList().get(0).getOrders().add(1);
        building.getElevatorList().get(0).getOrders().add(2);
        building.getElevatorList().get(0).getOrders().add(3);
        building.getElevatorList().get(0).getOrders().add(4);
        building.getElevatorList().get(0).getOrders().add(5);
        building.getElevatorList().get(0).getOrders().add(6);
        building.getElevatorList().get(1).getOrders().add(1);
        building.getElevatorList().get(1).getOrders().add(2);
        building.getElevatorList().get(1).getOrders().add(3);
        dispatcher.startMoving(1, MovingDirection.UP);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dispatcher.startMoving(2, MovingDirection.UP);
    }

    public void start(){
        panel.start();
    }

    public void stop(){
        panel.stop();
    }
}
