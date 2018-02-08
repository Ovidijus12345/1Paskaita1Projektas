package Namai;

public class NamaiMasyvai3 {
    public static void main(String[]args){
        int mas[]={5,48,7,94,549,44,5,5,5,5,8,7,8,5};
        int reiksme = mas[0];
        int k  = 0;

        for(int i = 0; i<mas.length;i++){
            if(reiksme<mas[i]){///
                reiksme = mas[i];
                k=i;
            }

        }
        System.out.println(reiksme + " " +k);


    }
}
