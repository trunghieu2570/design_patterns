package com.tthieu.design_patterns.adapter;

public class LegacyWindowAdapter implements Window {
    private final LegacyWindow adaptee;

    public LegacyWindowAdapter(LegacyWindow adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void show(Point position) {
        adaptee.show(position.getX(), position.getX());
    }
}
