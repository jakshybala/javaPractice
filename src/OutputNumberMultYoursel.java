public class OutputNumberMultYoursel {
    public static void main(String[] args) {

        int sum = 1;
        for (int j = 0; j < 20; j++) {
            sum = (sum * 2) ;
            System.out.print(sum);
            System.out.print(" ");
        }
        System.out.print(" ");
        System.out.println();

        for (int i=2; i<100; i++){
            if (i % 2 == 1){
                System.out.print(i);
            }
        }


    }
}