package com.company;

public class Main  {

    public static void main(String[] args) {
        creatObject("Naryn");
        System.out.println("------------------------");
        creatObject("Osh");
        System.out.println("------------------------");
        Main.creatObject("YssykKyl");


    }

    public static Region creatObject(String className) {

        switch (className) {
            case "Naryn":
                Naryn Naryn = new Naryn(15643, 5.321, "Таш-Рабат");
                Naryn.print();

                return Naryn;

            case "Osh":
                Osh Osh = new Osh(200000 , 13.000 , 1578 );
                Osh.print();

                return Osh;

            case "YssykKyl":
                YssykKyl YssykKyl = new YssykKyl(21345 , 1.2434 , 3453 );
                YssykKyl.print();

                return YssykKyl;
        }
        return null;
    }
}
