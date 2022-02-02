public class oneToThreeDivide {
    public static void main(String[] args) {
        int threeSum = 0;
        int fourSum = 0;
        int fiveSum = 0;
        for (int i = 1; i<=300; i++){
            if (i % 3 == 0){
                threeSum = threeSum +i;
                //System.out.println(i);
            }
            else if (i % 4 ==0) {
                fourSum = fourSum +i;
            }
            else if (i % 5 ==0){
                fiveSum = fiveSum +i;
            }
            }
        System.out.println("Сумма без остатков 3 равна: " + threeSum);
        System.out.println("Сумма без остатков 4 равна: " + fourSum);
        System.out.println("Сумма без остатков 5 равна: " + fiveSum);

        }
    }

