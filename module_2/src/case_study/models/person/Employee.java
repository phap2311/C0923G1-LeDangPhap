package case_study.models.person;

public class Employee extends Person {
    private String codeStaff;
    private String level;
    private String position;
    private Long wage;

    public Employee() {
    }

    public Employee(String fullName, String birthday, String gender, Long identityCardNumber, Long numberPhone, String email, String codeStaff, String level, String position, Long wage) {
        super(fullName, birthday, gender, identityCardNumber, numberPhone, email);
        this.codeStaff = codeStaff;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getCodeStaff() {
        return codeStaff;
    }

    public void setCodeStaff(String codeStaff) {
        this.codeStaff = codeStaff;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getWage() {
        return wage;
    }

    public void setWage(Long wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "codeStaff='" + codeStaff + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                "fullName='" + super.getFullName() + '\'' +
                ", birthday='" + super.getBirthday() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", identityCardNumber='" + super.getIdentityCardNumber() + '\'' +
                ", numberPhone='" + super.getNumberPhone() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                '}';
    }
}
