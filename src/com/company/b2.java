package com.company;

public class b2 extends Benz {
    @Override
    public int model() {
        return 2;
    }

    @Override
    public int year() {
        return 2002;
    }

    @Override
    public void color() {
        System.out.println("red");

    }
}
