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
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Table(name="KhachHang")
@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MaKhachHang")
    private Integer maKhachHang;

    @Column(name="TenKhachHang")
    private String tenKhachHang;

    @Column(name="SoDienThoai")
    private String soDienThoai;

    @Column(name="Email")
    private String email;

    @Column(name="DiaChi")
    private String diaChi;

}
