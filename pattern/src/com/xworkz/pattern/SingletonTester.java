package com.xworkz.pattern;


import com.xworkz.pattern.singleton.EagerInitSingleton;
import com.xworkz.pattern.singleton.EnumInitSingleton;
import com.xworkz.pattern.singleton.LazyInitSingleton;
import com.xworkz.pattern.singleton.StaticBlockSingleton;

public class SingletonTester {

	public static void main(String[] args) {

		System.out.println(EnumInitSingleton.INSTANCE);
		System.out.println("************************");
		System.out.println(EagerInitSingleton.getinstance());
		System.out.println("*******************************");
		System.out.println(StaticBlockSingleton.getinstance());
		System.out.println("******************************");
		System.out.println(LazyInitSingleton.class);
		System.out.println("******************************");
		System.out.println(LazyInitSingleton.getlazyInitInstance());
		System.out.println("***************************************");
		System.out.println("instance 2"+LazyInitSingleton.getlazyInitInstance());
	}
}