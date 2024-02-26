package org.example.OOP;

public class Pen {
    private String model;
    private String color;
    private int count;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null){
            model = "Unknown";
        }
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", count=" + count +
                '}';
    }
}
