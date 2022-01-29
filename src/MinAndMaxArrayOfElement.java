public class MinAndMaxArrayOfElement  {
    public static void main(String[] args) {

        findMax(new int[]{198,199,66,201,188});
        findMin(new int[]{43,44,86,77,31});
    }
    //Методы
    static void findMin(int[] arrayMin){
        //Метод для наимшеньшего элемента массива
        int min = arrayMin[0]; //начало с 0 го индекса
        int minIndex = 0;
        for (int j = 0; j < arrayMin.length; j++){
            if (arrayMin[j] < min){
                min = arrayMin[j];
                minIndex = j;
            }
        }
        System.out.println("Минимальный элемент: " + min + " индекс -> " + minIndex);
    }
    static void findMax(int[] arrayMax){
        //Второй метеод
        int max = 0;
        int maxIdex = 0;
        for (int i = 0; i < arrayMax.length; i++) {
            if (arrayMax[i] > max) {
                max = arrayMax[i];
                maxIdex = i;
            }
        }
        System.out.println("Максимальный элемент: " + max + " -> индекс " + maxIdex);
    }
}
