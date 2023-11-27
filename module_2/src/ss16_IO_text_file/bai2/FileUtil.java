package ss16_IO_text_file.bai2;

import ss16_IO_text_file.bai2.Nation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_NATION = "D:\\codegym\\C0923G1-LeDangPhap\\module_2\\src\\ss16_IO_text_file\\bai2\\filenation.csv";

    public static List<Nation> readCSV() {
        List<Nation> nationList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader buff = null;
        try {
            fileReader = new FileReader(FILE_NATION);
            buff = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("Tên đường dẫn không tồn tại");
        }
        String line;
        String temp[];
        try {
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                Nation nation = new Nation(id, code, name);
                nationList.add(nation);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        return nationList;
    }

    public static void main(String[] args) {
        List<Nation> nationList = readCSV();
        for (Nation nation : nationList) {
            System.out.println(nation);
        }
    }
}
