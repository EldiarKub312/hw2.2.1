package com.company;

public class Region {
    private int population;
    private double square;

    public Region(int population, double square) {
        this.population = population;
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
