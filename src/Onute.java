import untils.INTirDOUBLE;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Onute {
    public static void main (String[]argm){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 2 skaicius ir veiksma atskiriant juos tarpu, norint skaiciaus kvadrato iveskite skaiciu , zenkla ir laipsni kurio kelti norite. pvz: 10 + 10 ");
        String line = scanner.nextLine();
        //10_+_10
        String[] items = line.split(" ");
        if(items.length == 3){
            menu(items, scanner);

        }else{
            System.out.println("Blogai ivestas formatas");
        }
    }

    private static void menu(String[] items, Scanner sc){
        double numb = INTirDOUBLE.getCorrectDouble(sc, items[0]);
        double numb2 = INTirDOUBLE.getCorrectDouble(sc, items[2]);
        switch (items[1]){
            case "+":
                sum(numb, numb2);
                break;
            case "-":
                sum2(numb,numb2);
                break;
            case "/":
                sum3(numb,numb2);
                break;
            case "*":
                sum4(numb,numb2);
                break;
            case "^":
                sum5(numb,numb);
                break;
            default:
                System.out.println("Nera tokio veiksmo.");

        }

    }

    private static void sum(double numb, double numb2){
        double mySum = numb + numb2;
        System.out.println("Suma: " + mySum);
    }
    private static void sum2(double numb, double numb2) {
        double mySum2 = numb - numb2;
        System.out.println("Suma: " + mySum2);
    }
    private static void sum3(double numb, double numb2) {
        double mySum3 = numb / numb2;
        System.out.println("Suma: " + mySum3);
    }
    private static void sum4(double numb, double numb2) {
        double mySum4 = numb * numb2;
        System.out.println("Suma: " + mySum4);
    }
    private static void sum5(double numb, double numb2) {
        double kvadratas = numb;

        for(int i = 0; i < numb2 ; i++)
        {
            kvadratas *= numb;
        }
        System.out.println("Skaiciaus kvadratas yra: " + kvadratas);
    }
}
