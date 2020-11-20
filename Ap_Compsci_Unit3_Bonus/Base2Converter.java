import java.util.Scanner;

class Base2Converter {
    static Scanner sc = new Scanner(System.in);
    static String str = "";
    static int number = 0;
    static int remainder = 0;
    public static void main (String[] args) {
        System.out.print("Enter a decimal number: ");
        number = sc.nextInt();
        System.out.print(number + " in binary is: ");
        convertToBinary();
        System.out.print(str);
    }
    public static void convertToBinary(){
        while(number != 0){
            if (number%2 != 0) remainder = 1;
            str = remainder + str;
            number = number/2;
            remainder = 0;
        }
    }
}