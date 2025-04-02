package com.example.demo.controller;

import com.example.demo.entity.SanPham;
import com.example.demo.repository.SanPhamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SanPhamController {
    @Autowired
    SanPhamRepo sanPhamRepo;

    @GetMapping("/san-pham/hien-thi")
    public String hienThi(Model model){
        model.addAttribute("listSanPham",sanPhamRepo.findAll());
        return "view/SanPham";
    }
    @GetMapping("/san-pham/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        sanPhamRepo.deleteById(id);
        return "redirect:/san-pham/hien-thi";
    }
    @PostMapping("/san-pham/add")
    public String add(SanPham sanPham){
        sanPhamRepo.save(sanPham);
        return "redirect:/san-pham/hien-thi";
    }
    @PostMapping("/san-pham/update/{id}")
    public String update( @ModelAttribute("sanPham") SanPham sanPham){
        sanPhamRepo.save(sanPham);
        return "redirect:/san-pham/hien-thi";
    }
}
