package com.company;

public class YssykKyl extends Region implements Printable{

    private double volumeOfLike;

    public YssykKyl(int population, double square, double volumeOfLike) {
        super(population, square);
        this.volumeOfLike = volumeOfLike;


    }

    public double getVolumeOfLike() {
        return volumeOfLike;
    }

    public void setVolumeOfLike(double volumeOfLike) {
        this.volumeOfLike = volumeOfLike;
    }

    @Override
    public void print() {
        System.out.println("volumeOfLike: " + getVolumeOfLike() + " Численность население: " + getPopulation() + " Площадь: " + getSquare());
    }
}
