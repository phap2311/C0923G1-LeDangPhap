package ss17_io_binary_file_serialization.util;

import ss17_io_binary_file_serialization.models.Product;

import java.io.*;
import java.util.List;

public class ByteStream {
    private final static String FILE_PATH = "D:\\codegym\\C0923G1-LeDangPhap\\module_2\\src\\ss17_io_binary_file_serialization\\util\\product.dat";


    public static void writeObjectList(List<Product> productList) {
        FileOutputStream fos;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(FILE_PATH);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi không đọc được file");
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                System.out.println("Lỗi không đọc được file");;
            }
        }

    }

    public static List<Product> readObjectList() {
        List<Product> productList = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(FILE_PATH);
            ois = new ObjectInputStream(fis);
             productList = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi không đọc được file");
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi không tìm thấy lớp");
        }
        finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException e) {
                System.out.println("Lỗi không đọc được file");
            }

        }

        return productList;
    }
}
