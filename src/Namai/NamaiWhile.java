package Namai;

import java.util.Scanner;

public class NamaiWhile {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int n;
        double suma = 0;
        double vidurkis;
        double tarpinis;
        System.out.println("Iveskite keliu skaiciu vidurki naudosite: ");
        n = sc.nextInt();

        while(i < n){
            System.out.println("Iveskite skaiciu: ");
            tarpinis = sc.nextDouble();
            suma = suma+tarpinis; // suma += tarpinis;
            i++;

        }
        vidurkis = suma / n;
        System.out.println("vidurkis: " + vidurkis);

    }

}
