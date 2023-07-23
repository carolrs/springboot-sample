package com.carolrs.testingapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data  //annotation @get/ @setter / @tooString /Equals and Hash code
@AllArgsConstructor
public class Product {

    private String name;
    private int id;

    private int stock;

    public boolean hasStock(){
        return stock > 0;
    }

}
