package com.carolrs.testingapp.service;

import com.carolrs.testingapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // could be a component  // when you use these annotations you create a spring bean which is a singleton instance.
public class ProductService{

    @Autowired
    private ProductRepository repository;
    public Product getProduct(int id) {
        Product prod = repository.getById(id);

        return prod.hasStock() ? prod : null;
    }
}
