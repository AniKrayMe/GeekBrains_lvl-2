package com.company.objects;

import com.company.interfaces.JumpAndRunnable;

public class Robot implements JumpAndRunnable {

    private String name;

    //region Constructors
    public Robot(String name) {
        this.name = name;
    }

    public Robot() {
    }
    //endregion

    //region Getter and Setters
    public String getName() {
        return name;
    }
    //endregion

    @Override
    public void run(int num) {
        System.out.println("Робот по имени " + getName() + " Пробежал " + num + 'м');
    }

    @Override
    public void jump(int num) {
        System.out.println("Робот по имени " + getName() + " Прыгнул " + num + 'м');
    }
}
