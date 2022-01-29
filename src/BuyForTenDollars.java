import java.util.Scanner;

public class BuyForTenDollars {
    public static void main(String[] args) {
        Scanner enterSom = new Scanner(System.in);
        System.out.println("Введите сколько у вас денег:");
        double som = enterSom.nextInt();
        if (som % 10 == som)
        System.out.println("Надо ввести цифру больше 10 ти");
        else if (som % 100 == som)
            System.out.println("Вы можете купить товаров:  " + (som % 100)/10);
        else if (som % 1000 == som)
            System.out.println("Вы можете купить товаров:  " + (som % 1000)/10);
        else if (som % 10000 == som)
            System.out.println("Вы можете купить товаров:  " + (som % 10000)/10);

        }
    }

