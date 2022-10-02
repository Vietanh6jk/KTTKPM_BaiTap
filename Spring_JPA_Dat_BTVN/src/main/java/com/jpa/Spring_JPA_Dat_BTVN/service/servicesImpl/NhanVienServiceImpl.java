package com.jpa.Spring_JPA_Dat_BTVN.service.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Spring_JPA_Dat_BTVN.enity.NhanVien;
import com.jpa.Spring_JPA_Dat_BTVN.repository.NhanVienRepository;
import com.jpa.Spring_JPA_Dat_BTVN.service.NhanVienService;

@Service
public class NhanVienServiceImpl implements NhanVienService{
	
	@Autowired
	private NhanVienRepository nhanVienRepository;

	@Override
	public List<NhanVien> findByLuongLessThanEqual(double luong) {	
		return nhanVienRepository.findByLuongLessThanEqual(luong);
	}
	
}
