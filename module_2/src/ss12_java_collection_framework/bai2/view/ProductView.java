package ss12_java_collection_framework.bai2.view;

import ss12_java_collection_framework.bai2.constrollers.ProductController;
import ss12_java_collection_framework.bai2.models.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);
    private static Product product;
    private ProductController productController = new ProductController();

    public void menuProrduct() {
        int choice;
        String editCode;
        Product productEdit;
        Product product1;
        String code;
        Product productRemove;
        String codeSearch;
        Product productSearch;
        List<Product> products;

        do {
            System.out.println("------------------");
            System.out.println("Quản lý sản phẩm");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa sản phẩm");
            System.out.println("3.Hiện thị sản phẩm");
            System.out.println("4.Xóa sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("0.Quay lại menu chính");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    product = inputInfoProduct();
                    productController.addProduct(product);
                    System.out.println("Thêm mới thành công");
                    break;
                case 2:
                    System.out.println("Nhập vào code bạn cần sửa");
                    editCode = scanner.nextLine();
                    productEdit = productController.findByEditCode(editCode);
                    if (productEdit == null) {
                        System.out.println("không tìm thấy sản phẩm cần sửa");
                    } else {
                        productController.removeE(editCode);
                    }
                    product1 = inputInfoProduct();
                    productController.editProduct(product1);
                    break;
                case 3:
                    products = productController.getAll();
                    for (Product temp : products) {
                        System.out.println(temp);
                    }
                    break;
                case 4:
                    code = scanner.nextLine();
                    productRemove = productController.findByCode(code);
                    if (productRemove == null) {
                        System.out.println("Không tìm thấy sản phẩm cần xóa");
                    } else {
                        System.out.println("Thông tin của sản phẩm cần xóa: " + productRemove);
                        System.out.println("Bạn có chắc muốn xóa người này? Bấm y để xác nhận: ");
                        String confirm = scanner.nextLine();
                        if (confirm.equals("y")) {
                            productController.remove(code);
                            System.out.println("Xóa thành công");

                        }
                    }
                    break;
                case 5:
                    codeSearch = scanner.nextLine();
                    productSearch = productController.findByCodeSearch(codeSearch);
                    if (productSearch == null) {
                        System.out.println("Không tìm thấy sản phẩm cần tìm");
                    } else {
                        System.out.println("Thông tin của sản phẩm bạn cần tìm: " + productSearch);


                    }
                case 0:
                    return;
            }
        }
        while (choice != 0);
    }

    private Product inputInfoProduct() {
        System.out.println("Nhập mã sản phẩm: ");
        String code = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        Long price = Long.valueOf(scanner.nextLine());
        System.out.println("Nhập số lượng: ");
        Long quality = Long.valueOf(scanner.nextLine());
        System.out.println("Nhập ngày hết hạn: ");
        String expire = scanner.nextLine();
        return new Product(code, name, price, quality, expire);
    }
}

