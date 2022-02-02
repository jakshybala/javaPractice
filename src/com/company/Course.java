package com.company;

public class Course {
    private String courseName;
    private int sNumber;
    private String sTeacher;
    private int courseStartDate;

    public void getCourse(){
        System.out.println("Course: " + courseName + "\nStudents number: " + sNumber + "\nTeachers  name: " + sTeacher + "\nCourse Start date: " + courseStartDate);
    }

    public String getsName() {
        return courseName;
    }

    public void setsName(String courseName) {
        this.courseName = courseName;
    }

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    public String getsTeacher() {
        return sTeacher;
    }

    public void setsTeacher(String sTeacher) {
        this.sTeacher = sTeacher;
    }

    public int getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(int courseStartDate) {
        this.courseStartDate = courseStartDate;
    }
}
