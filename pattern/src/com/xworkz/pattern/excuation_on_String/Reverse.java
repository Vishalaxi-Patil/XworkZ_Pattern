package com.xworkz.pattern.excuation_on_String;

;

public class Reverse
{
	public static void main(String[] args) {
		
		String op=Reverse.rev("Vishala");
		System.out.println("new String::"+op);
	}
		
		public static String rev(String name) {
			System.out.println("original String::"+name);
			String b="";
			char[] array=name.toCharArray();
			for(int i=array.length-1;i>=0;i--) {
				b=b+array[i];
			
		}
			return b;
		}
}
		
		
		
