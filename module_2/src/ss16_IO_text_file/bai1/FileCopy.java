package ss16_IO_text_file.bai1;


import java.awt.*;
import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileCopy {

    private static final String FILE_PATH = "D:\\codegym\\C0923G1-LeDangPhap\\module_2\\src\\ss16_IO_text_file\\sourceFile.csv";
    private static final String FILE_TARGET = "D:\\codegym\\C0923G1-LeDangPhap\\module_2\\src\\ss16_IO_text_file\\targetFile.csv";

    public static String readCsv(String FILE_PATH) throws IOException {

        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        String line;
        String result = "";
        while ((line = buff.readLine()) != null) {
            result += line + "\n";
        }
        buff.close();
        return result;
    }

    public static void writeCsv(String result) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_TARGET);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        buff.write(result);
        buff.close();

    }

    public static void main(String[] args) {
        try {
            System.out.println(readCsv(FILE_PATH));
            writeCsv(readCsv(FILE_PATH));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}