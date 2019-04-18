package com.lnu.designing.ui;

import com.lnu.designing.mediator.Presenter;

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
        field.setBounds(0,0, 50,50);
        panel.add(field);
        add(panel);
        setVisible(true);
//        setSize(10, 10);
//        setVisible(true);

//        ElevatorView view = new ElevatorView(mediator);
//        mediator.registerView(view);
//        Elevator elevator = new Elevator(1, mediator);
//        elevator.getOrders().add(1);
//        elevator.getOrders().add(2);
//        elevator.getOrders().add(3);
//        elevator.getOrders().add(4);
//        elevator.getOrders().add(5);
//        elevator.getOrders().add(6);
//        Elevator elevator2 = new Elevator(1, mediator);
//        elevator2.getOrders().add(1);
//        elevator2.getOrders().add(2);
//        elevator2.getOrders().add(3);
//        elevator2.getOrders().add(4);
//        elevator2.getOrders().add(5);
//        elevator2.getOrders().add(6);
//        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//        ExecutorService service = Executors.newCachedThreadPool();
////        for(int i = 0; i < 10; i++) {
//        service.submit(() -> {
//            ScheduledExecutorService service1 = Executors.newSingleThreadScheduledExecutor();
//            service1.scheduleAtFixedRate(() -> mediator.move(elevator, MovingDirection.DOWN), 0, 1, TimeUnit.SECONDS);
////                view.move(elevator);
//        });
//        mediator.move(elevator, MovingDirection.DOWN);

//        service.submit(() -> {
////            view.move(elevator2);
//            ScheduledExecutorService service1 = Executors.newSingleThreadScheduledExecutor();
//            service1.scheduleAtFixedRate(() -> view.move(elevator2), 2, 2, TimeUnit.SECONDS);
//        });

    }

    public void returnFloor(int floor){
//        System.out.println(floor);
        field.setText(String.valueOf(floor));
    }

    public static void main(String[] args) {
//        Presenter mediator = new MainPresenter();
//        Panel panel = new Panel();
//        View el = new View(mediator, panel);
//        mediator.registerView(el);
//        ElevatorWithStop elevator = new ElevatorWithStop(1, mediator);
//        elevator.getOrders().add(1);
//        elevator.getOrders().add(2);
//        elevator.getOrders().add(3);
//        elevator.getOrders().add(4);
//        elevator.getOrders().add(5);
//        elevator.getOrders().add(6);
    }

    public void start(){
        panel.start();
    }

    public void stop(){
        panel.stop();
    }
}
