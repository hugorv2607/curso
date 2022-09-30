package com.sanchezih.di.spring.service.impl;

import org.springframework.stereotype.Component;

import com.sanchezih.di.spring.service.IConverter;
@Component
public class ARSToGBPConverter implements IConverter {
	
	private final double RATE = 160.90;

	@Override
	public Double convert(Double cantidad) {
		return cantidad * RATE;
	}

}
