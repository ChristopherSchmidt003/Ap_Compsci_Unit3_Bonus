import java.util.Scanner;

class PigLatin {
    static Scanner sc = new Scanner(System.in);
    static String str = "";
    public static void main (String[] args) {
       String answer = "";
       String word = "";
       System.out.print("Write the word or phrase please ");
       str = sc.nextLine();
       
       str = str + " ";
       while(str.indexOf(" ") > 0){
           word = str.substring(0, str.indexOf(" "));
           if (word.length() > 2){
               word = word.substring(word.length()-1,word.length()) + word.substring(0, word.length()-1) + "ay";
           }
           answer = answer + word + " ";
           
           str = str.substring(str.indexOf(" ")+1);
        }
       
       System.out.print(answer);
    }
}