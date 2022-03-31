package JavaPrograme;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] numArray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};

        String[] strArray = {
                "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
        System.out.println("Actual Numerical Array was: " + Arrays.toString(numArray));
        //Sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is: " + Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        //Sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));
    }

}

