package ss_1212.bai2_lamlai.models;

public class Product {
    private String code;
    private String name;
    private Long price;
    private Long quality;
    private Long expire;

    public Product() {
    }


    public Product(String code, String name, Long price, Long quality, Long expire) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.expire = expire;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuality() {
        return quality;
    }

    public void setQuality(Long quality) {
        this.quality = quality;
    }

    public Long getExpire() {
        return expire;
    }

    public void setExpire(Long expire) {
        this.expire = expire;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                ", expire=" + expire +
                '}';
    }
}
