package com.ziar.spring.ehcache.model;

import java.io.Serializable;

public class Circle extends Shape implements Serializable {

	private static final long serialVersionUID = -1864715115306688589L;
	private Long radius;

	public Long getRadius() {
		return radius;
	}

	public void setRadius(Long radius) {
		this.radius = radius;
	}

	@Override
	public Long getAreaa() {
		return Double.valueOf(Math.PI).longValue() * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
