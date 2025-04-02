package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name="NhanVien")
@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MaNhanVien")
    private Integer maNhanVien;

    @Column(name="TenNhanVien")
    private String tenNhanVien;

    @Column(name="SoDienThoai")
    private String soDienThoai;


    @Column(name="Email")
    private String email;

    @Column(name="ChucVu")
    private String chucVu;

    @Column(name="Luong")
    private double luong;

}
