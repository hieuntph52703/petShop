package com.example.demo.controller;

import com.example.demo.entity.DonHang;
import com.example.demo.repository.CTDHRepo;
import com.example.demo.repository.DonHangRepo;
import com.example.demo.repository.KhachHangRepo;
import com.example.demo.repository.NhanVienRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class CuaHangController {
    @Autowired
    private DonHangRepo donHangRepo;

    @Autowired
    private CTDHRepo ctdhRepo;

    @Autowired
    private KhachHangRepo khachHangRepo;

    @Autowired
    private NhanVienRepo nhanVienRepo;


    @GetMapping("don_hang/hien-thi")
    public String hienThiPB(Model model){
        model.addAttribute("listDH", donHangRepo.findAll());
        model.addAttribute("listKH", khachHangRepo.findAll());
        model.addAttribute("listNV", nhanVienRepo.findAll());
        model.addAttribute("dh", new DonHang());
        return "view/DonHang";
    }

//    @GetMapping("don_hang/chi_tiet/{ma}")
//    public String detail(@PathVariable("ma") String ma, Model model){
//        DonHang dh = DonHangRepo.findByMa(ma).orElse(null);
//        model.addAttribute("dh", dh);
//        model.addAttribute("listDH", donHangRepo.findAll());
//        model.addAttribute("listKH", khachHangRepo.findAll());
//        model.addAttribute("listNV", nhanVienRepo.findAll());
//        return "view/Home";
//    }
//
//    @GetMapping("phong-ban/remove/{id}")
//    public String remode(@PathVariable("id") Long id){
//        phongBanRepo.deleteById(id);
//        return "redirect:/phong-ban/hien-thi";
//    }
//
//    @PostMapping("/phong-ban/add")
//    public String add(@Valid @ModelAttribute("pb") phongBan pb,
//                      Model model){
//        phongBanRepo.save(pb);
//        return "redirect:/phong-ban/hien-thi";
//    }
//
//    @GetMapping("phong-ban/view-update/{id}")
//    private String viewUpdate(@PathVariable("id") Long id,
//                              Model model){
//        phongBan pb = phongBanRepo.findById(id).orElse(null);
//        model.addAttribute("pb", pb);
//        model.addAttribute("listPB", phongBanRepo.findAll());
//        model.addAttribute("listLPB", loaiPhongBanRepo.findAll());
//
//        return "view/Update";
//    }
//
//    @PostMapping("phong-ban/update/{id}")
//    private String update(@PathVariable("id") Long id,
//                          phongBan pb){
//        phongBanRepo.save(pb);
//        return "redirect:/phong-ban/hien-thi";
//    }
}
