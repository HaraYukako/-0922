/*
 * Ex03_09.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題3-9] 変数の宣言、値の設定、表示をするアプリケーション
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex03_09 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 変数の宣言、値の設定
		String str1 = "こんにちは";
		float f1 = 3.14F;
		long num = 12345678901L;
		boolean isChecked = true;
		char c = 'm';

		// 変数の値の表示
		System.out.println("変数の値を表示します");
		System.out.println(str1);
		System.out.println(f1);
		System.out.println(num);
		System.out.println(isChecked);
		System.out.println(c);
		System.out.println("以 上");
	}
}