/*
 * Ex03_04.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題3-4] 変数の宣言、値の設定、表示をするアプリケーション
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex03_04 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 変数の宣言、値の設定
		int num = 10;

		System.out.println("変数の値を表示します(1回目)");
		//numを表示する処理
		System.out.println(num);

		System.out.println("変数の値を表示します(2回目)");
		//numに20を代入する処理
		num = 20;
		//numを表示する処理
		System.out.println(num);

		System.out.println("変数の値を表示します(3回目)");
		//numに30を代入する処理
		num = 30;
		//numを表示する処理
		System.out.println(num);
	}
}