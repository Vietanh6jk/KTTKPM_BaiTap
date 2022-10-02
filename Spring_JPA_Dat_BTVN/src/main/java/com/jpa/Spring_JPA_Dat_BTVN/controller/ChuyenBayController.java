package com.jpa.Spring_JPA_Dat_BTVN.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.Spring_JPA_Dat_BTVN.enity.ChuyenBay;
import com.jpa.Spring_JPA_Dat_BTVN.repository.ChuyenBayRepository;
import com.jpa.Spring_JPA_Dat_BTVN.service.ChuyenBayService;

@RestController
@RequestMapping("/")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayService chuyenBayService;
	
	public ChuyenBayController(ChuyenBayService chuyenBayService) {
		this.chuyenBayService= chuyenBayService;
	}
	
	@GetMapping("/chuyenbay/{gaden}")
	public List<ChuyenBay> findByGaDen(@PathVariable("gaden")String gaden){
		List<ChuyenBay> chuyenBays= chuyenBayService.findByGaDen(gaden);
		System.err.println(gaden);
		for (ChuyenBay chuyenBay : chuyenBays) {
			System.out.println(chuyenBay);
		}
		return  chuyenBays ;
	}
//	@GetMapping("chuyenbay/doDai")
//	public List<ChuyenBay> getChuyenBayByDoDai (@RequestParam int startDoDai,@RequestParam int endDoDai) {
//		List<ChuyenBay> chuyenBays= chuyenBayService.findChuyenBayByDoDai(startDoDai, endDoDai);
//		System.out.println(startDoDai);
//		System.out.println(endDoDai);
//		return chuyenBays ;
//	}
	
}
