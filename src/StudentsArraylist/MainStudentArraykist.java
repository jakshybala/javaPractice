package StudentsArraylist;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;
import static StudentsArraylist.Group.*;

public class MainStudentArraykist {
    public static void main(String[] args) {
        Student[] studentsArray = {new Student("Maxim", 35, Group.JAVA), new Student("Andrew", 30, Group.JS),
                                    new Student("Kamil", 16, Group.JAVA), new Student("Jack", 19, JS)};

//        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(studentsArray));
        List<Student> studentsList = List.of(studentsArray);
        List<Student> javaStudents = new ArrayList<>();
        List<Student> jsStudents = new ArrayList<>();
        List<Student> ageFiltre = new ArrayList<>();
        List<Student> byNameFiltre = new ArrayList<>();

        System.out.println("Total students: " + (studentsList.size()));
        System.out.println("Filtered by Group JAVA: " + groupAndListFiltre(studentsList, JAVA));
        System.out.println("Filtered by Group JS: "+ groupAndListFiltre(studentsList,JS).size());
        System.out.println("Age" + ageFiltredMethod(studentsList));
        System.out.println("Filtered by letter: " + letterFilteredMethod(studentsList, "A"));
        System.out.println("Filtered by age more than 30: " + oldFiltered(studentsList));
        System.out.println("Filtered by letter K:" + kLetterFilteredMethod(studentsList, "K"));
        System.out.println("Remove Students by age less than 16: " + removeByAgeMethod(studentsList));




    }
    private static List<Student> groupJAVAFiltreMethod(List<Student> students,  List<Student> java) {
        for (Student student : students) {
            if (student.getGroups().equals(Group.JAVA)){
                java.add(student);
            }
        } return java;
    }
    private static List<Student> groupJSFiltreMethod(List<Student> students,  List<Student> js) {
        for (Student student : students) {
            if (student.getGroups().equals(JS)){
                js.add(student);
            }
        } return js;
    }
    private static List<Student> groupAndListFiltre(List<Student> students, Group group){
        List<Student> groupFiltredList = new ArrayList<>();
        int count = 0;
        for (Student student : students) {
            if(student.getGroups().equals(group)) {
                groupFiltredList.add(student);
                count++;
            }
        }
        return groupFiltredList;
    }

    private static List<Student> ageFiltredMethod(List<Student> students) {
        List<Student> ageFilteredList = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > 18 && student.getAge() < 25) {
                ageFilteredList.add(student);
            }

        }
        return ageFilteredList;

    }
    private static List<Student> oldFiltered(List<Student> students){
        List<Student> oldFilteredList = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > 30) {
                oldFilteredList.add(student);
            }

        }
        return oldFilteredList;
    }
    public static List<Student> letterFilteredMethod(List<Student> students, String letter){
        List<Student> letterFilteredList = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains(letter)) {
                letterFilteredList.add(student);
            }

        }
        return letterFilteredList;
    }
    public static List<Student> kLetterFilteredMethod(List<Student> students, String letterK) {
        List<Student> kLetterList = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains(letterK)) {
                kLetterList.add(student);
            }

        }
        return kLetterList;
    }
    private static List<Student> removeByAgeMethod(List<Student> students) {
        List<Student> removeList = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > 16) {
                removeList.add(student);
            }
            else if (student.getAge() < 16 ) {

                removeList.remove(student);
            }


        }
        return removeList;
    }


    private static void printList (List<?> arryalist) {
        for (Object o : arryalist) {
            System.out.println(o);

        }
    }
}
