package com.xworkz.pattern.excuation_on_String;



public class CharArray {

	public static void main(String[] args) {
		
		CharArray array=new CharArray();
		char[] converted=array.CharArray1("vishala");
		for(int i=0;i<converted.length;i++) {
			System.out.println("After conveting String to charArray::"+converted[i]);
			
		}
		//System.out.println("After converting STring to CharArray::"+converted);
		
	
	  }
	public char[] CharArray1(String name) {
		
		System.out.println("before converting String to CharArray::"+name);
		char[] convert=name.toCharArray();
		return convert;
	}
}
