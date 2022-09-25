package com.jpa.Spring_JPA_Dat_BTVN.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.Spring_JPA_Dat_BTVN.enity.ChuyenBay;
import com.jpa.Spring_JPA_Dat_BTVN.service.ChuyenBayService;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayService chuyenBayService;
	
	@GetMapping("/chuyenbay/{gaden}")
	public List<ChuyenBay> findChuyenBayByGaDen(@PathVariable("gaDen")String gaDen){
		List<ChuyenBay> chuyenBays= chuyenBayService.findChuyenBayByGaDen(gaDen);
		System.err.println(gaDen);
		return  chuyenBays ;
	}
	@GetMapping("chuyenbay/doDai")
	public List<ChuyenBay> getChuyenBayByDoDai (@RequestParam int startDoDai,
																@RequestParam int endDoDai) {
		System.out.println(startDoDai);
		System.out.println(endDoDai);
		return chuyenBayService.findChuyenBayByDoDai(startDoDai, endDoDai);
	}
	
}
