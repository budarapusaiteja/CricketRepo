package com.sample.sampledata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PlayersDataController {
	@Autowired
	Service i;
	@Autowired
	Repo r;
	@GetMapping("/Data")
	public List<Players> retrieve() {
		return i.allData();
	}
	
	@GetMapping("/dd")
	public List<Players> ret() {
		return r.findAll();
	}
}
