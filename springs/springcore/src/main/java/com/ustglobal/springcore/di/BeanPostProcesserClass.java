package com.ustglobal.springcore.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcesserClass  implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean before intilization:"+beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean After intilization:"+beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	

}
