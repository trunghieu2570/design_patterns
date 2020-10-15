package com.tthieu.design_patterns.builder;

public class Main {

    public static void main(String[] args) {

        //NormalWindowBuilder wdb1 = new NormalWindowBuilder();
        NoFrameWindowBuilder wdb2 = new NoFrameWindowBuilder();

        GUI gui = new GUI(wdb2);
        gui.makeWindow();

        Window window = wdb2.getResult();
        window.print();
    }
}
