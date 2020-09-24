package com.tthieu.design_patterns.adapter;

import com.tthieu.design_patterns.Point;

public class Main {

    public static void main(String[] args) {
        ConcreteLegacyWindow lwd = new ConcreteLegacyWindow();
        Window w1 = new LegacyWindowAdapter(lwd);
        w1.show(new Point(50, 50));

        Window w2 = new ConcreteWindow();
        w2.show(new Point(100, 100));
    }
}
