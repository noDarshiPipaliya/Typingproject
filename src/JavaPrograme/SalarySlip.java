package JavaPrograme;

import java.util.Scanner;

public class SalarySlip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name :");
        String name = scanner.nextLine();

        System.out.println("enter your enployee ID :");
        int enployeeID = scanner.nextInt();

        System.out.println("enter basic salary :");
        double basicSalary = scanner.nextDouble();

        double HRA = calculateHRA(basicSalary);
        double DA = calculateDA(basicSalary);
        double TA = calculateTA(basicSalary);
        double PF = calculatePF(basicSalary);
        double grodssSalary = basicSalary+HRA+DA+TA+PF;

        System.out.println("-----------------------------------------");
        System.out.println("| salary slip                            | ");
        System.out.println("| ---------------------------------------|");
        System.out.println("| employee ID  : " +      enployeeID + " |");
        System.out.println("| employee name :"+    name +           "|");
        System.out.println("|----------------------------------------|");
        System.out.println("| basic salary  : " + basicSalary +     "|");
        System.out.println("| HRA 10%       :"   +HRA +             "| ");
        System.out.println("| TA            : "  +TA +              "| ");
        System.out.println("| DA            : " + DA +              "| ");
        System.out.println(" PF             : " + PF +              "| ");
        System.out.println("|----------------------------------------|");
        System.out.println("| Gross salary    : " + grodssSalary + " |");
        System.out.println("|----------------------------------------|");
    }

    public static double calculateHRA(double basicSalary){
        return (basicSalary*10)/100;
    }
    public static double calculateDA(double basicSalary){
        return (basicSalary*8)/100;
    }
    public static double calculateTA(double basicSalary){
        return (basicSalary*9)/100;
    }
    public static double calculatePF(double basicSalary){
        return (basicSalary*20)/100;
    }







}
