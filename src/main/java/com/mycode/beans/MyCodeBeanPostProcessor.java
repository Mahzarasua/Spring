package com.mycode.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyCodeBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("After initialization " + nombreBean);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("Before initialization " + nombreBean);
		return bean;
	}

}
