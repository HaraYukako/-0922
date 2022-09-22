/*
 * Ex07_03.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題7-3] 実行時に年を表す数字(西暦)を指定し、うるう年かどうかを
 *            表示するアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex07_03 値1</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex07_03 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 実行時に指定した値を受け取る
		String input = args[0];

		// 実行時に指定された値をString型からint型に変換する
		int year = Integer.parseInt(input);

		System.out.println("判定結果は次の通りです");

		// うるう年かどうかを判定し、結果を表示する。
		//if (year % 4 == 0 && year % 100 != 0) {解答例の用に計算式はカッコでくくった方が分かりやすい
		if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("うるう年です");
		} else {
			System.out.println("うるう年ではありません");
		}

	}
}