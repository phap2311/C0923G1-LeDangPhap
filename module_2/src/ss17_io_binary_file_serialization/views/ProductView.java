package ss17_io_binary_file_serialization.views;

import ss17_io_binary_file_serialization.controllers.ProductController;
import ss17_io_binary_file_serialization.models.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);
    private ProductController productController = new ProductController();
    private static int choice;
    private String code;
    private Product productSearch;
    private Product product;
    private List<Product> products;

    public void menuProduct() {
        do {
            System.out.println("----- Quản lý sản phẩm-------");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Hiển thị sản phẩm");
            System.out.println("3.Tìm kiếm sản phẩm");
            System.out.println("0.Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    product = inputInformation();
                    productController.addProduct(product);
                    System.out.println("Thêm thành công");
                    break;

                case 2:
                    products = productController.getAll();
                    for (Product product1 : products) {
                        System.out.println(product1);
                    }
                    break;
                case 3:
                    System.out.println("Nhập code cần tìm");
                    code = scanner.nextLine();
                    productSearch = productController.findByCode(code);
                    if (productSearch == null) {
                        System.out.println("Không tìm thấy code");
                    } else {
                        System.out.println("Thông tin sản phẩm cần tìm của bạn là: " + productSearch);
                    }
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        }
        while (true);
    }

    private Product inputInformation() {
        System.out.println("Nhập mã sản phẩm");
        String code = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập giá");
        String price = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String companyProduct = scanner.nextLine();
        System.out.println("Mô tả sản phẩm");
        String desribeProduct = scanner.nextLine();
        return new Product(code, nameProduct, price, companyProduct, desribeProduct);
    }
}
