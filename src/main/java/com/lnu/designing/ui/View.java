package com.lnu.designing.ui;

import com.lnu.designing.builder.Building;
import com.lnu.designing.builder.BuildingDirector;
import com.lnu.designing.dispatcher.Dispatcher;
import com.lnu.designing.elevator.Elevator;
import com.lnu.designing.elevator.MovingDirection;
import com.lnu.designing.mediator.MainPresenter;
import com.lnu.designing.mediator.Presenter;

import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

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
        field.setBounds(0, 0, 50, 50);
        panel.add(field);
        add(panel);
        setVisible(true);
    }

    public void returnFloor(int elevatorId, int floor) {
        field.setText(String.valueOf(floor));
        panel.repaint();
        panel.elevators.get(elevatorId - 1).update();
    }

    public static void main(String[] args) {
//        Dispatcher dispatcher = new Dispatcher(null, null);
        BuildingDirector buildingDirector = new BuildingDirector(null);
        Building building = buildingDirector.construct(7, 4);


        Presenter presenter = new MainPresenter();
        Map<Integer, Integer> coords = new HashMap<>();
        coords.put(2, 500);
        coords.put(202, 500);
        Panel panel = new Panel(coords);
        View el = new View(presenter, panel);
        presenter.registerView(el);
        Dispatcher dispatcher = new Dispatcher(building, presenter);
        for (Elevator dto : building.getElevatorList()) {
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

    public void start() {
        panel.start();
    }

    public void stop() {
        panel.stop();
    }
}
