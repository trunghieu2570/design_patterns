package com.tthieu.design_patterns.adapter;

public class ConcreteLegacyWindow implements LegacyWindow {
    @Override
    public void show(int x, int y) {
        System.out.println("Show legacy window at: [" + x + "," + y + "]");
    }
}
