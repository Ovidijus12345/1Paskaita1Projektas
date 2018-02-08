package Namai;

public class NamaiDoWhile {
    public static void main(String[]args){
        int amzius = 17;
        int suma = 0;

        do{//pirma prasuka do ir tik paskui pasiziuri while sriti.
            suma+=100;
            amzius++;

        }while(amzius<=18);

        System.out.println(suma);
    }
}
