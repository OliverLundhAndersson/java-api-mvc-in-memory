package com.booleanuk.api.products;

import java.util.HashMap;

public class ProductRepository {
    private HashMap<Integer, Product> products;

    public ProductRepository() {
        this.products = new HashMap<>();

        Product product = new Product("Oasis", "Band", 50000);
        this.products.put(product.getId(), product);
        product = new Product("Pizza", "Food", 50);
        this.products.put(product.getId(), product);
    }

    public HashMap<Integer, Product> getAll() {
        return this.products;
    }

    public Product getOne(int id) {
        if (this.products.containsKey(id)) {
            return this.products.get(id);
        }
        return null;
    }

    public Product create(Product product) {
        this.products.put(product.getId(), product);
        return product;
    }

    public Product update(int id, Product product) {
        if (this.products.containsKey(id)) {
            Product productToUpdate = this.products.get(id);
            productToUpdate.setName(product.getName());
            productToUpdate.setCategory(product.getCategory());
            productToUpdate.setPrice(product.getPrice());
            return productToUpdate;
        }
        return null;
    }

    public Product delete(int id) {
        return this.products.remove(id);
    }
}
