package com.tthieu.design_patterns.builder;

public class GUI {
    private final WindowBuilder builder;
    public GUI(WindowBuilder builder) {
        this.builder = builder;
    }

    public void makeWindow() {
        builder.setPosition(0, 0)
                .setSize(200, 100)
                .setBackColor(Color.WHITE)
                .setTitle("MainWindow")
                .resizable();
    }
}
