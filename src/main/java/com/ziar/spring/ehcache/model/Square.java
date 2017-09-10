package com.ziar.spring.ehcache.model;

import java.io.Serializable;

public class Square extends Shape implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8108108834894649720L;
	private Long side;

	public Long getSide() {
		return side;
	}

	public void setSide(Long side) {
		this.side = side;
	}

	@Override
	public Long getAreaa() {
		return side * side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
}
