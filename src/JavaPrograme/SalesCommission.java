package JavaPrograme;

import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter seller name :");
        String name = scanner.nextLine();
        System.out.println(" enter seller ID :");
        int sellerID = scanner.nextInt();
        System.out.println("enter sales amount :");
        int saleaAmount = scanner.nextInt();
        System.out.println("enter basic salary :");
        int basicSalary = scanner.nextInt();

        SalesCommission salesCommission = new SalesCommission();
        int grossSalary = basicSalary + salesCommission.calculateCommission(saleaAmount);
        System.out.println("seller name is        : "+ name );
        System.out.println("seller ID              :"+ sellerID);
        System.out.println("seller sales amount is  : " + saleaAmount);
        System.out.println("sellers basic salary   :"  +  basicSalary);
        System.out.println("sellers gross salary   : " + grossSalary);
        scanner.close();
    }

    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("sales commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("sales commission is " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("sales commission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("sales commission is " + commission);
        }
        return commission=0;
    }


}
