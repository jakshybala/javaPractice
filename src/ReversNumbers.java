import java.util.Scanner;

public class ReversNumbers {
    public static void main(String[] args) {
        Scanner enterNum = new Scanner(System.in);
        System.out.println("Введите цифры: ");
        int reversNum =0;
        int readNumb = enterNum.nextInt();
        while (readNumb != 0){
            reversNum = reversNum * 10;
            reversNum = reversNum + readNumb % 10;
            readNumb = readNumb /10;
        }
        System.out.println(reversNum);

        }
    }

