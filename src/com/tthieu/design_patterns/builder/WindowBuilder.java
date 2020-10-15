package com.tthieu.design_patterns.builder;

public interface WindowBuilder {
    WindowBuilder setPosition(int xPos, int yPos);
    WindowBuilder setSize(int width, int height);
    WindowBuilder setTitle(String title);
    WindowBuilder setBackColor(Color backColor);
    WindowBuilder setChildList(Object childList);
    WindowBuilder resizable();
    WindowBuilder minimizable();
    Window getResult();
}

