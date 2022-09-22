/*
 * Ex04_01.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題4-1] 3つの整数値を使って、四則演算するアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex04_01</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex04_01 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 変数の宣言
		int x = 12;
		int y = 2;
		int z = 3;

		System.out.println("演算に使用する値を表示します");
		// x、y、zの値を表示する
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("z:" + z);

		// 変数の宣言
		/*int a = x + y + z;
		int b = x - y - z;
		int c = x * y * z;
		int d = x / y / z;*/
		int a, b, c, d;

		System.out.println("四則演算を行います");
		a = x + y + z;
		b = x - y - z;
		c = x * y * z;
		d = x / y / z;

		// 演算結果を表示する
		System.out.println("x + y + z :" + a);
		System.out.println("x - y - z :" + b);
		System.out.println("x * y * z :" + c);
		System.out.println("x / y / z :" + d);
	}
}