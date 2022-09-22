/*
 * Ex03_12.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題3-12] 配列の要素数と、配列の要素の値を設定して
 *             表示するアプリケーション
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex03_13 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 配列の宣言
		String[] week = { "月", "火", "水", "木", "金", "土", "日" };
		//配列の宣言と領域の確保のみ
		int[] num = new int[3];

		System.out.println("配列の要素数を表示します");
		// 配列の要素数を表示する
		System.out.println("配列1の要素数" + week.length);
		System.out.println("配列2の要素数" + num.length);

		// ２つめの配列の値を設定する
		num[2] = 50;

		System.out.println("配列の要素の値を表示します");
		// 配列の要素の値を表示する
		System.out.println("配列1の要素の値");
		System.out.println(week[0]);
		System.out.println(week[1]);
		System.out.println(week[2]);
		System.out.println(week[3]);
		System.out.println(week[4]);
		System.out.println(week[5]);
		System.out.println(week[6]);
		System.out.println("配列2の要素の値");
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);

	}
}