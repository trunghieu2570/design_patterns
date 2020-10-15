package com.tthieu.design_patterns.builder;

public class NormalWindowBuilder implements WindowBuilder {
    private final NormalWindow result;

    public NormalWindowBuilder() {
        result = new NormalWindow();
    }

    @Override
    public WindowBuilder setPosition(int xPos, int yPos) {
        result.setXPos(xPos);
        result.setYPos(yPos);
        return this;
    }

    @Override
    public WindowBuilder setSize(int width, int height) {
        result.setWidth(width);
        result.setHeight(height);
        return this;
    }

    @Override
    public WindowBuilder setTitle(String title) {
        result.setTitle(title);
        return this;
    }

    @Override
    public WindowBuilder setBackColor(Color backColor) {
        result.setBackColor(backColor);
        return this;
    }

    @Override
    public WindowBuilder setChildList(Object childList) {
        result.setChildList(childList);
        return this;
    }

    @Override
    public WindowBuilder resizable() {
        result.setResize(true);
        return this;
    }

    @Override
    public WindowBuilder minimizable() {
        result.setMinimizable(true);
        return this;
    }

    @Override
    public Window getResult() {
        return result;
    }
}
