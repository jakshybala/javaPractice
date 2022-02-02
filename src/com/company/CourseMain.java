package com.company;

public class CourseMain {
    public static void main(String[] args) {

        Course course = new Course();
        course.setsName("Java");
        course.setsTeacher("Nursultan");
        course.setCourseStartDate(2022);
        course.getCourse();
        System.out.println();


        Students students = new Students();

        students.setBirthdayDate(-2000);
        students.setsName("Max");
        students.setsSurname("Asanaliev");
        students.setHowOld(-20);
        students.checkData();
        students.getStudets();





    }
}
