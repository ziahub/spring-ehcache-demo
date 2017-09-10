package com.ziar.spring.ehcache.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Density implements Serializable {

	private static final long serialVersionUID = -4364164342101075826L;

	@Id
	@GeneratedValue
	private Long id;
	private Integer gauge;
	private Long density;

	public Density() {

	}

	public Density(Integer gauge, Long density) {
		this.gauge = gauge;
		this.density = density;
	}

	public Integer getGauge() {
		return gauge;
	}

	public void setGauge(Integer gauge) {
		this.gauge = gauge;
	}

	public Long getDensity() {
		return density;
	}

	public void setDensity(Long density) {
		this.density = density;
	}

	@Override
	public String toString() {
		return "Density [id=" + id + ", gauge=" + gauge + ", density=" + density + "]";
	}
}
