import java.util.Scanner;

//Write a fizzbuzz() method that takes in a number, n, and returns an ArrayList of the numbers from 1 to n. For multiples of three, use "Fizz" instead of the number, and for the multiples of five, use "Buzz". For numbers that are multiples of both three and five, use "FizzBuzz" (capitalization matters).
//For example, fizzbuzz(16) should return [1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz", 16].

public class FizzbuzzSolution {
    public static void main(String[] args) {
        conditionFizzBuzz();

    }
    //Condition which print FizzBuzz
    static void conditionFizzBuzz (){
        int lenghtNumb = returnInt(1);
        //int wordNum = 3;
        for (int i =1; i<=lenghtNumb; i++){
            if (i % 15 == 0){
                System.out.print("FizzBuzz" + " ");
            }
            else if (i % 5 == 0){
                System.out.print("Buzz" + " ");
            }
            else if (i % 3 == 0){
                System.out.print("Fizz" + " ");
            }
            else
            System.out.print(i + " ");
            }
        }
    //Method - Read number from User
    static int returnInt (int n){
        Scanner enterLengh = new Scanner(System.in);
        System.out.println("Введите цифру: ");
        return enterLengh.nextInt();

    }
}

