package edu.kh.array2.practice;

import java.util.Arrays;

public class Array2Practice {
	
	public void practice1() {
		
		// (0,0),2,3
		// 1,2,3
		// 1,2,3
		
		// 3행 3열짜리 2차원 배열
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
				//arr[i][j] = String.valueOf(j + 1);
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				count++;
				arr[i][j] = count;
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		
		int count = 17;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				count--;
				arr[i][j] = count;
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	

}
