package JavaPrograme;

import java.util.Scanner;

public class OddEvenTernaryOperator {

    public static void main(String[] args) {
        Scanner declaration = new Scanner(System.in);
        System.out.println("please enter the number :");

        int number= declaration.nextInt();
        isOddEvenNumberTernary(number);
        //Scanner.close;

    }


    public static int isOddEvenNumberTernary(int number) {
        boolean evenOrOdd = (number%2==0);
        System.out.println("the "+ number + "is " + evenOrOdd);
        return number;
    }


}
