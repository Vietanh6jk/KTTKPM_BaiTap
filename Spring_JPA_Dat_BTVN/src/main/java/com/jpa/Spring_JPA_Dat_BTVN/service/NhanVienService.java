package com.jpa.Spring_JPA_Dat_BTVN.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.Spring_JPA_Dat_BTVN.enity.NhanVien;

@Service
public interface NhanVienService {
	public List<NhanVien> findByLuongLessThanEqual(double luong);
}
