import java.util.Scanner;

public class DecreaseNumb {
    public static void main(String[] args) {
        decreaseMethod();
        }
    static void decreaseMethod (){
        Scanner enterNum = new Scanner(System.in);
        System.out.println("Введите целое число");
        //int results = num;
        int number = enterNum.nextInt();
        for (int i=0; i<=number; i++){
            System.out.println (number-i);
            //System.out.print(" ");

    }
        //return results;
}

}
