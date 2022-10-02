package com.jpa.Spring_JPA_Dat_BTVN.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.Spring_JPA_Dat_BTVN.enity.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien,String>{
	public List<NhanVien> findByLuongLessThanEqual(double luong);
}
