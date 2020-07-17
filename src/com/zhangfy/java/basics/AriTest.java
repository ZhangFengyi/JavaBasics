package com.zhangfy.java.basics;

public class AriTest {

	public static void main(String[] args) {
		int i = 1;
		i *= 0.1;
		System.out.println(i);
		i++;
		System.out.println(i);
		System.out.println("=====================");
		int i2 = 2;
		int i3 = 3;
		i3 *= i2++;
		System.out.println(i2);
		System.out.println(i3);
		System.out.println("====================");
		int i4 = 10;
		i4 += (i4++) + (++i4);
		//i4 += (i4++);
		System.out.println(i4);
	}

}
