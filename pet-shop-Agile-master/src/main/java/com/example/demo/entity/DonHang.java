package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;
import java.util.List;

@Table(name="DonHang")
@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MaDonHang")
    private Integer maDonHang;

    @ManyToOne
    @JoinColumn(name="MaKhachHang", referencedColumnName = "MaKhachHang")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name="MaNhanVien", referencedColumnName = "MaNhanVien")
    private NhanVien nhanVien;

    @Column(name="NgayDat")
    @Temporal(TemporalType.DATE)
    private Date ngayDat;

    @Column(name="TongTien")
    private double tongTien;

    // Liên kết với ChiTietDonHang (một đơn hàng có nhiều chi tiết)
    @OneToMany(mappedBy = "donHang", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ChiTietDonHang> chiTietDonHangList;
}
