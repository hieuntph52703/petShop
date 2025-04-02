package com.example.demo.repository;

import com.example.demo.entity.ChiTietDonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CTDHRepo extends JpaRepository<ChiTietDonHang, Integer> {
}
