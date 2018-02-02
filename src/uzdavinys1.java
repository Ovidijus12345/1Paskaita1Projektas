import java.util.Scanner;

public class uzdavinys1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// objekto nuskaitymui ir consoles
        uzdavinys1 secondClassExample = new uzdavinys1(); // klases objektas
        String name = "";
        do{
            System.out.println("Iveskite savo varda.");
            name = sc.nextLine(); // nuskaito visa eilute
            System.out.println(" Jusu vardas yra: " + name);

            int lenght = name.length();


            int countChar = secondClassExample.countChars(name);
            if (name.length() % 2 == 0) {
                System.out.println("Ivestas zodis " + name + " yra lyginis, ilgis " + name.length() + " rasta raidziu a: " + countChar);
            } else {
                System.out.println("Ivestas zodis " + name + "yra nelygus " + name.length() + " rasta raidziu a: " + countChar);
            }

        }while (!name.equals("pabaiga"));
    }

    private int countChars(String name) {
        int numb = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (letter == 'a' || letter == 'A') {
                numb++;
            }
        }
        return numb;
    }
}
