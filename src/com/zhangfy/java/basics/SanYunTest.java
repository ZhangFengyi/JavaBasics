package com.zhangfy.java.basics;

/**
 * 
 * 三元运算符
 * @author zhangfengyi
 *
 */
public class SanYunTest {
	
	public static void main(String[] args) {
		short a = 12;
		float b = 5.0f;
		float max = (a > b) ? a : b;
		System.out.println(max);
		System.out.println("====================");
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		System.out.println("====================");
		String str = (a > b) ? "a大" : ((a == b) ? "a和b相等" : "b大");
		System.out.println(str);
		System.out.println("=====================");
		int i1 = 12;
		int i2 = 30;
		int i3 = -43;
		int maxI = (i1 < i2 ? i1 : i2) < i3 ? (i1 < i2 ? i1 : i2) : i3; // 不建议这样写
		System.out.println(maxI);
		System.out.println("================");
		int maxI2;
		if (i1 > i2) {
			if (i1 > i3) {
				maxI2 = i1;
			} else {
				maxI2  = i3;
			}
		} else {
			if (i2 > i3) {
				maxI2 = i2;
			} else {
				maxI2 = i3;
			}
		}
		System.out.println(maxI2);
	}

}
