package ss17_io_binary_file_serialization.repositories;

import ss17_io_binary_file_serialization.models.Product;
import ss17_io_binary_file_serialization.util.ByteStream;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();


    @Override
    public void save(Product product) {
        productList = ByteStream.readObjectList();
        productList.add(product);
        ByteStream.writeObjectList(productList);

        }


    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findByCode(String code) {
        for (Product product : productList) {
            if (product.getCode().equalsIgnoreCase(code)) {
                return product;
            }
        }
        return null;
    }


}
