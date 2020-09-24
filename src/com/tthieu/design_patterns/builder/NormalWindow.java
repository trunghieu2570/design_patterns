package com.tthieu.design_patterns.builder;

public class NormalWindow extends Window {
    @Override
    public void print() {
        System.out.print("NormalWindow");
        super.print();
        System.out.println();
    }
}
