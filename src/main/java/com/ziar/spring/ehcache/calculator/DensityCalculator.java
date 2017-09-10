package com.ziar.spring.ehcache.calculator;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.ziar.spring.ehcache.core.DensityCache;
import com.ziar.spring.ehcache.model.Density;

@Component
public class DensityCalculator {

	private DensityCache densityCache;

	@Inject
	public DensityCalculator(DensityCache densityCache) {
		this.densityCache = densityCache;
	}

	public Density getDensity(Integer gauge) {
		return densityCache.getDensity(gauge);
	}
}
