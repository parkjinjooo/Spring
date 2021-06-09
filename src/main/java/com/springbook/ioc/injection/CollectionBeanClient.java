package com.springbook.ioc.injection;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		Properties addressList = bean.getAddressList();
		
		// Map<String, String> 이렇게 String으로 지정해주어 toStirng할 필요가 없으나 Properties는  반환값이 정해져 있지 않으므로 toString 지정
		
		String address = addressList.get("고길동").toString();
		String address2 = addressList.get("마이콜").toString();
		
		System.out.println("고길동 주소: " + address);
		System.out.println("마이콜 주소: " + address2);
  		
//		for(String address : addressList) {
//			System.out.println(address.toString());
//		}
		factory.close();
	}
}
