package ss16_IO_text_file.bai1;


import java.awt.*;
import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileCopy {

    private static final String FILE_PATH = "D:\\codegym\\C0923G1-LeDangPhap\\module_2\\src\\ss16_IO_text_file\\bai1\\sourceFile.csv";
    private static final String FILE_TARGET = "D:\\codegym\\C0923G1-LeDangPhap\\module_2\\src\\ss16_IO_text_file\\targetFile.csv";

    public static String readCsv(String FILE_PATH) {

        FileReader fileReader;
        BufferedReader buff = null;
        String line = null;
        String result = "";
        try {
            fileReader = new FileReader(FILE_PATH);
            buff = new BufferedReader(fileReader);
            while ((line = buff.readLine()) != null) {
                result += line + "\n";
            }
        } catch (IOException e) {
            System.out.println("Không đọc được file");

        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                System.out.println("Không đọc được file ");

            }
        }
        return result;
    }


    public static void writeCsv(String result) {
        FileWriter fileWriter = null;
        BufferedWriter buff = null;
        try {
            fileWriter = new FileWriter(FILE_TARGET);
            buff = new BufferedWriter(fileWriter);
            buff.write(result);
        } catch (IOException e) {
            System.out.println("Không đọc được file");
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                System.out.println("Không đọc được file");
            }
        }


    }

    public static void main(String[] args) {
        System.out.println(readCsv(FILE_PATH));
        writeCsv(readCsv(FILE_PATH));

    }
}