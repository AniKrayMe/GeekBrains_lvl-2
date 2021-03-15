package com.company.objects;

import java.util.ArrayList;


public class Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    //region Constructors
    public Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public Participant() {
    }
    //endregion


    //region Getters and Setters
    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }


    public void start(Treadmill treadmill, Wall wall) {
        if (getMaxRunDistance() >= treadmill.getDistance()) {
            System.out.println("✓ " + getName() + " Успешно пробежал " + treadmill.getDistance() + 'м');
        } else {
            System.out.println("✘ " + getName() + " Несмог пробежать " + treadmill.getDistance() + 'м');
            return;
        }
        if (getMaxJumpHeight() >= wall.getHeight()) {
            System.out.println("✓ " + getName() + " Успешно прыгнул " + wall.getHeight() + 'м');
        } else {
            System.out.println("✘ " + getName() + " Несмог прыгнуть " + wall.getHeight() + 'м');
        }
    }


}

