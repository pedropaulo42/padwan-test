package com.padwan.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PedroPauloService {

	public List<String> skills() {
		List<String> skills = new ArrayList<>();
		skills.add("Conversar com esquilos");
		skills.add("Me transformar em qualquer sabor de sorvete");
		skills.add("Excelente gosto musical");
		skills.add("Dormir em qualquer lugar");
		return skills;
	}
}
