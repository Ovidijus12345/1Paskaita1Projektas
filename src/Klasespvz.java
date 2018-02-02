
public class Klasespvz {



    public static void main(String[] args){
        // oblekto sukurimas,  perduotam parametrai i konstruktoriu
        SecondClassExample secondClassExample = new SecondClassExample(67);
        secondClassExample.testMethod(); // metodo iskvietimas

    }

}
 /// klase be public nes antra  public class negali buti
class SecondClassExample{
    private int id;
     /// default konstruktorius
    public SecondClassExample(){
        id = 10;
    }
    // konstruktorius su vienu int parametru
    public SecondClassExample(int id){
        this.id = id; // butent sita reiksme
        //id = ids;/// galima nes skiriasi vardai
    }

    public void testMethod(){
        System.out.println(" This is my method :)" + id); // uzrasas consoleje
    }
}