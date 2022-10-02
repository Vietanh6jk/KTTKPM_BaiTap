package com.jpa.Spring_JPA_Dat_BTVN.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.Spring_JPA_Dat_BTVN.enity.MayBay;
import com.jpa.Spring_JPA_Dat_BTVN.service.MayBayService;

@RestController
@RequestMapping("/maybay")
public class MayBayController {
	@Autowired
	private MayBayService mayBayService;
	
	@GetMapping("/maybay/{tambay}")
	public List<MayBay> findMayBayByTamBay(int tamBay){
		List<MayBay> mayBays= mayBayService.findByTambayMoreThanNKm(tamBay);
		System.out.println(mayBays);
		return mayBays;
		
	}
}