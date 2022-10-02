package com.jpa.Spring_JPA_Dat_BTVN.service.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Spring_JPA_Dat_BTVN.enity.MayBay;
import com.jpa.Spring_JPA_Dat_BTVN.repository.MayBayRepository;
import com.jpa.Spring_JPA_Dat_BTVN.service.MayBayService;

@Service
public class MayBayServiceImpl implements MayBayService{
	@Autowired
	private MayBayRepository mayBayRepository;


	@Override
	public List<MayBay> findByTambayMoreThanNKm(Integer tambay) {
		return mayBayRepository.findByTambayMoreThanNKm(tambay);
	}

	@Override
	public Integer countMaybayByLoai(String loai) {
		return mayBayRepository.countMaybayByLoai(loai);
	}
	
}
