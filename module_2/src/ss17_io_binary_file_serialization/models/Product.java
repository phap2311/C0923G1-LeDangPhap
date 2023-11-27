package ss17_io_binary_file_serialization.models;

import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String nameProduct;
    private String price;
    private String companyProduct;
    private String desribeProduct;

    public Product() {
    }

    public Product(String code, String nameProduct, String price, String companyProduct, String desribeProduct) {
        this.code = code;
        this.nameProduct = nameProduct;
        this.price = price;
        this.companyProduct = companyProduct;
        this.desribeProduct = desribeProduct;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCompanyProduct() {
        return companyProduct;
    }

    public void setCompanyProduct(String companyProduct) {
        this.companyProduct = companyProduct;
    }

    public String getDesribeProduct() {
        return desribeProduct;
    }

    public void setDesribeProduct(String desribeProduct) {
        this.desribeProduct = desribeProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price='" + price + '\'' +
                ", companyProduct='" + companyProduct + '\'' +
                ", desribeProduct='" + desribeProduct + '\'' +
                '}';
    }
}
