package com;

import com.config.AppConfig;
import com.serive.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	public static void main(String[] args) throws Exception {
		BeanFactory beanFactory = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService bean = beanFactory.getBean(UserService.class);
		bean.save();
	}
}
