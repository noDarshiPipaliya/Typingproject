package JavaPrograme;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the year :");
        int year = scanner.nextInt();
        LeapYear leapYear = new LeapYear();
        //scanner.close;
    }
    public void isitLeapyear(int year){
        if(year %4 ==0 && year %100 !=0 || year %400 ==0){
            System.out.println("the year "+ year +"is leap yaer ");
            return;
        }
        System.out.println("the year "+ year  + "is not leap year");

    }

}
