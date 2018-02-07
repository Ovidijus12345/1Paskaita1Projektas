package UzdaviniaiMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Uzdavinys1 {
    public static void main (String[]args){

        ArrayList<String> names = new ArrayList<>();
        names.add("Andrius");
        names.add("Ovidijus");
        names.add("Petras");
        names.add("Jonas");
        names.add("Tadas");


        for(String name : names){

            if(name.length() < 6){
                System.out.println("Atitinka reikalavimus vardas: " + name);
            }
        }
        Collections.sort(names);
        for(String name : names){
            System.out.println(names);
        }


        System.out.println(metodas1(names));
        System.out.println(metodas2(names));

        List<Uzdavinys3> persons = new ArrayList<>();

        Uzdavinys3 person = new Uzdavinys3("Ovidijus ", "Kutkaitis ", 28, "Kaunas ");

        persons.add(person);

        persons.add(new Uzdavinys3("Tadas ","Tramp ", 22,"Vilnius "));

        for(Uzdavinys3 p : persons){
            System.out.println(p.getName()+ p.getSurname()+ p.getCity()+p.getAge());
        }
    }
    private static String metodas1 (List<String>names){
       return names.get(0);
    }
    private static String metodas2 (List<String>names){
        return names.get(4);
    }


}

