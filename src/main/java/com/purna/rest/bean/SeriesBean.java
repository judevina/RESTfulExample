package com.purna.rest.bean;

public class SeriesBean {
    private String name;
    private String color;
    private double[] data;


    public SeriesBean(String name, String color, double[] data) {
      this.name = name;
      this.color = color;
      this.data = data;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }
}
