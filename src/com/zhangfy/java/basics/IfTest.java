package com.zhangfy.java.basics;

/**
 * 
 * 分支结构中的if-else
 * @author zhangfengyi
 *
 */
public class IfTest {

	public static void main(String[] args) {
		// 例子1
		int heartBeats = 111;
		if (heartBeats < 60 || heartBeats > 100) {
			System.out.println("需要做进一步检查");
		}
		System.out.println("检查结束"); 
		System.out.println("=====================");
		// 例子2
		int age = 23;
		if (age < 18) {
			System.out.println("你可以看动画片");
		} else {
			System.out.println("你可以看成人电影");
		}
		System.out.println("==============");
		// 例子3
		int a = 123;
		if (a < 0) {
			System.out.println("你输入的数据非法");
		} else if (a < 18) {
			System.out.println("请少年时期");
		} else if (a < 35) {
			System.out.println("青壮年时期");
		} else if (a < 60) {
			System.out.println("中年时期");
		} else if (a < 120) {
			System.out.println("老年时期");
		} else {
			System.out.println("你要成仙啊~");
		}
		System.out.println("====================");
		double d1 = 12.3;
		double d2 = 32.1;
		if (d1 > 10 && d2 < 20) {
			System.out.println(d1 + d2);
		} else {
			System.out.println(d1 * d2);
		}
	}
	

}
