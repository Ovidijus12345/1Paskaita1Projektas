import untils.INTirDOUBLE;

import java.util.Scanner;

public class Paskaita1uzdavinys1 {
    public static void main (String[]argm){

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite savo mase.");
        double mase = INTirDOUBLE.getCorrectDouble(sc);

        System.out.println("Iveskite savo ugi.");
        double ugis = INTirDOUBLE.getCorrectDouble(sc);

        System.out.println("Jusu KMI yra: " + mases_indeksas(mase,ugis));

    }
    private static double mases_indeksas (double mase, double ugis){

        double kmi = mase / (ugis*ugis);
        return kmi;
    }

}
