package com.ziar.spring.ehcache.service;

import com.ziar.spring.ehcache.model.Shape;

public interface SheetCalculatorService {

	Long getWeight(Integer guage, Shape shape);

}
