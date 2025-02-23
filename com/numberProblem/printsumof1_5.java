package com.numberProblem;

public class printsumof1_5 {

	public static void main(String[] args) {
		int sum=0;
		int n=10;
//		for(int i=1;i<=n;i++ ) {
//			 sum =sum+i;
//			 if(i<n)
//			 System.out.print(i+"+");
//			 else
//				 System.out.print(i+"=");
//		}
//		System.out.println(sum);
		
		String s="";
		for(int i=1;i<=n;i++) {
			sum+=i;
			s+=i;
			if(i<n) {
				s=s+"+";
			}
		}
		s=s+"="+sum;
		System.out.println(s);
		

	}

}
