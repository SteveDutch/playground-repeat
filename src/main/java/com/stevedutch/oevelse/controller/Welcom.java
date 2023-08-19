package com.stevedutch.oevelse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stevedutch.oevelse.service.Proeve;

@RestController
public class Welcom {
	
	@Autowired
	private Proeve proeve;
	
	@GetMapping("/")
	public void justStart() {
		proeve.start();
	}

}
