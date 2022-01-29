import java.util.Scanner;

public class FizzbuzzSolution2 {
    public static void main(String[] args) {
//        Scanner enterNumb = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        System.out.println(fizzbuzzMethod(enterNumb.nextInt()));
        //fizzbuzzMethod(17);
        System.out.println(conditionFizzBuzz(17));

    }
    static String conditionFizzBuzz (int num){
        for (int i =1; i<=num; i++){
            if (i % 15 == 0){
//                System.out.print("FizzBuzz" + " ");
                return "FizzBuzz" + " ";
            }
            else if (i % 5 == 0){
                //System.out.print("Buzz" + " ");
                return "Buzz" + " ";
            }
            else if (i % 3 == 0){
                //System.out.print("Fizz" + " ");
                return "Fizz" + " ";
            }
            else
                //System.out.print(i + " ");
            return i + " ";
        }
        return String.valueOf(num);
    }
}
//    public static String fizzBuzz2(int number) {
//        for (int i = 0; i < number; i++) {
//            if (number % 15 == 0) {
//                return "fizzbuzz";
//            } else if (number % 5 == 0) {
//                return "buzz";
//            } else if (number % 3 == 0) {
//                return "fizz";
//            } else
//                return Integer.toString(i);
//
//        }
//        return Integer.toString(number);
//    }


