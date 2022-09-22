/*
 * Ex08_01.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題8-1] 1からn(実行時に指定した数)までの和を表示するアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex08_01 値1</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex08_01 {
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

		System.out.println("1から指定された数までの和は次の通りです");
		// 和を求め、結果を表示する。
		/* num = 0;
		 int sum =0;
		 while( num) {
		   sum=	1 + num  ;
		 }
		System.out.println();*/
		int ans = 0;
		int i = 1; //1から足すから1を代入

		while (i <= num) { //iが入力された数字より小さい間繰り返す
			ans += i; //ans = ans + i;
			i++;
		}
		System.out.println(ans);
	}
}