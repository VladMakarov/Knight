package com.academysmart.vlad.Knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class KnightMain {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("Knight.xml");
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();
	}
}
