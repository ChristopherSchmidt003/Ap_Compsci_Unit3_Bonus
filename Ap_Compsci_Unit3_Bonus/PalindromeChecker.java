import java.util.Scanner;

class PalindromeChecker {
    static Scanner sc = new Scanner(System.in);
    static String str = "";
    public static void main (String[] args) {
        System.out.println("Write the word or phrase please");
        str = sc.nextLine();
        
        str = str.toLowerCase();
        String str1 = "";
        for (int i = 0; i < str.length(); i++){
            if (Character.isLetter(i)) {
                str1 = str1 + str.charAt(i);
            }
        }
        
        String rts = ""; //str backwards, but also real time strategy, nice
        
        for (int i = str1.length()-1; i >= 0; i--){
            rts = rts + str1.charAt(i);
        }
        if (rts.equals(str1)){
            System.out.print(str + " is a palindrome!");
        } else {
            System.out.print(str + " is not a palindrome.");
        }
    }
}