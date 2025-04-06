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


}
