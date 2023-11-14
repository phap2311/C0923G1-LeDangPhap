package ss8_mvc.constroller;

import ss8_mvc.model.Student;
import ss8_mvc.service.StudentService;
import ss8_mvc.service.StudentServicelmpl;

import java.util.Scanner;

public class StudentController {
    private static StudentService service = new StudentServicelmpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0 ;
        do {
            System.out.println("Student Manager");
            System.out.println("1.List");
            System.out.println("2.Add new student");
            System.out.println("3.Edit");
            System.out.println("9.Exit");
            System.out.println("Please input number:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    Student[] studentlist = service.findAll();
                    for (Student student : studentlist) {
                        System.out.println(student);
                    }
                    break;
                case 2:
                    System.out.println("Input id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input name: ");
                    String name = scanner.nextLine();
                    System.out.println("Input point: ");
                    double point = Double.parseDouble(scanner.nextLine());
                    Student student = new Student(id, name, point);
                    service.save(student);
                    break;
                case 9:
                    System.exit(0);
            }
        }
        while (true);

        }
    }

