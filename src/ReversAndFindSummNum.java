import java.util.Scanner;

public class ReversAndFindSummNum {
    public static void main(String[] args) {
        long numbers = 123456789101112l; //данные которых надо суммировать
        long revers = 0; //счетчик для revers
        long summ = 0; //счетчик для суммы
        while (numbers != 0) {
            revers = revers * 10; //умножает на 10 последнии цифры каждый раз в цикле
            revers = revers + numbers % 10; // Берет последнию цифру каждый раз в цикле
            numbers = numbers /10; // Убирает последнию цифру каждый раз в цикле
            summ = summ + revers % 10;
        }
        System.out.println("Summ of Revers numbers: " + summ);
        System.out.println("Revers numbersL " + revers);


    }
}
