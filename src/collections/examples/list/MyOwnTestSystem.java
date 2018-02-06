package collections.examples.list;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyOwnTestSystem {
    public static void main(String[]args){

        MyOwnTestSystem myOwnTestSystem = new MyOwnTestSystem();
        Map<Integer,Question> questionMap = myOwnTestSystem.readQuestions();
        for(Integer key : questionMap.keySet()){
            Question q = questionMap.get(key);
            System.out.println(q.getQuestionText());
            for(String v : q.getVariantas()){
                System.out.println(v);
            }
        }

    }

    private Map<Integer,Question> readQuestions(){

        Map<Integer, Question> questionMap = new HashMap<>();


        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("questions.txt")));

            String line;
            int key = 1;
            while((line = bf.readLine()) != null){ //skaitome po eilute is  failo
                String[] items = line.split(";"); // isskaidom per ;
                String[] examples = items[1].split(" "); // isskaidom variantus per tarpa
                List<String> myItems = Arrays.asList(examples);// sudedame visus variantus i listas untils pagalba
                int answer = Integer.valueOf(items[2].trim()); // convertuojame ats is String into Integer remove all empty space
                Question question = new Question(items[0],myItems,answer);// sudedame itemus i objekta
                questionMap.put(key++, question);

            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return questionMap;
    }
}
