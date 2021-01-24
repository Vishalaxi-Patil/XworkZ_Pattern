package com.xworkz.pattern.egar;

public class SingletonExample {
	
    private static SingletonExample singletonInstance = 
                                             new SingletonExample();

    private SingletonExample() {
    }

   
    public static SingletonExample getSingletonInstance() {
        return singletonInstance;
    }
}
