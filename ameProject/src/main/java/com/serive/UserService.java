package com.serive;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class UserService {

	public UserService() {
//		throw new RuntimeException("llll");
	}

	public void save() {
		System.out.print("哈哈哈哈哈哈");
	}
}
