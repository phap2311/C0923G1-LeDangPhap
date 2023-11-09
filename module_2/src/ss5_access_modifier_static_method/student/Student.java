package ss5_access_modifier_static_method.student;

public class Student {
    private String name;
    private String classess;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassess() {
        return classess;
    }

    public void setClassess(String classess) {
        this.classess = classess;
    }

    public Student() {

    }

    public Student(String name, String classess) {
        this.name = "john";
        this.classess = "C02";

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "classes='" + classess + '\'' +
                '}';
    }
}




