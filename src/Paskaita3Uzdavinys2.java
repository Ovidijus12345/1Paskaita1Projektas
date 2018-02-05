import untils.INTirDOUBLE;

import java.util.Scanner;

public class Paskaita3Uzdavinys2 {

    public static void main (String[]argm){

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite nuvaziuotus kilometrus.");
        double km = INTirDOUBLE.getCorrectDouble(sc);
        System.out.println("Iveskite kuro sanaudas.");
        double kuras = INTirDOUBLE.getCorrectDouble(sc);

    }
    public static void vidutines_sanaudos (double km, double kuras){
        System.out.println("Jusu automobilis vidutiniskai sunaudoja kuro: " + vidutines_kuro_sanaudos(km,kuras) + " l.");

    }
    private static double vidutines_kuro_sanaudos (double km, double kuras){

        double vidurkis = (kuras * 100) / km;
        return vidurkis;
    }
}
