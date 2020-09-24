package com.tthieu.design_patterns.builder;

import com.tthieu.design_patterns.Color;

public abstract class Window {
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private String title;
    private Color backColor = Color.BLACK;
    private boolean resize = false;
    private boolean minimizable = false;
    private Object childList;

    public void print() {
        System.out.print("{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                ", width=" + width +
                ", height=" + height +
                ", title='" + title + '\'' +
                ", backColor=" + backColor +
                ", resize=" + resize +
                ", minimizable=" + minimizable +
                ", childList=" + childList +
                '}');
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBackColor(Color backColor) {
        this.backColor = backColor;
    }

    public void setResize(boolean resize) {
        this.resize = resize;
    }

    public void setMinimizable(boolean minimizable) {
        this.minimizable = minimizable;
    }

    public void setChildList(Object childList) {
        this.childList = childList;
    }
}
