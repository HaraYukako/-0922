/*
 * Ex03_07.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題3-10] 定数を宣言して、値の変更を試みるアプリケーション
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex03_07 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 定数の宣言
		final int val1 = 5;

		System.out.println("定数の値が変更できるか確認します");
		// 定数の現在の値を表示する
		System.out.println(val1);

	}
}