package com.jpa.Spring_JPA_Dat_BTVN.service.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.jpa.Spring_JPA_Dat_BTVN.enity.ChuyenBay;
import com.jpa.Spring_JPA_Dat_BTVN.repository.ChuyenBayRepository;
import com.jpa.Spring_JPA_Dat_BTVN.service.ChuyenBayService;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;

	@Override
	public List<ChuyenBay> findByGaDen(String gaden) {
		return chuyenBayRepository.findByGaDen(gaden);
	}

	@Override
	public List<ChuyenBay> findChuyenBayByDoDai(int minDoDai, int maxDoDai) {
		return chuyenBayRepository.findChuyenBayByDoDai(minDoDai, maxDoDai);
	}

	@Override
	public List<ChuyenBay> findByGadiAndGaden(String gadi, String gaden) {
		return chuyenBayRepository.findByGaDiAndGaDen(gadi, gaden);
	}
	@Override
	public Integer countByGaDi(String gadi) {
		return chuyenBayRepository.countByGaDi(gadi);
	}

}
