/*
 * Ex07_01.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題7-1] 実行時に指定した値が5の倍数かどうかを判定するアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex07_01 値1</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex07_01 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 実行時に指定した値を受け取る
		String input = args[0];
		// 実行時に指定された値をString型からint型に変換する
		int num = Integer.parseInt(input);
		// 判定する値を表示する
		System.out.println("判定する値：" + num);

		System.out.println("判定結果は次の通りです");
		// ５の倍数かどうかを判定し、結果を表示する。
		if (num % 5 == 0) {
			System.out.println("５の倍数です");
		} else {
			System.out.println("５の倍数ではありません");
		}
	}
}