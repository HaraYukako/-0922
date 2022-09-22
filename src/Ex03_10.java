/*
 * Ex03_10.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題3-10] 変数の宣言、値の設定、表示をするアプリケーション
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex03_10 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 変数の宣言、値の設定
		double min = 3.14;
		int num = 123456;
		boolean checked = true;
		char x = 'm';
		long max = 12345678901L;

		// 変数の値の表示
		System.out.println("変数の値を表示します");
		System.out.println(min);
		System.out.println(num);
		System.out.println(checked);
		System.out.println(x);
		System.out.println(max);

	}
}