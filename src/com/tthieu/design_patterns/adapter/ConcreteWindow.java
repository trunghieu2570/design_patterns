package com.tthieu.design_patterns.adapter;

public class ConcreteWindow implements Window {
    @Override
    public void show(Point position) {
        System.out.println("Show window at: " + position.toString());
    }
}
