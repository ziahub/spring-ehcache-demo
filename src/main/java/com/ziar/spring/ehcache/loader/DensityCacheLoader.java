package com.ziar.spring.ehcache.loader;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.ziar.spring.ehcache.model.Density;
import com.ziar.spring.ehcache.model.Rectangle;
import com.ziar.spring.ehcache.model.StandardDensity;
import com.ziar.spring.ehcache.repository.DensityRepository;

@Component
public class DensityCacheLoader {

	private DensityRepository densityRepository;

	@Inject
	public DensityCacheLoader(DensityRepository densityRepository) {
		this.densityRepository = densityRepository;
	}

	@PostConstruct
	public void loadAllDensity() {
		List<Density> densityList = getDensityList();
		densityRepository.saveAll(densityList);
	}

	public List<Density> getDensityList() {
		List<Density> densityList = new ArrayList<>();
		densityList.add(new Density(Integer.valueOf(15),
				generateDensity(new StandardDensity(11500L, new Rectangle(48L, 24L)))));
		densityList.add(new Density(Integer.valueOf(16),
				generateDensity(new StandardDensity(10000L, new Rectangle(48L, 24L)))));
		densityList.add(new Density(Integer.valueOf(17),
				generateDensity(new StandardDensity(9000L, new Rectangle(48L, 24L)))));
		densityList.add(new Density(Integer.valueOf(18),
				generateDensity(new StandardDensity(8200L, new Rectangle(48L, 24L)))));
		densityList.add(new Density(Integer.valueOf(19),
				generateDensity(new StandardDensity(6400L, new Rectangle(48L, 24L)))));
		densityList.add(new Density(Integer.valueOf(20),
				generateDensity(new StandardDensity(5700L, new Rectangle(48L, 24L)))));
		densityList.add(new Density(Integer.valueOf(21),
				generateDensity(new StandardDensity(5100L, new Rectangle(48L, 24L)))));
		densityList.add(new Density(Integer.valueOf(22),
				generateDensity(new StandardDensity(4400L, new Rectangle(48L, 24L)))));
		densityList.add(new Density(Integer.valueOf(23),
				generateDensity(new StandardDensity(3800L, new Rectangle(48L, 24L)))));
		densityList.add(new Density(Integer.valueOf(24),
				generateDensity(new StandardDensity(3500L, new Rectangle(48L, 24L)))));
		densityList.add(new Density(Integer.valueOf(25),
				generateDensity(new StandardDensity(3200L, new Rectangle(48L, 24L)))));
		return densityList;
	}

	public Long generateDensity(StandardDensity standardDensity) {
		return standardDensity.getWeight() / standardDensity.getShape().getAreaa();
	}
}
