package com.pattern;

public class Lcm {

	public static void main(String[] args) {
		int a=356;
		int b=498;
		int n=a>b?a:b;
		int temp=n;
		while(true) {
			if(n%a==0&&n%b==0)break;
			n+=temp;
		}
		System.out.println(n);

	}

}
