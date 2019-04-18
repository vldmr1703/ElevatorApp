package com.lnu.designing.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panel extends JPanel implements ActionListener {

    private Elevator elevator = new Elevator();
    private Timer timer;

    public Panel() {
        setFocusable(true);
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
        elevator.paint(g);
    }

    public void update() {
        elevator.update();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        update();
    }
}
