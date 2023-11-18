package ss_1212.bai2_lamlai.view;

import ss_1212.bai2_lamlai.constrollers.ProductConstroller;
import ss_1212.bai2_lamlai.models.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);
    private ProductConstroller productConstroller = new ProductConstroller();
    public void menuproduct() {
        int choice;
        do {
            System.out.println("Quản lý sản phẩm");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa sản phẩm");
            System.out.println("3.Hiển thị sản phẩm");
            System.out.println("4.Xóa sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("0.Quay lại menu chính");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Product product = inputInfoProduct();
                    productConstroller.addProduct(product);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    List<Product> products = productConstroller.getAll();
                    for (Product temp : products){
                        System.out.println(temp);
                    }
                    break;
                case 4:
                    System.out.println("Nhập code cần xóa");
                    String code = scanner.nextLine();
                    Product productRemove = productConstroller.findByCode(code);
                    if(productRemove==null){
                        System.out.println("Không tìm thấy phần tử cần xóa");
                    }
                    else {
                        System.out.println("thông tin bạn cần xóa là: " + productRemove);
                        System.out.println("Bạn có chắn chắn muốn xóa không? Bấm y để xác nhận: ");
                        String confirm = scanner.nextLine();
                        if(confirm.equals("y")){
                            productConstroller.remove(code);
                            System.out.println("đã xóa thành công");
                        }
                    }
            }


        }
        while (choice!=0);
    }

    private Product inputInfoProduct() {
        System.out.println("Nhập mã sản phẩm");
        String code = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        Long price = Long.valueOf(scanner.nextLine());
        System.out.println("Nhập số lượng");
        Long quality = Long.valueOf(scanner.nextLine());
        System.out.println("Nhập ngày hết hạn");
        Long expire = Long.valueOf(scanner.nextLine());
        return new Product(code,name,price,quality,expire);
    }
}
