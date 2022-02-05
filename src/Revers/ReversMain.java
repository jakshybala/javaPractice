package Revers;

import java.util.Scanner;

public class ReversMain {
    public static void main(String[] args) {
        Scanner enterData = new Scanner(System.in);
        System.out.println("Enter number");
        long numb = enterData.nextInt();
        long reversNumb = 0;
        while (numb != 0) {
            System.out.println(numb);
            reversNumb = reversNumb * 10; //just add zero each time
            reversNumb = reversNumb + numb % 10; // after add zero to last number
            numb = numb / 10; //to clear last number each time
        }
        System.out.println(reversNumb);

    }
}
