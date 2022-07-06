package com.sample.sampledata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service implements ServiceInterface{
	@Autowired
	Repo r;
	@Override
	public List<Players> allData() {
		// TODO Auto-generated method stub
		return r.findAll();
	}
}
