package com.ziar.spring.ehcache.core;

import javax.inject.Inject;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.ziar.spring.ehcache.model.Density;
import com.ziar.spring.ehcache.repository.DensityRepository;

@Component
public class DensityCache {

	private DensityRepository densityRepository;

	@Inject
	public DensityCache(DensityRepository densityRepository) {
		this.densityRepository = densityRepository;
	}

	@Cacheable(value = "densityCache", key = "#gauge")
	public Density getDensity(Integer gauge) {
		System.out.println("Calculating density for gauge= " + gauge);
		return densityRepository.findByGauge(gauge);
	}
}
