package com.dev.dsvendas.dto;

import java.io.Serializable;

import com.dev.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String selletName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		selletName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSelletName() {
		return selletName;
	}

	public void setSelletName(String selletName) {
		this.selletName = selletName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
	
}