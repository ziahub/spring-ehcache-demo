package com.ziar.spring.ehcache.calculator;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.ziar.spring.ehcache.model.Shape;

@Component
public class ShapeCalculator {

	private DensityCalculator densityCalculator;

	@Inject
	public ShapeCalculator(DensityCalculator densityCalculator) {
		this.densityCalculator = densityCalculator;
	}

	public Long getArea(Shape shape) {
		return shape.getAreaa();
	}

	public Long getVolume(Shape shape) {
		return shape.getVolume();
	}

	public Long getWeight(Integer gauge, Shape shape) {
		return shape.getAreaa() * densityCalculator.getDensity(gauge).getDensity();
	}
}
