package com.laptrinh.spring.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequest {
    private Integer id;
    private String  name;
    private String  nameVN;

    public CategoryRequest(String name, String nameVN) {
        this.name = name;
        this.nameVN = nameVN;
    }
}
