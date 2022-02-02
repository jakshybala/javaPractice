import java.util.Enumeration;
import java.util.Scanner;

public class GroupProblems3 {
    public static void main(String[] args) {
        Scanner enterNumb = new Scanner(System.in);
        System.out.println("Введите количество: ");
        int num = enterNumb.nextInt();
        String results = "";
        int count = 0;
        for (int i = 1; i <= num; i++){
            System.out.println("Введите " + i + ": цифру");
            int nums = enterNumb.nextInt();
            results = results + nums;
            }
        System.out.print(results);
    }
}
