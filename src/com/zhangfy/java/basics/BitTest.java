package com.zhangfy.java.basics;

/*
 * 位运算符
 */
public class BitTest {

	public static void main(String[] args) {
		int i = -21;
		System.out.println("i << 2 : " + (i << 2));
		System.out.println("i << 3 : " + (i << 3));
		System.out.println("i << 27 : " + (i << 27));
		System.out.println("============================");
		int a = 12, b = 5;
		System.out.println("a & b : " + (a & b));
		System.out.println("a | b : " + (a | b));
		System.out.println("a ^ b : " + (a ^ b));
		System.out.println("~a : " + (~a));
		System.out.println("==========================");
		int c = 10, d = 20;
		System.out.println("c = " + c + ", d = " + d);
		//方式一 推荐
		int e;
		e = c;
		c = d;
		d = e;
		/*
 		方式二		 
		c = c + d;
		d = c - d;
		c = c - d;
		*/
		/*
		方式三
		c = c ^ d;
		d = c ^ d;
		c = c ^ d;
		*/
		System.out.println("c = " + c + ", d = " + d);
		
		
		
	}

}
