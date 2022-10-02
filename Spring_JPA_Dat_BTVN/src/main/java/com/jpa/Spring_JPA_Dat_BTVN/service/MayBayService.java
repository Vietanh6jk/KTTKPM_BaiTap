package com.jpa.Spring_JPA_Dat_BTVN.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.Spring_JPA_Dat_BTVN.enity.MayBay;

@Service
public interface MayBayService {
	public List<MayBay> findByTambayMoreThanNKm(Integer tambay);
	public Integer countMaybayByLoai(String loai);
}
