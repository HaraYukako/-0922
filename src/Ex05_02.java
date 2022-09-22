/*
 * Ex05_02.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題5-2] 2つの倍精度浮動小数点を使用して割り算をするアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex05_02</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex05_02 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		double x = 3.8;
		double y = 1.5;

		System.out.println("演算に使用する値を表示します");
		// double型の値を表示する
		System.out.println("x:" + x);
		System.out.println("y:" + y);

		System.out.println("割り算を行います");
		// 1) double型の変数x,yで割り算を実行し、
		//    double型の変数dに代入します。
		double d = (x / y);
		// 2) double型の変数x,yで割り算を実行し、(割り算はdouble型で実行）
		//    int型の変数i1に代入します。
		int i1 = (int) (x / y); // d = (int)i1;

		// 3) double型の変数x,yをそれぞれint型に変換し、
		//    割り算を実行し、int型の変数i2に代入します。
		int i2 = (int) x / (int) y; // = (int)x,y;

		//  d,i1,i2の値を表示する
		System.out.println("d:" + d);
		System.out.println("i1:" + i1);
		System.out.println("i2:" + i2);
	}
}