package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Utils.FakeUtils;
import com.example.models.news;

@RestController
@RequestMapping(value = "/news")
public class NewsController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<news> news(){
		return FakeUtils.getAllNews();
	}

}
