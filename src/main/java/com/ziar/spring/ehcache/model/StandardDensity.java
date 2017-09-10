package com.ziar.spring.ehcache.model;

import java.io.Serializable;

public class StandardDensity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6003538934969037043L;
	private Long weight;
	private Shape shape;

	public StandardDensity(Long weight, Shape shape) {
		this.weight = weight;
		this.shape = shape;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Long getDensity() {
		return weight / shape.getAreaa();
	}

	@Override
	public String toString() {
		return "StandardDensity [weight=" + weight + ", shape=" + shape + "]";
	}

}
