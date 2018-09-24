package com.inca.reflect.step01;

import java.util.Arrays;

public class ReflectTest01 {
	public static void main(String[] args) {

		int[] a1 = new int[] {1,2,3};
		int[] a2 = new int[100];
		int[][] a3 = new int[2][3];
		String[] a4 = new String[] {"ad","bcd","呵呵呵呵"};
		String[][] a5 = new String[4][3];
		System.out.println(a1.getClass());
		System.out.println(a2.getClass().getSuperclass().getName());
		System.out.println(a3.getClass().getSuperclass().getName());
		System.out.println(a4.getClass());
		System.out.println(a5.getClass().getSuperclass().getName());
		Object obj1=a1;
		Object obj2=a4;
//		Object[] obj3=a1;// 这里编译不过去的
		Object[] obj4=a3;
		Object[] obj5=a4;
		System.out.println(a1);
		System.out.println(a4);
		System.out.println(Arrays.asList(a1));//确实变成list了,但第一个元素就是原数组
		// 字符串可以打印,但数字数组打印不出,这个需要回到老版本找原因,1.4的版本
		System.out.println(Arrays.asList(a4));
	}
}
//打印结果:
//class [I
//java.lang.Object
//java.lang.Object
//class [Ljava.lang.String;
//java.lang.Object
//[I@299a06ac
//[Ljava.lang.String;@383534aa
//[[I@299a06ac]
//[ad, bcd, 呵呵呵呵]