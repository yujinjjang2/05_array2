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
	
	public void practice4() {
		/*
		int[][] arr = new int[4][4];
		
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			
			if(i <= 2) {
				for(int j = 0; j < arr[i].length; j++) {
					
					if(j <= 2) {

						int random = (int)(Math.random() * 10 + 1);
						
						arr[i][j] = random;
						sum += arr[i][j];
						System.out.print(arr[i][j] + " ");
					}
					else {
						arr[i][j] = sum;
						System.out.print(arr[i][j] + " ");
					}
				}
				
				System.out.println();
			}
		}

		for(int col = 0; col < arr[0].length; col++) { 
			int sum = 0;
			for(int row = 0; row < arr.length; row++) {
				sum += arr[row][col];
			}	
			arr[3][col] = sum;
			System.out.print(arr[3][col] + " ");
		}
		*/
		// TODO Auto-generated method stub
		//4행 4열 2차원 배열을 생성하여
		int[][] arr = new int[4][4];
		
		for(int i = 0;i < arr.length; i++) {
			int rowSum = 0;
			
			if(i <= 2) {
				// 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
				// 맨 마지막 열은 합계....
				for(int j=0; j < arr[i].length;	 j++) {
					int random = (int)(Math.random() * 10) + 1;
					if(j <= 2)
					{
						arr[i][j] = random; 
						rowSum += random;
					}
					else {
						arr[i][j] = rowSum;
					}
					System.out.print(String.format("%3s",arr[i][j]+ " "));
				}
				System.out.println();
			}
			else {
				// 열의 값을 더해서 맨 마지막 행 합계를 순차적으로 넣는다 
				for(int m = 0; m<arr[1].length ; m++) { // 열 반복
					int sum = 0;
					for(int n=0 ; n<arr.length ; n++) { // 행 반복
											//3
						sum += arr[n][m];
					}
					arr[i][m] = sum;
					System.out.print(String.format("%3s",arr[i][m]+ " "));
				}
			}
		}
		
	}
}
