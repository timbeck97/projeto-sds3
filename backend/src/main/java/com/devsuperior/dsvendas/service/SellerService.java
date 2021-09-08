package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	@Autowired
	private SellerRepository sellerRepositorie;
	
	public List<SellerDTO> findAll(){
		return sellerRepositorie.findAll().stream().map(sel ->new SellerDTO(sel)).collect(Collectors.toList());
		
	}
	
}