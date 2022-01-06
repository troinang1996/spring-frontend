package com.laptrinh.spring.dto.respone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerReponse {
    private String message;
    private  String username;
    private String passWord;
}
