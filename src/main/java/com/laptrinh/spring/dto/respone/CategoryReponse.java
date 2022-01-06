package com.laptrinh.spring.dto.respone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryReponse implements Serializable {

    private Integer  id;
    private String  name;
    private String  nameVN;

 //   List<Product> products = null;

}
