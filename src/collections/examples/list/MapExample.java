package collections.examples.list;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main (String[]args){

        Map<Integer, String> namesMap = new HashMap<>();

        namesMap.put(12, " Andrius");
        namesMap.put(1, " Jonas");
        namesMap.put(3, " Petras");
        namesMap.put(4, " Jonas");
        namesMap.put(10, " Darius");

        for(Integer key : namesMap.keySet()){
            System.out.println("key: " + key + " value" + namesMap.get(key));
        }
    }
}
