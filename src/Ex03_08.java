/*
 * Ex03_08.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題3-8] 定数を宣言して演算処理で使用するアプリケーション
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex03_08 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 定数の宣言
		final float PI = 3.14F;

		// 円の面積は、（半径 * 半径 * PI）「*」は掛け算を表します
		System.out.println("円の面積を表示します");
		System.out.println("半径5cmの円");
		System.out.println(5 * 5 * PI);
		System.out.println("半径10cmの円");
		System.out.println(10 * 10 * PI);
		System.out.println("以 上");
	}
}