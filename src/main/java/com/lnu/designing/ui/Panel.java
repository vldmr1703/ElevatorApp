package com.lnu.designing.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.*;

public class Panel extends JPanel implements ActionListener {

    java.util.List<ElevatorView> elevators;
    private Timer timer;

    public Panel(Map<Integer, Integer> coords) {
        setFocusable(true);
        elevators = new ArrayList<>();
        for (Integer x:coords.keySet()){
            ElevatorView view = new ElevatorView();
            view.setX(x);
            view.setY(coords.get(x));
            elevators.add(view);
        }
        timer = new Timer(125, this);
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.fillRect(0, 0, View.WIN_WIDTH, View.WIN_HEIGHT);
        for(ElevatorView view: elevators) {
            view.paint(g);
        }
    }

    public void update() {
        for(ElevatorView view: elevators) {
            view.update();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        repaint();
//        update();
    }
}
