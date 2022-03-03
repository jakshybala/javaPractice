package WeekEnumTask21;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainWeek {
    public static void main(String[] args) {
        Week[] weeksArray = Week.values();
        Scanner enterData = new Scanner(System.in);
        System.out.println("Enter week days name: ");
        String nameEnter = enterData.nextLine();
        for (int i = 0; i < weeksArray.length; i++) {
            if (weeksArray[i].name().equals(nameEnter)) {
                System.out.println(weeksArray[i].getWeekTranslate());
            }

        }

        }
    }


