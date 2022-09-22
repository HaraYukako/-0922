/*
 * Ex03_14.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題3-14] 配列を2つ作成し、1つめの配列の要素の値を2つめの配列に
 *             コピーするアプリケーション
 *
 * @author Unisys
 * @version 1.0
 */
/**
 * @author HARAY1
 *
 */
public class Ex03_14 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// array1の作成、array1の各要素表示
		int[] array1 = { 1, 2, 3, 4, 5 };
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);

		System.out.println("配列のコピーをします");
		// array2の作成、array1からのデータコピー、array2の各要素表示
		int[] array2 = new int[3];
		array2[0] = array1[1];
		array2[1] = array1[2];
		array2[2] = array1[3];
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
	}
}