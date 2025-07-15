import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int number1 = sn.nextInt();
        System.out.println("enter 2nd number: ");
        int number2 = sn.nextInt();
        System.out.printf("number before swap %d and %d",number1,number2);
        System.out.println();
        swapWithTemp(number1,number2);
        swapWithMath(number1,number2);
        swapWithBitwise(number1,number2);

    }
    public static void swapWithTemp(int number1, int number2){
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.printf("number after temp swap %d and %d",number1,number2);
        System.out.println();
    }

    public static void swapWithMath(int number1, int number2){
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.printf("number after math swap %d and %d",number1,number2);
        System.out.println();
    }

    public static void swapWithBitwise(int number1, int number2){
        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;
        System.out.printf("number after bitwise swap %d and %d",number1,number2);
        System.out.println();
    }
}
