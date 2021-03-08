package com.company;

public class Naryn extends Region implements Printable {

    private String tashrabat;

    public Naryn(int population, double square, String tashrabat) {
        super(population, square);
        this.tashrabat = tashrabat;
    }

    public String getTashrabat() {
        return tashrabat;
    }

    public void setTashrabat(String tashrabat) {
        this.tashrabat = tashrabat;
    }

    @Override
    public void print() {
        System.out.println("Достопримечательность Нарына: " + getTashrabat() + "\nPopulation: " + getPopulation() + "\nSquare: " + getSquare());
    }
}
