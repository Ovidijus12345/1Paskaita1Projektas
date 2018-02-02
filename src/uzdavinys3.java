import java.util.Scanner;

public class uzdavinys3 {
    public static void main (String[]argm){

        System.out.println("Iveskite koki objekta norite apskaiciuoti: \n1. Trikampio plota, " +
                "\n2. Staciakampio plota, " +
                "\n3. Kvadrato plota, " +
                "\n4. Askritimo plota.");
        Scanner sc = new Scanner(System.in);
        int objektas = sc.nextInt();

        switch (objektas){
            case 1:
                System.out.println("Iveskite a krastine.");
                double a = sc.nextDouble();
                System.out.println("Iveskite b krastine.");
                double b = sc.nextDouble();
                System.out.println("Trikampio plotas yra " + trikampioPlotas(a,b));
                break;
            case 2:
                System.out.println("Iveskite a krastine.");
                double a1 = sc.nextDouble();
                System.out.println("Iveskite b krastine.");
                double b1 = sc.nextDouble();
                System.out.println("Staciakampio plotas yra " + staciakampioPlotas(a1,b1));
                break;
            case 3:
                System.out.println("Iveskite a krastine.");
                double a2 = sc.nextDouble();
                System.out.println("Iveskite b krastine.");
                double b2 = sc.nextDouble();
                System.out.println("Kvadratas plotas yra " + kvadratoPlotas(a2,b2));
                break;
            case 4:
                System.out.println("Iveskite spinduli r.");
                double r = sc.nextDouble();
                System.out.println("apskritimo plotas yra " + apskritimoPlotas(r));
                break;
            default:
                System.out.println("Nera tokio.");
        }

    }
    private static double trikampioPlotas(double a, double b){

        double trS = (a*b)/2;
        return trS;
    }
    private static double staciakampioPlotas(double a1, double b1){

        double stS = a1*b1;
        return  stS;
    }
    private static double kvadratoPlotas(double a2, double b2){

        double kvS = (a2*a2);
        return kvS;
    }
    private static double apskritimoPlotas(double r){

        double pi = 3.1415;
        double apS = pi*(r*r);
        return  apS;
    }
}
