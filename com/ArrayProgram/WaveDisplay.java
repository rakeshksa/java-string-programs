package com.ArrayProgram;

public class WaveDisplay {

	public static void main(String[] args) {
		int [][]a= {{1,2,3,9},
				    {4,5,6,8},
				    {7,8,9,4}};
		wave(a);
	}

	private static void wave(int[][] a) {
		for(int c=0;c<a[0].length;c++) {
			if(c%2==0) {
				for(int r=0;r<a.length;r++) {
					System.out.print(a[r][c]+"\n");
				}
			}
			else {
				for(int r=a.length-1;r>=0;r--) {
					System.out.print(a[r][c]+"\n");
				}
			}
		}
		
	}

}
