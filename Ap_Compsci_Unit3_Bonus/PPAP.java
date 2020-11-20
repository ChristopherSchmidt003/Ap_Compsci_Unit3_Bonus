import java.util.Scanner;

class PPAP {
    static Scanner sc = new Scanner(System.in);
    static String str = "";
    static String object1 = "";
    static String object2 = "";
    public static void main (String[] args) {
        System.out.println("Write the first line please");
        str = sc.nextLine();
        getObjects();
        
        makeVerse();
    }
    public static void getObjects (){
        object1 = str.substring(9, str.indexOf(","));
        object2 = str.substring(str.indexOf(",")+11,str.length());
    }
    public static void makeVerse (){
        System.out.println("I have a " + object1 + ", I have a " + object2);
        System.out.println("Uh! " + object2 + object1);
    }
}