/*
 * Ex03_12.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題3-12] 姓と名を文字列連結して表示するアプリケーション
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex03_12 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 変数の宣言
		String surname = ("山本");
		String name = ("花子");
		// 姓を表示
		System.out.println(surname);
		// 名を表示
		System.out.println(name);
		System.out.println("名前全体を表示します");
		// 名前全体を表示
		System.out.println(surname + " " + name + "さん");
	}
}