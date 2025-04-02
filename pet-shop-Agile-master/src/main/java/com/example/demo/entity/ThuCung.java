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

@Table(name="ThuCung")
@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class ThuCung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MaThuCung")
    private Integer maThuCung;

    @Column(name="TenThuCung")
    private String tenThuCung;

    @Column(name="Loai")
    private String loai;


    @Column(name="Giong")
    private String giong;

    @Column(name="Tuoi")
    private Integer tuoi;

    @Column(name="Gia")
    private double gia;

    @Column(name="TrangThai")
    private String trangThai;
}
