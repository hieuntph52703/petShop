package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Table(name="ChiTietDonHang")
@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class ChiTietDonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MaChiTietDonHang")
    private Integer maChiTietDonHang;

    @Column(name="MaDonHang", insertable=false, updatable=false)
    private Integer maDonHang;

    @Column(name="MaThuCung", insertable=false, updatable=false)
    private Integer maThuCung;

    @Column(name="MaSanPham", insertable=false, updatable=false)
    private Integer maSanPham;

    @Column(name="SoLuong")
    private Integer soLuong;

    @Column(name="Gia")
    private double gia;

    @ManyToOne
    @JoinColumn(name="MaDonHang", referencedColumnName = "MaDonHang")
    private DonHang donHang;

    @ManyToOne
    @JoinColumn(name="MaThuCung", referencedColumnName = "MaThuCung")
    private ThuCung thuCung;

    @ManyToOne
    @JoinColumn(name="MaSanPham", referencedColumnName = "MaSanPham")
    private SanPham sanPham;
}
