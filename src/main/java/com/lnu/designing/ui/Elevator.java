package com.lnu.designing.ui;

import java.awt.*;

public class Elevator {
    int ELEVATOR_WIDTH = 100;
    int ELEVATOR_HEIGHT = 100;
    int x = View.WIN_WIDTH / 2;
    int y = View.WIN_HEIGHT - ELEVATOR_HEIGHT;
    int yVelocity = 4;

    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, ELEVATOR_WIDTH, ELEVATOR_HEIGHT);
    }

    public void update() {
        y -= yVelocity;
        if (y < 0 || y > View.WIN_HEIGHT) {
            yVelocity += yVelocity;
        }
    }
}
