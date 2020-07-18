package com.zhangfy.java.basics;

/*
 * �߼��������
 */
public class LogicTest {
	
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		if (x++ == 2 && ++y == 2) {
			x = 7;
		}
		System.out.println("x = " + x + ",y = " + y);
	
		System.out.println("----------------------");
		
		int a = 1, b = 1;
		if (a++ == 1 || ++b == 1) {
			a = 7;
		}
		System.out.println("a = " + a + ", b = " + b);
	}
	
}
