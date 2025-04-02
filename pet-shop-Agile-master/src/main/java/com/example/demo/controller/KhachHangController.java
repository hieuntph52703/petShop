package com.example.demo.controller;

import com.example.demo.entity.KhachHang;
import com.example.demo.entity.SanPham;
import com.example.demo.repository.KhachHangRepo;
import com.example.demo.repository.SanPhamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class KhachHangController {
    @Autowired
    KhachHangRepo khachHangRepo;

    @GetMapping("/khach-hang/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listKhachHang", khachHangRepo.findAll());
        model.addAttribute("khachHang", new KhachHang()); // Form mặc định trống (thêm mới)
        return "view/KhachHang";
    }

    @GetMapping("/khach-hang/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        khachHangRepo.deleteById(id);
        return "redirect:/khach-hang/hien-thi";
    }

    @PostMapping("/khach-hang/save")
    public String save(@ModelAttribute("khachHang") KhachHang khachHang) {
        khachHangRepo.save(khachHang);
        return "redirect:/khach-hang/hien-thi";
    }

    @GetMapping("/khach-hang/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        KhachHang khachHang = khachHangRepo.findById(id).orElse(new KhachHang());
        model.addAttribute("listKhachHang", khachHangRepo.findAll());
        model.addAttribute("khachHang", khachHang); // Đổ thông tin vào form
        return "view/KhachHang";
    }

}
