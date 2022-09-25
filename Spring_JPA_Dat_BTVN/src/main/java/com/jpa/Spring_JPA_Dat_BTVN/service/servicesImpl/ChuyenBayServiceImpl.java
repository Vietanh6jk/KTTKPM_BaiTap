package com.jpa.Spring_JPA_Dat_BTVN.service.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Spring_JPA_Dat_BTVN.enity.ChuyenBay;
import com.jpa.Spring_JPA_Dat_BTVN.repository.ChuyenBayRepository;
import com.jpa.Spring_JPA_Dat_BTVN.service.ChuyenBayService;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;

	@Override
	public List<ChuyenBay> findChuyenBayByGaDen(String gaDen) {
		return chuyenBayRepository.findChuyenBayByGaDen(gaDen);
	}

	@Override
	public List<ChuyenBay> findChuyenBayByDoDai(int minDoDai, int maxDoDai) {
		return chuyenBayRepository.findChuyenBayByDoDai(minDoDai, maxDoDai);
	}

	@Override
	public List<ChuyenBay> findChuyenBayByGadiAndGaden(String gaDi, String gaDen) {
		return chuyenBayRepository.findChuyenBayByGaDiAndGaDen(gaDi, gaDen);
	}

	@Override
	public Integer countChuyenbayByGadi(String gaDi) {
		return chuyenBayRepository.countChuyenbayByGaDi(gaDi);
	}

}
