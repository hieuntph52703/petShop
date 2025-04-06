package com.example.demo.controller;

import com.example.demo.entity.KhachHang;
import com.example.demo.entity.NhanVien;
import com.example.demo.entity.SanPham;
import com.example.demo.entity.ThuCung;
import com.example.demo.repository.KhachHangRepo;
import com.example.demo.repository.NhanVienRepo;
import com.example.demo.repository.SanPhamRepo;
import com.example.demo.repository.ThuCungRepo;
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
    //khach hang
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

    //Nhân Viên
    @Autowired
    NhanVienRepo nhanVienRepo;

    @GetMapping("/nhan-vien/hien-thi")
    public String hienThiNV(Model model) {
        model.addAttribute("listNhanVien", nhanVienRepo.findAll());
        model.addAttribute("nhanVien", new NhanVien()); // Form mặc định trống (thêm mới)
        return "view/NhanVien";
    }

    @GetMapping("/nhan-vien/delete/{id}")
    public String deleteNV(@PathVariable("id") Integer id) {
        nhanVienRepo.deleteById(id);
        return "redirect:/nhan-vien/hien-thi";
    }

    @PostMapping("/nhan-vien/save")
    public String saveNV(@ModelAttribute("nhanVien") NhanVien nhanVien) {
        nhanVienRepo.save(nhanVien);
        return "redirect:/nhan-vien/hien-thi";
    }

    @GetMapping("/nhan-vien/edit/{id}")
    public String editNV(@PathVariable("id") Integer id, Model model) {
        NhanVien nhanVien = nhanVienRepo.findById(id).orElse(new NhanVien());
        model.addAttribute("listNhanVien", nhanVienRepo.findAll());
        model.addAttribute("nhanVien", nhanVien); // Đổ thông tin vào form
        return "view/NhanVien";
    }

    //Thú Cưng
    @Autowired
    ThuCungRepo thuCungRepo;

    @GetMapping("/thu-cung/hien-thi")
    public String hienThiThuCung(Model model) {
        model.addAttribute("listThuCung", thuCungRepo.findAll());
        model.addAttribute("thuCung", new ThuCung());
        return "view/ThuCung";
    }

    @GetMapping("/thu-cung/delete/{id}")
    public String deleteThuCung(@PathVariable("id") Integer id) {
        thuCungRepo.deleteById(id);
        return "redirect:/thu-cung/hien-thi";
    }

    @PostMapping("/thu-cung/save")
    public String saveThuCung(@ModelAttribute("thuCung") ThuCung thuCung) {
        thuCungRepo.save(thuCung);
        return "redirect:/thu-cung/hien-thi";
    }

    @GetMapping("/thu-cung/edit/{id}")
    public String editThuCung(@PathVariable("id") Integer id, Model model) {
        ThuCung thuCung = thuCungRepo.findById(id).orElse(new ThuCung());
        model.addAttribute("listThuCung", thuCungRepo.findAll());
        model.addAttribute("thuCung", thuCung);
        return "view/ThuCung";
    }
}
