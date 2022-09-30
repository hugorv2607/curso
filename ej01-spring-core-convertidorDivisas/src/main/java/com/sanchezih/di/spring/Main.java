package com.sanchezih.di.spring;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sanchezih.di.spring.config.Configuracion;
import com.sanchezih.di.spring.service.IConverter;
import com.sanchezih.di.spring.service.impl.ARSToUSDConverter;

public class Main {

	public static void main(String[] args) {

		double cantidad = 100;

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Configuracion.class);
		context.refresh();
		
		IConverter converter = (IConverter) context.getBean("ARSToGBPConverter");
		System.out.println(converter.convert(cantidad));

		
		
		/*
		 * 	//IConverter converter = (IConverter) context.getBean("ARSToUSDConverter");
		 * double cantidad = 100; Converter c = new ARSToUSDConverter();
		 * System.out.println(c.convert(cantidad));
		 */

	}
}
