package Namai;

import java.util.Random;

public class NamaiRandom {
    public static void main(String[]args){
        Random random = new Random();// objekto kurimas
        int sk;
        for(int i=0;i<10;i++){// 10 kartu prasisiuks

        sk = random.nextInt(6); // skaiciu riba 6

        System.out.println(sk);
        }
    }
}
