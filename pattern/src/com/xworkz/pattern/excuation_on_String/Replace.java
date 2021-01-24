package com.xworkz.pattern.excuation_on_String;


public class Replace {
	public static void main(String[] args) {
		
	Replace replace=new Replace();
	String repaced=replace.Replace("Hi name welcome to String excuation test");
	System.out.println("After replacing::"+repaced);
		
		
	}
	
	public  String Replace(String s) {
		
		System.out.println("Before replacing::"+s);
		String replace=s.replace("name","Vishalaxi");
		return replace;
	
		
	}

}