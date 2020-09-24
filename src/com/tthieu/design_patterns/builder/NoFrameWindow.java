package com.tthieu.design_patterns.builder;

public class NoFrameWindow extends Window {
    @Override
    public void print() {
        System.out.print("NoFrameWindow");
        super.print();
        System.out.println();
    }
}
