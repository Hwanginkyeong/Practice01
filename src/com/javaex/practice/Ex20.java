package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원의 개수: ");
		int won500 = sc.nextInt();
		
		System.out.print("100원의 개수: ");
		int won100 = sc.nextInt();
		
		System.out.print("50원의 개수: ");
		int won50 = sc.nextInt();
		System.out.print("10원의 개수: ");
		int won10 = sc.nextInt();
		
		int sum = 500*won500+100*won100+50*won50+10*won10;
		
		
		System.out.println("동전의 총합은 " + sum + "원 입니다.");
		
		
		
		
		sc.close();
		
		
		
		
		
	}

}
