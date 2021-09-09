package com.devsuperior.dsvendas.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSucessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	@Autowired
	private SaleRepository saleRepositorie;
	
	@Autowired
	private SellerRepository sellerRepositorie;
	
	@Transactional(readOnly=true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepositorie.findAll();
		return saleRepositorie.findAll(pageable).map(sale ->new SaleDTO(sale));
		
	}
	@Transactional(readOnly=true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return saleRepositorie.amountGroupedBySeller();
	}
	@Transactional(readOnly=true)
	public List<SaleSucessDTO> sucessGroupBySeller(){
		return saleRepositorie.sucessGroupBySeller();
	}
	
}
