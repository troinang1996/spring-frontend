package com.laptrinh.spring.controller;

import com.laptrinh.spring.dto.respone.ProductResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("/index")
    public String index(Model model){
        // gửi requesr lấy all thông tin loại sản phẩm
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "http://localhost:8085/category/index"; // gửi url qua server backend
//        HttpEntity<CategoryReponse[]> categoryResponse = restTemplate.getForEntity(url,CategoryReponse[].class); // gửi request qua bên backend

//        CategoryReponse[] reponses =  categoryResponse.getBody();
//        List<CategoryReponse> list =  Arrays.asList(reponses);
        // lấy đc dữ liệu rồi đưa dữ liệu từ C <-> V thông qua Model
        model.addAttribute("product", new ProductResponse());
        model.addAttribute("producs",null);
        model.addAttribute("cates","gọi qua bạkend lấy all category");
        return "admin/product/index"; //trả về giao diện view của category

    }
}
