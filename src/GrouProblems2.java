import java.util.Scanner;

public class GrouProblems2 {
    public static void main(String[] args) {
        Scanner enterNum = new Scanner(System.in);
        System.out.println("Введите данные: ");
        int number = enterNum.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print(i + "^" + i + "=");
            for (int j = 1; j<=i; j++){
                System.out.print(i);
                if (j<i)
                    System.out.print("*");
            }
            System.out.print("=" + (int)Math.pow(i,i));
            System.out.println();
        }
        }
    }
