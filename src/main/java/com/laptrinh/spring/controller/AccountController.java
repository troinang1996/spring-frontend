package com.laptrinh.spring.controller;

import com.laptrinh.spring.dto.request.CustomerRequest;
import com.laptrinh.spring.dto.respone.CustomerReponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    HttpServletRequest request;
    @GetMapping("/login")
    public String login(){
        return "account/index";
    }
    @PostMapping("login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        HttpEntity<CustomerRequest> request = new HttpEntity<>(new CustomerRequest(username,password));
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8085/account/login";
        HttpEntity<CustomerReponse> customerRequest = restTemplate.postForEntity(url,request,CustomerReponse.class); // gửi request qua bên backend
        // dữ liệu nhận về lúc nào cũng có 2 phần : 1 là body ; 2 là header
        CustomerReponse response = customerRequest.getBody();
        if(response !=null && response.getMessage().toLowerCase().equals("success") && response.getPassWord().equals(password)){
            model.addAttribute("notify","Tài khoản chính xác");

        }else{
            model.addAttribute("notify","Sai thông tin tài khoản hoặc mật khẩu");
            return "account/index";
        }
        return  "admin/home/index"; // Trả về view  /WEB-INF/views/home/index.jsp
    }

}
