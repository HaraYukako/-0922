/*
 * Ex03_15.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題3-15] int型と配列について、変数間で値の代入を行い、
 *             違いを確認するアプリケーション
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex03_15 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		System.out.println("基本のデータ型の場合について確認します");
		// int型の変数xを宣言し、5で初期化します
		int x = 5;

		// xの値を表示します
		System.out.println(x);

		// int型の変数yを宣言し、xの値を代入します
		int y = x;
		// 変数yに別の値10を代入します
		y = 10;

		// x、yの値を表示して、x,yの値を確認します
		System.out.println(x);
		System.out.println(y);

		System.out.println("参照型の場合について確認します");

		// int型の配列array1を宣言し、５つの要素の初期値も設定します
		int[] array1 = { 1, 2, 3, 4, 5 };

		// array1の２つめの要素の値を表示します
		System.out.println(array1[1]);
		// int型の配列array2の宣言し、new演算子で５つの要素を作成します
		int[] array2 = new int[5];
		//array1の変数の値をarray2へ代入します
		array2 = array1;
		// array2の２つめの要素に別の値を代入します
		array2[1] = 10;
		// array2に別の値を代入した後のarray1の２つめの要素の値を表示します
		System.out.println(array1[1]);
	}
}