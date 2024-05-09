package amoa.webservices;

import java.util.ArrayList;
import java.util.List;

public class ProductsManagerImpl implements ProductsManager {

    private static Products products = new Products(new ArrayList<>());

    @Override
    public long addProduct(Product product) {
        products.addProduct(product);
        return product.getId();
    }

    @Override
    public Product getProduct(long id) throws NoSuchProductException {
        Product product = products.getProduct(id);
        if (product == null) {
            throw new NoSuchProductException("No such product");
        }
        return product;
    }

    @Override
    public double getProductPrice(long id) throws NoSuchProductException {
        Product product = getProduct(id);
        return product.getPrice();
    }

    @Override
    public Products getProducts() {
        return products;
    }

    @Override
    public Product updateProduct(Product product) {
        Product existingProduct = products.getProduct(product.getId());
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            return existingProduct;
        } else {
            throw new NoSuchProductException("No such product");
        }
    }

    @Override
    public boolean deleteProduct(long id) {
        return products.removeProduct(id);
    }

    @Override
    public boolean deleteAllProducts() {
        products.clear();
        return true;
    }
}