package com.xworkz.pattern.excuation_on_String;



public class Palindrome {

	public static void main(String[] args) {
		
	String str=Palindrome.palindrome("GadaG");
	System.out.println("After checking palindrome::"+str);
		
		
	}
	
	public static String palindrome(String name) {
		System.out.println("Checking palindrome String::"+name);
		String temp="";
		char[] ch=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			temp=temp+ch[i];
		}
			if(temp.equals(name)) {
				return "String is palindrome";
				
			}else {
				return "String is not palindrome";
			}
		}
           
	}
	
