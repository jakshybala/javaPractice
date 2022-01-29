import java.util.Scanner;

public class SearchArrayString {
    public static void main(String[] args) {
        Scanner enterDataS = new Scanner(System.in);
        String[] arrayString = new String[]{"Apple", "windows", "linux"};
        System.out.println("Введите данные: ");
        String getDataS = enterDataS.nextLine();
        String results = " ";
        for (int i = 0; i < arrayString.length; i++){
            if (arrayString[i].equals(getDataS)){
                results = arrayString[i];
                System.out.printf("Такой %s элемент имеется в массиве %s%n", getDataS , "под индексом-> "+ i);
        }
        }
        if (!getDataS.equals(results) ){
            System.out.printf("Такого %s элемента нету в массиве", getDataS);
        }
    }
}
