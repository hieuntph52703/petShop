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


@Table(name="SanPham")
@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MaSanPham")
    private Integer maSanPham;

    @Column(name="TenSanPham")
    private String tenSanPham;

    @Column(name="DanhMuc")
    private String danhMuc;


    @Column(name="Gia")
    private double gia;

    @Column(name="SoLuongTon")
    private Integer soLuongTon;

    @Column(name="MoTa")
    private String moTa;

}
