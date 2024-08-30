package com.booleanuk.api.products;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("products")
public class ProductController {
    ProductRepository productRepository = new ProductRepository();

    @GetMapping
    public HashMap<Integer, Product> getAll() {
        return this.productRepository.getAll();
    }

    @GetMapping("{id}")
    public Product getOne(@PathVariable int id) {
        return this.productRepository.getOne(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return this.productRepository.create(product);
    }

    @PutMapping("{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        return this.productRepository.update(id, product);
    }

    @DeleteMapping("{id}")
    public Product deleteProduct(@PathVariable int id) {
        return this.productRepository.delete(id);
    }
}
