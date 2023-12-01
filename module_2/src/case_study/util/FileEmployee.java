package case_study.util;

import case_study.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileEmployee {
    private static final String FILE_EMPLOYEE = "D:\\codegym\\C0923G1-LeDangPhap\\module_2\\src\\case_study\\util\\saveFile.csv";

    public static List<Employee> readCSV() {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader buff = null;
        try {
            fileReader = new FileReader(FILE_EMPLOYEE);
            buff = new BufferedReader(fileReader);
            String line;
            String temp[];
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                String code = temp[0];
                String fullName = temp[1];
                String birthday = temp[2];
                String gender = temp[3];
                String identityCardNumber = temp[4];
                String numberPhone = temp[5];
                String email = temp[6];
                String level = temp[7];
                String position = temp[8];
                Long wage = Long.parseLong(temp[9]);
                Employee employee = new Employee(code,fullName, birthday, gender, identityCardNumber, numberPhone, email, level, position, wage);
                employeeList.add(employee);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Error didn't find file ");
        } catch (IOException e) {
            System.out.println("Error didn't read file ");
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                System.out.println("Error didn't read file ");
            }
        }
        return employeeList;


    }

    public static void writeCSV(List<Employee> employeeList) {
        FileWriter fileWriter;
        BufferedWriter buff = null;
        String data="";
        try {
            fileWriter = new FileWriter(FILE_EMPLOYEE);
            buff = new BufferedWriter(fileWriter);
            for (Employee employee: employeeList){
                data += employee.getCode()+","+employee.getFullName()+","+employee.getBirthday()+","+ employee.getGender()+","+ employee.getIdentityCardNumber()+","+ employee.getNumberPhone()+","+ employee.getEmail()+","+ employee.getLevel()+","+ employee.getPosition()+","+ employee.getWage()+"\n";
            }

            buff.write(data.toString());
        } catch (IOException e) {
            System.out.println("Error didn't read file ");
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                System.out.println("Error didn't read file ");
            }
        }


    }
}
