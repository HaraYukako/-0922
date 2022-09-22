/*
 * Ex07_04.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題7-4] 実行時に月を表す数字(1～12)を指定し、指定された月が何日まで
 *            あるかを表示するアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex07_04 値1</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex07_04 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 実行時に指定した値を受け取る
		String input = args[0];

		// 実行時に指定された値をString型からint型に変換する
		int month = Integer.parseInt(input);
		System.out.println("判定結果は次の通りです");
		// 月の日数を判定し、結果を表示する。
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "月は、31日あります");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "月は、30日あります");
			break;
		case 2:
			System.out.println(month + "月は、28または29日あります");
			break;
		default:
			System.out.println("１から１２の整数を指定してください");
		}
	}
}