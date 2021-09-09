package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.etities.Seller;

public class SaleSucessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long visited;
	private String sellerName;
	private Long deals;
	
	public SaleSucessDTO() {
		
	}

	public SaleSucessDTO(Long visited, Seller seller, Long deals) {
		this.visited = visited;
		this.sellerName = seller.getName();
		this.deals = deals;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	

	
	
}
