package School;

public class School {
    private String scName;
    private String scAddress;
    private int scCode;
    private Student[] allStudents;

    public School (String scName, String scAddress, int scCode, Student[] allStudents) {
        this.scName = scName;
        this.scAddress = scAddress;
        this.scCode  = scCode;
        this.allStudents = allStudents;

    }
    public Student[] getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(Student[] allStudents) {
        this.allStudents = allStudents;
    }
    public void getSchoolInfo () {
        System.out.println("School name: " + scName + "\nSchool Addess: " + scAddress + "\nSchool Code: " + scCode);
        for (Student countStudent: getAllStudents())
            countStudent.getStudentsIngo();
    }


    public String getScName() {
        return scName;

    }

    public void setScName(String scName) {
        this.scName = scName;
    }

    public String getScAddress() {
        return scAddress;
    }

    public void setScAddress(String scAddress) {
        this.scAddress = scAddress;
    }
    public int getScCode() {
        return scCode;
    }
    public void setScCode (int scCode) {
        this.scCode = scCode;
    }
}
