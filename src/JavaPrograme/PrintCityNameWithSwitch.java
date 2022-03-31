package JavaPrograme;

import java.util.Scanner;

public class PrintCityNameWithSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        String city = scanner.next().toUpperCase();

        PrintCityNameWithSwitch cityName = new PrintCityNameWithSwitch();
        cityName.printCityName(city);

                scanner.close();
    }


    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }





}
