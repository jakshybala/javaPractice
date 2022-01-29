import java.util.Arrays;
import java.util.Random;

public class ArraysByrandom {
    public static void main(String[] args) {

        Random randNumber = new Random();
        int[] arrays = new int[10];
        for (int i=0; i<arrays.length; i++) {
            arrays[i] = randNumber.nextInt(100); //диапазон рандомных чисел
            //System.out.print("without" + arrays[i]);

            if (arrays[i]>50)
            System.out.println(arrays[i]);
        }
        //проверка массива
        System.out.println("Проверка массива");
        System.out.println(Arrays.toString(arrays));
        }
    }
