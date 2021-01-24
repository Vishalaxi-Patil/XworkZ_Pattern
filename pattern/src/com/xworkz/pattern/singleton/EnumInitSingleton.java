package com.xworkz.pattern.singleton;

public enum EnumInitSingleton {

	INSTANCE;
	
	private EnumInitSingleton() {
		System.out.println("invoking "+this.getClass().getSimpleName());
	}
}
