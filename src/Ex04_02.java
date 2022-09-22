/*
 * Ex04_02.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題4-2] 2つの整数値を使って、演算するアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex04_02</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex04_02 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		int x = 5;
		int y = 3;

		System.out.println("２つの整数値を使って演算します");
		System.out.println("x:" + x + "  y:" + y);
		// 商を表示する
		System.out.println("商:" + x / y);

		// 余りを表示する
		System.out.println("余り:" + x % y);

	}
}