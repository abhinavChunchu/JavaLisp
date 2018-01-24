package com.training.spring.scope;
import org.springframework.context.ApplicationContext;

public class Appl {
	public static void main(String[] args){
		ApplicationContext appCtx= new ClassPathXMLApplicationContext("scope.xml");
		Profile profile1 = (Profile) appCtx.getBean("singletonProfile";)
		
		
	}

}
