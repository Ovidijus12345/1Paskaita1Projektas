package untils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class INTirDOUBLE {
    public static int getCorrectNumber(Scanner sc) {
        int numb = 0;
        while (true) {
            System.out.println("Iveskite sakiciu per kableli.");
            try {
                numb = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(("Juk sakiau ivest skaiciu!!!"));
                sc.nextLine();
            }break;
        }
        return numb;
    }
    public static double getCorrectDouble (Scanner sc) {
        double numb = 0.0;
        while (true) {
            System.out.println("Iveskite skaiciu per kableli.");
            try {
                numb = sc.nextDouble();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Blogas skaicius");
                sc.nextLine();
            }
        }
        return numb;
    }
    public static double getCorrectDouble (Scanner sc, String numb){
        double n = 0;
        try {
            n = Double.valueOf(numb);

        }catch (NumberFormatException e){
            System.out.println("Blogai ivestas skaicius, pakartoti");
            n = getCorrectDouble(sc);
        }
        return n;
    }
}
