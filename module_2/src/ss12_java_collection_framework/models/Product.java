package ss12_java_collection_framework.models;

public class Product {
    private String code;
    private String nameProduct;
    private Long price;
    private Long quality;
    private String expire;


    public Product() {
    }

    public Product(String code, String nameProduct, Long price, Long quality, String expire) {
        this.code = code;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quality = quality;
        this.expire = expire;
    }

    public long getQuality() {
        return quality;
    }

    public void setQuality(Long quality) {
        this.quality = quality;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ",quality =" + quality +
                ", expire=" + expire +
                '}';
    }

}
