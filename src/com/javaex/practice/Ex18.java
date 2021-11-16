package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨: ");
		double fahrenheit = sc.nextDouble();
		System.out.println("화씨 " + fahrenheit + "의 섭씨온도는 " + (fahrenheit-32)*5/9 +" 입니다.");
		
		
		sc.close();
		
		
	}

}
