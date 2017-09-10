package com.ziar.spring.ehcache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ziar.spring.ehcache.model.Density;

public interface DensityRepository extends JpaRepository<Density, Long> {

	Density findByGauge(Integer gauge);

}
