package School;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Azamat","B",-1);
        Student student2 = new Student("Asan", "C", 4);
        Student student3 = new Student("Asan", "C", 5);
//        student1.checkSdata();
//        student1.getStudentsIngo();

        School school = new School("Steam School", "Chyngyz Aytmatova", 123, new Student[]{});
        Student[] students = {student1, student2, student3};
        school.setAllStudents(students);
        school.getSchoolInfo();






    }
}
