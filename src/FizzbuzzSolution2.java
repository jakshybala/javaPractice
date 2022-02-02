import java.util.Scanner;


public class FizzbuzzSolution2 {
    public static void main(String[] args) {
        //Write a fizzbuzz() method that takes in a number, n, and returns an ArrayList of the numbers from 1 to n. For multiples of three, use "Fizz" instead of the number, and for the multiples of five, use "Buzz". For numbers that are multiples of both three and five, use "FizzBuzz" (capitalization matters).
//For example, fizzbuzz(16) should return [1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz", 16].

        System.out.println(conditionFizzBuzz(17));

    }
    static String conditionFizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
//                System.out.print("FizzBuzz" + " ");
                return "FizzBuzz" + " ";
            } else if (i % 5 == 0) {
                //System.out.print("Buzz" + " ");
                return "Buzz" + " ";
            } else if (i % 3 == 0) {
                //System.out.print("Fizz" + " ");
                return "Fizz" + " ";
            } else
                //System.out.print(i + " ");
                return i + " ";
        }
        return String.valueOf(num);
    }
}


