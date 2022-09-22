/*
 * Ex05_01.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題5-1] 3つの整数値の合計と平均値を表示するアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex05_01</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex05_01 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 3つのint型の変数を宣言し、初期値を設定
		int val1 = 77;
		int val2 = 81;
		int val3 = 92;

		System.out.println("３つの値を表示します");
		System.out.println("val1=" + val1 + " val2=" + val2 + " val3=" + val3);
		// 合計値を計算します
		int sum = (val1 + val2 + val3);
		// 合計値を表示します
		System.out.println("合計値を求めて表示します");
		System.out.println(sum);

		// 平均値を計算します
		//float average = (sum / 3);
		float average = (sum / 3.0f);
		// 平均値を表示します
		System.out.println("平均値を求めて表示します");
		System.out.println(average);
	}
}