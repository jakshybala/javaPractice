import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner enterAnimal = new Scanner(System.in);
        int[] numbersArray = new int[]{1,22,66,7};
        System.out.println("Введите данные: ");
        int getNumber = enterAnimal.nextInt();
        int reults =0;
        for (int i = 0; i<numbersArray.length; i++){
            if (numbersArray[i]== getNumber){
                reults = numbersArray[i];
                System.out.println("Такой элемент имеется " +numbersArray[i]+ " под индексом " + i);
            }
        }
        if (reults != getNumber)
        System.out.printf("Такого элемента %s нету в массиве ", getNumber);




            }
        }




