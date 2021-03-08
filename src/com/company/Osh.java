package com.company;

public class Osh extends Region implements Printable{

    private int year;

    public Osh(int population, double square, int year) {
        super(population, square);
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public void print() {
        System.out.println("Основание Оша: " + getYear() + " Численность население: " + getPopulation() + " Площадь: " + getSquare());
    }
}
