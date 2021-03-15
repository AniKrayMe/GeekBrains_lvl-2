package com.company.objects;

import com.company.interfaces.JumpAndRunnable;

public class Cat implements JumpAndRunnable {

    private String name;

    //region Constructors
    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    //endregion

    //region Getter and Setters
    public String getName() {
        return name;
    }
    //endregion

    @Override
    public void run(int num) {
        System.out.println("Кот по имени " + getName() + " Пробежал " + num + 'м');
    }

    @Override
    public void jump(int num) {
        System.out.println("Кот по имени " + getName() + " Прыгнул " + num + 'м');
    }
}
