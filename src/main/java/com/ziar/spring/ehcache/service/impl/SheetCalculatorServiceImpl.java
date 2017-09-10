package com.ziar.spring.ehcache.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.ziar.spring.ehcache.calculator.ShapeCalculator;
import com.ziar.spring.ehcache.model.Shape;
import com.ziar.spring.ehcache.service.SheetCalculatorService;

@Component
public class SheetCalculatorServiceImpl implements SheetCalculatorService {

	private ShapeCalculator shapeCalculator;

	@Inject
	public SheetCalculatorServiceImpl(ShapeCalculator shapeCalculator) {
		this.shapeCalculator = shapeCalculator;
	}

	@Override
	public Long getWeight(Integer guage, Shape shape) {
		return shapeCalculator.getWeight(guage, shape);
	}

}
