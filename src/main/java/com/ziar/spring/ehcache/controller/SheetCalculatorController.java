package com.ziar.spring.ehcache.controller;

import javax.inject.Inject;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ziar.spring.ehcache.model.Circle;
import com.ziar.spring.ehcache.model.Rectangle;
import com.ziar.spring.ehcache.model.Square;
import com.ziar.spring.ehcache.service.SheetCalculatorService;

@RestController
@RequestMapping(value = "/sheet/calculator")
public class SheetCalculatorController {

	private SheetCalculatorService sheetCalculatorService;

	@Inject
	public SheetCalculatorController(SheetCalculatorService sheetCalculatorService) {
		this.sheetCalculatorService = sheetCalculatorService;
	}

	@RequestMapping(value = "/weight/rectangle/{GUAGE}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Long getWeight(@PathVariable("GUAGE") String gauge,
			@RequestBody Rectangle rectangle) {
		return sheetCalculatorService.getWeight(Integer.valueOf(gauge), rectangle);
	}

	@RequestMapping(value = "/weight/square/{GUAGE}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Long getWeight(@PathVariable("GUAGE") String gauge,
			@RequestBody Square square) {
		return sheetCalculatorService.getWeight(Integer.valueOf(gauge), square);
	}

	@RequestMapping(value = "/weight/circle/{GUAGE}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Long getWeight(@PathVariable("GUAGE") String gauge,
			@RequestBody Circle circle) {
		return sheetCalculatorService.getWeight(Integer.valueOf(gauge), circle);
	}
}
