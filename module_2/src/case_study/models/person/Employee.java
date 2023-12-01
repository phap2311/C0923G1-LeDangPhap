package case_study.models.person;

public class Employee extends Person {

    private String level;
    private String position;
    private Long wage;

    public Employee() {
    }

    public Employee(String code,String fullName, String birthday, String gender, String identityCardNumber, String numberPhone, String email, String level, String position, Long wage) {
        super(code,fullName, birthday, gender, identityCardNumber, numberPhone, email);

        this.level = level;
        this.position = position;
        this.wage = wage;
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

                "code='" + super.getCode() + '\'' +
                "fullName='" + super.getFullName() + '\'' +
                ", birthday='" + super.getBirthday() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", identityCardNumber='" + super.getIdentityCardNumber() + '\'' +
                ", numberPhone='" + super.getNumberPhone() + '\'' +
                ", email='" + super.getEmail() + '\'' +

                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +

                '}';
    }
}
