package com.example.demo.controller;

import com.example.demo.entity.DonHang;
import com.example.demo.repository.CTDHRepo;
import com.example.demo.repository.DonHangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller


public class DonHangController {
    @Autowired
    private DonHangRepo donHangRepo;

    @Autowired
    private CTDHRepo ctdhRepo;

    // Hiển thị danh sách đơn hàng
    @GetMapping("/don-hang/hien-thi")
    public String hienThiDanhSach(Model model) {
        List<DonHang> listDH = donHangRepo.findAll();
        model.addAttribute("listDH", listDH);
        return "view/DonHang"; // Tên template cho danh sách đơn hàng
    }

    // Xem chi tiết đơn hàng
    @GetMapping("/{maDonHang}")
    public String xemChiTietDonHang(@PathVariable Integer maDonHang, Model model) {
        DonHang donHang = donHangRepo.findById(maDonHang)
                .orElseThrow(() -> new IllegalArgumentException("Không tìm thấy đơn hàng với mã: " + maDonHang));

        model.addAttribute("donHang", donHang);
        return "view/ChiTietDonHang"; // Tên template cho chi tiết đơn hàng
    }
}

