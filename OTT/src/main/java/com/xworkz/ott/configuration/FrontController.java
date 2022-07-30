package com.xworkz.ott.configuration;

import org.apache.catalina.tribes.util.Arrays;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer {

	private Class[] configurationClasses = { SpringConfiguration.class };
	private String[] mappings = { "*.do" };

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("configurationClasses" + Arrays.toString(configurationClasses));
		return configurationClasses;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("mappings" + Arrays.toString(mappings));
		return mappings;
	}

}
