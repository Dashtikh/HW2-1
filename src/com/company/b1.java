package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class b1 extends Benz {
    @Override
    public int model() {
        return 1;
    }

    @Override
    public int year() {
        return 2001;
    }

    @Override
    public void color() {
        System.out.println("blue");
    }
}
