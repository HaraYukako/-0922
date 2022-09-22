/*
 * Ex09_02.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題9-2] １つのint型変数と２つの要素を持つint型の配列の内容を
 *            メソッドの中で変更するアプリケーション
 *
 * <p>実行時の指定</p>
 * <p>java Ex09_02</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex09_02 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		int value = 7;
		int[] array = { 10, 20 };

		System.out.println("変更前");
		printValue(value, array);
		changeValue(value, array);
		System.out.println("変更後");
		printValue(value, array);
	}

	//引数の値を表示
	static void printValue(int value, int[] array) {
		System.out.println("value   ：" + value);
		System.out.println("array[0]：" + array[0]);
		System.out.println("array[1]：" + array[1]);
	}

	//引数の値を変更
	static void changeValue(int value, int[] array) {
		value = 8;
		array[0] = 70;
		array[1] = 80;
	}
}