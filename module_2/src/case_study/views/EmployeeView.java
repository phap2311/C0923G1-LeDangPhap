package case_study.views;

import case_study.controller.EmployeeController;
import case_study.models.person.Employee;
import case_study.util.ErrorException;
import case_study.util.MyRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    EmployeeController employeeController = new EmployeeController();
    private static int choice;
    private static Scanner scanner = new Scanner(System.in);

    private List<Employee> employeeList = new ArrayList<>();
    private static String code;
    private static String fullName;
    private static String birthday;
    private static String gender;
    private static String identityCardNumber;
    private static String numberPhone;
    private static String email;
    private static String level;
    private static String position;
    private static Long wage;
    private static Employee employee;
    private static final String CODE_STAFF = "^NV-[0-9]{4}$";
    private static final String NAME_STAFF = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}(?<=^.{1,50}$)$";
    private static final String BIRTHDAY_STAFF = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";
    private static final String IDENTITY_CARD_NUMBER = "^[0-9]{9}|[0-9]{12}$";
    private static final String PHONE_NUMBER = "^0[0-9]{9}$";


    public void menuEmployee() {

        do {
            System.out.println("Please choice numbers: ");
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Delete employee");
            System.out.println("5.Search by name employee");
            System.out.println("6.Return main employee");
            choice = ErrorException.checkChoice();
            switch (choice) {
                case 1:
                    employeeList = employeeController.findAll();
                    for (Employee employee : employeeList) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    employee = inputInfor();
                    employeeController.addEmployee(employee);
                    System.out.println("add success");
                    break;
                case 3:
                    System.out.println("Input code staff revised");
                    code = scanner.nextLine();
                    employee = employeeController.checkCodeStaff(code);
                    if (employee != null) {
                        System.out.println("content revised is " + employee);
                        System.out.println("Input content revised");

                        System.out.println("1.Revise full name");
                        System.out.println("2.Revise birthday");
                        System.out.println("3.Revise gender");
                        System.out.println("4.Revise indentity card number ");
                        System.out.println("5.Revise phone number");
                        System.out.println("6.Revise email");

                        System.out.println("7.Revise level");
                        System.out.println("8.Revise position");
                        System.out.println("9.Revise wage");
                        choice = ErrorException.checkChoice();
                        switch (choice) {
                            case 1:
                                System.out.println("Input full name revised");
                                fullName = scanner.nextLine();
                                employeeController.editFullName(fullName, employee);
                                System.out.println("Revise success");
                                break;
                            case 2:
                                System.out.println("Input birthday revised");
                                birthday = scanner.nextLine();
                                employeeController.editBirthday(birthday, employee);
                                System.out.println("Revise success");
                                break;
                            case 3:
                                System.out.println("Input gender revised");
                                gender = scanner.nextLine();
                                employeeController.editGender(gender, employee);
                                System.out.println("Revise success");
                                break;
                            case 4:
                                System.out.println("Input indentity card number revised");
                                identityCardNumber = scanner.nextLine();
                                employeeController.editIDCard(identityCardNumber, employee);
                                System.out.println("Revise success");
                                break;
                            case 5:
                                System.out.println("Input phone number revised");
                                numberPhone = scanner.nextLine();
                                employeeController.editNumberPhone(numberPhone,employee);
                                System.out.println("Revise success");
                                break;
                            case 6:
                                System.out.println("Input email revised");
                                email = scanner.nextLine();
                                employeeController.editEmail(email,employee);
                                System.out.println("Revise success");
                                break;
                            case 7:
                                System.out.println("Input level resived");

                        }


                    } else {
                        System.out.println("Don't find code staff");


                    }
            }
        }
        while (true);

    }


    private Employee inputInfor() {
        code = inputCode();
        fullName = inputFullName();
        birthday = inputBirthday();
        System.out.println("Input gender");
        gender = scanner.nextLine();
        identityCardNumber = inputIdCard();
        numberPhone = inputNumberPhone();
        System.out.println("Input email");
        email = scanner.nextLine();
        level = inputLevel();
        System.out.println("Input position");
        position = inputPosition();

        wage = inputWage();
        return new Employee(code, fullName, birthday, gender, identityCardNumber, numberPhone, email, level, position, wage);
    }

    private String inputPosition() {
        position = null;
        do {
            System.out.println("Input your position");
            System.out.println("1. Receptionist");
            System.out.println("2. Service");
            System.out.println("3. Specialist");
            System.out.println("4. Supervisor");
            System.out.println("5. Manager");
            System.out.println("6. Director");
            choice = ErrorException.checkChoice();
            switch (choice){
                case 1:
                    position ="Receptionist";
                    break;
                case 2:
                    position ="Service";
                    break;
                case 3:
                    position = "Specialist";
                    break;
                case 4:
                    position = "Supervisor";
                    break;
                case 5:
                    position = "Manager";
                    break;
                case 6:
                    position = "Director";
                    break;
                default:
                    System.out.println("Please input again");
            }
        }
        while (true);
    }

    private String inputLevel() {
        level = null;
        do {
            System.out.println("Input level of you ");
            System.out.println("1.Intermediate");
            System.out.println("2.College");
            System.out.println("3.University");
            System.out.println("4.Postgraduate");
            choice = ErrorException.checkChoice();
            switch (choice){
                case 1:
                    level = "Intermediate";
                    break;
                case 2:
                    level = "College";
                    break;
                case 3:
                    level = "University";
                    break;
                case 4:
                    level ="Postgraduate";
                default:
                    System.out.println("Please input again");
            }
        }
        while (true);


    }

    private Long inputWage() {
        wage = null;
        try {
            do {
                System.out.println("Input wage");
                wage = Long.valueOf(scanner.nextLine());
                if (wage > 0) {
                    return wage;
                } else {
                    System.out.println("Please input again");
                }
            } while (true);
        } catch (NumberFormatException e) {
            System.out.println("Error format");
        }

        return null;
    }

    private String inputNumberPhone() {
        numberPhone = null;
        try {
            do {
                System.out.println("Input number phone");
                numberPhone = scanner.nextLine();

                if (MyRegex.checkRegex(PHONE_NUMBER, numberPhone)) {
                    return numberPhone;
                } else {
                    System.out.println("Please input again ");
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("not find file");
        }

        return null;
    }

    private String inputIdCard() {
        identityCardNumber = null;
        try {
            do {
                System.out.println("Input identity card number");
                identityCardNumber = scanner.nextLine();
                if (MyRegex.checkRegex(IDENTITY_CARD_NUMBER, String.valueOf(identityCardNumber))) {
                    return identityCardNumber;
                } else {
                    System.out.println("Please input again");
                }
            } while (true);
        } catch (NumberFormatException e) {
            System.out.println("Error format");
        }
        return null;
    }

    private String inputBirthday() {
        birthday = null;
        try {
            do {
                System.out.println("Input birthday");
                birthday = scanner.nextLine();
                if (MyRegex.checkRegex(BIRTHDAY_STAFF, birthday)) {
                    return birthday;
                } else {
                    System.out.println("Error format, please input again ");
                }
            }
            while (true);
        } catch (Exception e) {
            System.out.println("not find file");
        }

        return null;
    }

    private String inputFullName() {
        fullName = null;
        try {
            do {
                System.out.println("Input fullname: ");
                fullName = scanner.nextLine();
                if (MyRegex.checkRegex(NAME_STAFF, fullName)) {
                    return fullName;
                } else {
                    System.out.println("Error format, please input again ");
                }
            }
            while (true);
        } catch (Exception e) {
            System.out.println("not find file");
        }


        return null;
    }

    private String inputCode() {
        code = null;
        try {
            do {
                System.out.println("Input code staff, ex: (NV-xxxx)  ");
                code = scanner.nextLine();
                if (MyRegex.checkRegex(CODE_STAFF, code)) {
                    return code;
                } else {
                    System.out.println("Error format, please input again");
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Not read file");
        }


        return null;
    }


}