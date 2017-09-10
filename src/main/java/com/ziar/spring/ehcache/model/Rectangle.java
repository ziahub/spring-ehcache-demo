package com.ziar.spring.ehcache.model;

import java.io.Serializable;

public class Rectangle extends Shape implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7478601196367563157L;
	private Long length;
	private Long breadth;

	public Rectangle() {
	}

	public Rectangle(Long length, Long breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public Long getBreadth() {
		return breadth;
	}

	public void setBreadth(Long breadth) {
		this.breadth = breadth;
	}

	@Override
	public Long getAreaa() {
		return length * breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
}
