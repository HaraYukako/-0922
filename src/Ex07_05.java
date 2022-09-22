/*
 * Ex07_05.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題7-5] 実行時に指定した値(1～10)によって、メッセージ内容を変更して
 *            表示するアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex07_05 値1</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex07_05 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 実行時に指定した値を受け取る
		int Num = Integer.parseInt(args[0]);

		// 値に対応したメッセージを表示する
		switch (Num) {
		case 1:
		case 2:
			System.out.println("不可");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("可");
			break;

		case 6:
		case 8:
		case 7:
			System.out.println("良");
			break;

		case 9:
		case 10:
			System.out.println("優");
			break;

		}

	}
}