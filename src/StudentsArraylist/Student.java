package StudentsArraylist;

public class Student {
    private String name;
    private int age;
    private Group groups;

    public Student(String name, int age, Group groups) {
        this.name = name;
        this.age = age;
        this.groups = groups;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Group getGroups() {
        return groups;
    }

    public void setGroups(Group groups) {
        this.groups = groups;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groups='" + groups + '\'' +
                '}';
    }
}
