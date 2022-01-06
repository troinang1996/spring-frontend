package com.laptrinh.spring.controller;

import com.laptrinh.spring.dto.BaseDTO;
import com.laptrinh.spring.dto.request.CategoryRequest;
import com.laptrinh.spring.dto.request.CustomerRequest;
import com.laptrinh.spring.dto.respone.CategoryReponse;
import com.laptrinh.spring.dto.respone.CustomerReponse;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/category/")
public class CategoryController {
    @RequestMapping("index")
    public String index(Model model){
        // gửi requesr lấy all thông tin loại sản phẩm
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8085/category/index"; // gửi url qua server backend
        HttpEntity<CategoryReponse[]> categoryResponse = restTemplate.getForEntity(url,CategoryReponse[].class); // gửi request qua bên backend

        CategoryReponse[] reponses =  categoryResponse.getBody();
        List<CategoryReponse> list =  Arrays.asList(reponses);
        // lấy đc dữ liệu rồi đưa dữ liệu từ C <-> V thông qua Model
        model.addAttribute("category",new CategoryReponse());
        model.addAttribute("cates",list);
        return "admin/category/index"; //trả về giao diện view của category

    }
    @RequestMapping("create")
    public String create(CategoryReponse category,Model model){
        RestTemplate restTemplate = new RestTemplate();
        CategoryRequest rq =new CategoryRequest(category.getName(), category.getNameVN());
        HttpEntity<CategoryRequest> request = new HttpEntity<>(rq);
        String url = "http://localhost:8085/category/addition"; // gửi url qua server backend
        HttpEntity<BaseDTO> categoryResponse = restTemplate.postForEntity(url,request,BaseDTO.class); // gửi request qua bên backend


        BaseDTO dto = categoryResponse.getBody();
        if(dto != null && dto.getMessage().equals("success")){
            model.addAttribute("msg","Thêm loại sản phẩm thành công");
        }else{
            model.addAttribute("msg","Thêm thất bại");
        }
        return "redirect:/category/index";

    }

    @RequestMapping("delete/{getid}") // lấy id từ giao diện web
    public String delete(@PathVariable("getid") Integer id, Model model){
        if(id != null){
            // gọi qua server backend
            RestTemplate restTemplate = new RestTemplate();
            String url = "http://localhost:8085/category/delete?id=" + id; // gửi url qua server backend
            HttpEntity<BaseDTO> categoryResponse = restTemplate.getForEntity(url,BaseDTO.class); // gửi request qua bên backend
            BaseDTO reponses = categoryResponse.getBody();
            if(reponses !=null && reponses.getMessage().equals("success")){
                model.addAttribute("msg","Xóa thành công");
            }else {
                model.addAttribute("msg","Xóa thất bại");
            }
        }else {
            model.addAttribute("msg","Xóa bị lỗi ! Không lấy được id category");
        }

        return "redirect:/category/index";

    }

    @RequestMapping("edit/{id}") // lấy id từ giao diện web
    public String edit(@PathVariable("id") Integer id,Model model){
        if(id != null){
            // gọi qua server backend
            RestTemplate restTemplate = new RestTemplate();
            String url = "http://localhost:8085/category/edit?id=" + id; // gửi url qua server backend
            HttpEntity<CategoryReponse> categoryResponse = restTemplate.getForEntity(url,CategoryReponse.class); // gửi request qua bên backend
            CategoryReponse reponses = categoryResponse.getBody();
            model.addAttribute("category",reponses);

            //lấy danh sách tất cả category
            String urlAllCategory = "http://localhost:8085/category/index"; // gửi url qua server backend
            HttpEntity<CategoryReponse[]> categorys = restTemplate.getForEntity(urlAllCategory,CategoryReponse[].class); // gửi request qua bên backend

            CategoryReponse[] rep =  categorys.getBody();
            List<CategoryReponse> list =  Arrays.asList(rep);
            model.addAttribute("cates",list);

        }else {
            model.addAttribute("msg","Xóa bị lỗi ! Không lấy được id category");
        }

        return "admin/category/index";

    }

    @RequestMapping("update")
    public String editCategory(CategoryReponse category,Model model){
        RestTemplate restTemplate = new RestTemplate();
        CategoryRequest rq =new CategoryRequest( category.getId(), category.getName(),category.getNameVN());
        HttpEntity<CategoryRequest> request = new HttpEntity<>(rq);
        String url = "http://localhost:8085/category/update"; // gửi url qua server backend
        HttpEntity<BaseDTO> categoryResponse = restTemplate.postForEntity(url,request,BaseDTO.class); // gửi request qua bên backend


        BaseDTO dto = categoryResponse.getBody();
        if(dto != null && dto.getMessage().equals("success")){
            model.addAttribute("msg","update thanh cong");
        }else{
            model.addAttribute("msg","update that bai");
        }
        return "redirect:/category/index";

    }
}
