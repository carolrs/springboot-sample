package com.carolrs.testingapp.service;

import com.carolrs.testingapp.model.Product;

public interface ProductRepository  {
    Product getById(int id);
}
