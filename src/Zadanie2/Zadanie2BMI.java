package Zadanie2;

import java.util.Scanner;

public class Zadanie2BMI {

    public static void main(String[] args) {

        Scanner liczba1= new Scanner(System.in);

        System.out.println("Proszę podać swój wzrost (m):");
        float HeightRudnicki = liczba1.nextFloat();

        Scanner liczba2= new Scanner(System.in);

        System.out.println("Proszę podać swoją wage (kg):");
        float WeightRudnicki = liczba2.nextFloat();

        Float BMI = (WeightRudnicki/(HeightRudnicki*HeightRudnicki));

        System.out.print(BMI + " ");

        if (BMI < 16) {
            System.out.println("Wygłodzenie");
        }else if(BMI >= 16 && BMI <= 16.99){
            System.out.println("Wychudzenie");
        }else if(BMI >= 17 && BMI <= 18.49){
            System.out.println("Niedowaga");
        }else if(BMI >= 18.50 && BMI <= 22.99){
            System.out.println("Norma niski przedział");
        }else if(BMI >= 23.00 && BMI <= 24.99){
            System.out.println("Norma wysoki przedział");
        }else if(BMI >= 25.00 && BMI <= 27.49){
            System.out.println("Nadwaga niski przedział");
        }else if(BMI >= 27.50 && BMI <= 29.99){
            System.out.println("Nadwaga wysoki przedział");
        }else if(BMI >= 30 && BMI <= 34.90){
            System.out.println("Otyłość I stopnia");
        }else if(BMI >= 35 && BMI <= 39.90){
            System.out.println("Otyłość II stopnia");
        }else if(BMI >= 40){
            System.out.println("Otyłość III stopnia");
        }



    }

}
