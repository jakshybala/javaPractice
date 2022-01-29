import java.util.SplittableRandom;

public class BooleanMethod {
    public static void main(String[] args) {
        System.out.println(searrchArray("Man"));
        System.out.println();
        System.out.println(howMuchTime("name"));
    }

    static int howMuchTime (String check){
        String[] arrayList = new String[]{"Adilet", "Jyldyz", "name", "name"} ;
        int summ = 0;
        for (int i = 0; i < arrayList.length; i++){
            if (arrayList[i].equals(check)){
                summ = summ +i;
                return summ;

            }

        }
        return 0;
    }

    static String  searrchArray (String word){
        String[] arrayName = new String[] {"Man","Apple","Apple"};
            for (int i = 0; i < arrayName.length; i++){
                if (arrayName[i].equals(word)){
                    return "Такое слово имеется в массиве";
                    //System.out.printf("Такой %s элемент имеется в массиве %s%n", searchData , "под индексом-> "+ i);

                }
            }
            return "Такое слово не имеется в массиве";





        }


}
