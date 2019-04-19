package com.lnu.designing.ui;

import java.awt.*;

public class ElevatorView {
    int ELEVATOR_WIDTH = 100;
    int ELEVATOR_HEIGHT = 100;
    int x ;
    int y;
    int yVelocity = 5;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

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

    public void returnFloor(int floor){
        update();
//        System.out.println(floor);
//        field.setText(String.valueOf(floor));
    }
}
