public class SecondTask {
    public static void main(String[] args){


        String word1 = "KOL EINU ŠUNIE LOK";
        String word2 = "ARGI TEN NE TIGRA";
        String word3 = "SĖDĖK UŽU KĖDĖS";

        if (isPalindrome(word3)){
            System.out.println("Polindromas");

        }else{

        }


    }
    private static boolean isPalindrome(String palindrome){
        boolean val = true;//
        String withoutSpacePalindrome = palindrome.replace(" ","");

        for(int i = 0; i < withoutSpacePalindrome.length(); i++){
            char a = withoutSpacePalindrome.charAt(i);
            char b = withoutSpacePalindrome.charAt(withoutSpacePalindrome.length() -1 -i);
            if(a != b){
                val = false;
                break;
            }
        }
        return val;

    }
}
