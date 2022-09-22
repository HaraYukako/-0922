/*
 * Ex07_02.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題7-2] 実行時に指定した2つの数値を大小比較して結果を表示する
 *            アプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex07_02 値1 値2</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex07_02 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 実行時に指定した値を受け取る
		/*String input1 = args[0];
		String input2 = args[1];
		//String型からint型へ変換
		int x = Integer.parseInt(input1);
		int y = Integer.parseInt(input2);
		
		// 値に対応したメッセージを表示する
		if (x > y) {
			System.out.println("1つめの値が大きい");
		} else if (x == y) {
			System.out.println("2つの値は等しい");
		} else {
			System.out.println("2つめの値が大きい");*/

		// 実行時に指定した値を受け取る
		double val1 = Double.parseDouble(args[0]);
		double val2 = Double.parseDouble(args[1]);

		// 値に対応したメッセージを表示する
		if (val1 > val2) {
			System.out.println("1つめの値が大きい");
		} else if (val1 == val2) {
			System.out.println("2つの値は等しい");
		} else {
			System.out.println("2つめの値が大きい");
		}
	}

}
