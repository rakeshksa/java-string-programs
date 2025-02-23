package com.pattern;

public class Pattern2 {
	public static void main(String[] args) {
		int n=7;
		int star=1;
		int space=n-1;
		for(int i=1;i<=n;i++) {
			//for spaces
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			star+=2;
			space--;
		}
	}

}
