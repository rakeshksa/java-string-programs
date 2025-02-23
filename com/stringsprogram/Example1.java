package com.stringsprogram;

public class Example1 {

	public static void main(String[] args) {
		String first="java";
		String second="python"; 
		String third="js";
		
		System.out.println(first);
		System.out.println(third);
		
		String str=new String("algocamp");
		System.out.println(str);
		
		//string operation
		String greet="hello world";
		System.out.println("string :"+greet);
		
		System.out.println(greet.length());
		
		//join two string 
		String joinstrings=first.concat(second);
		System.out.println(joinstrings);
		//with (+) operator we can concat two strings
		System.out.println(first+second);
		System.out.println(str.length());
		
		//compare two String
		boolean res=first.equals(third);
		System.out.println(res);
		String first2="java";
		System.out.println(first.equals(first2));//true
		
		
		String name1=new String("program1");
		String name2=new String("program1");
		
		boolean re1=(name1==name2);
		System.out.println(re1);//false
		boolean re2=name1.equals(name2);
		System.out.println(re2);//true
		
		System.out.println(first==first2);//true because same name inside string constant pool
		String ex="this is \"very\" good program";
		System.out.println(ex);
		String newstr="hello";
		System.out.println(newstr.substring(1));
		
		
		
		
		

	}

}
