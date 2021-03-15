package com.company.objects;

import com.company.interfaces.JumpAndRunnable;

public class Human implements JumpAndRunnable {
    private String name;

    //region Constructors
    public Human(String name) {
        this.name = name;
    }

    public Human() {
    }
    //endregion

    //region Getter and Setters
    public String getName() {
        return name;
    }
    //endregion

    @Override
    public void run(int num) {
        System.out.println("Человек по имени " + getName() + " Пробежал " + num + 'м');
    }

    @Override
    public void jump(int num) {
        System.out.println("Человек по имени " + getName() + " Прыгнул " + num + 'м');
    }
}
