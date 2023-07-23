package com.carolrs.testingapp.service;

import com.carolrs.testingapp.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    // GIVEN - A PRODUCT
    // WHEN - HAS STOCK
    //THEN - RETURN THE PRODUCT
    @InjectMocks
    private ProductService target;
    @Mock
    private ProductRepository repo;

    @Test
    public void shouldReturnProductWithStock (){
        Product expectedProduct = new Product("Frodge",1,10);

        Mockito.when(repo.getById(1))
                .thenReturn(expectedProduct);

        Product result = target.getProduct(1);
        Assertions.assertEquals(1, result.getId());

    }

    @Test
    public void shouldNotReturnProductWithNoStock (){

        Product expectedProduct = new Product("Frodge",1,0);

        Mockito.when(repo.getById(1))
                .thenReturn(expectedProduct);

        Product result = target.getProduct(1);
        Assertions.assertNull(result);
    }


}