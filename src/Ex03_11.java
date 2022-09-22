/*
 * Ex03_11.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題3-11] 2つの変数の値を入れ替える処理を行うアプリケーション
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex03_11 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 変数の宣言、値の設定
		int x = 5;
		int y = 3;
		//int z = 5;

		// 変数の値の入れ替え
		//x = z;

		int work = x; //作業用の変数にどちらかの値を退避
		x = y;
		y = work;

		// 変数の値の表示
		System.out.println("変数の値を表示します");
		System.out.println(x);
		System.out.println(y);
		System.out.println("以 上");
	}
}