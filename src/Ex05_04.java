/*
 * Ex05_04.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題5-4] ２つの文字列を整数型に型変換して、
 *  ２つの値の加減乗除を計算するアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex05_03</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex05_04 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		String s1 = "10";
		String s2 = "2";

		System.out.println("２つの文字列を表示します");
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);

		// 文字列s1をint型に型変換し、int型の変数val1に代入します
		int val1 = Integer.parseInt(s1); //int val1 = (int) s1;
		// 文字列s1をint型に型変換し、int型の変数val2に代入します
		int val2 = Integer.parseInt(s2); //int val2 = (int) s2;

		// val1とval2の値を表示します
		System.out.println("２つの整数値を表示します");
		System.out.println(val1);
		System.out.println(val2);

		// val1とval2の加減乗除を表示します
		System.out.println("val1+val2:" + (val1 + val2));
		System.out.println("val1-val2:" + (val1 - val2));
		System.out.println("val1*val2:" + (val1 * val2));
		System.out.println("val1/val2:" + (val1 / val2));
	}
}