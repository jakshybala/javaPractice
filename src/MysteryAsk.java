import java.util.Scanner;

public class MysteryAsk {
    public static void main(String[] args) {
        //Java задачи
        // Реализация загадки с возможностью отвечать на Java
        Scanner enterDatas = new Scanner(System.in);
        System.out.println("Загадка: Самое большое млекипитающие?? \n *** У вас всего 3 попытки!!!***");
        for (int i = 0; i < 3; i++) {
            System.out.println("Введити ответы: ");
            String ansver = enterDatas.nextLine();

            switch (ansver) {
                case ("Кит"):
                    System.out.println("Правильный ответ");
                    break;
                case ("Сдаюсь"):
                    System.out.println("Правильный ответ - это 'Кит' !!!");
                    System.exit(0);
                default:
                    System.out.println("Не правильный ответ!!! \n Попробуйте еще раз");
                    break;

            }
            System.out.println();
        }
    }
}
