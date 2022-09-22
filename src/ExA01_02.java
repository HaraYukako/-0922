/*
 * ExA01_02.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題A1-2] 実行時に指定した2つの値をdouble型に変換して
 *            加算をするアプリケーション
 * <p>実行時の指定</p>
 * <p>java ExA01_02 値1 値2</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class ExA01_02 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 実行時に指定した値を受け取る
		String x = args[0];
		String y = args[1];
		// 実行時に指定された２つの値をString型からdouble型に変換する
		double val1 = Double.parseDouble(x);
		double val2 = Double.parseDouble(y);

		System.out.println("加算を行います");
		// 加算の結果をdouble型の変数に代入する 
		double sum = (val1 + val2);

		//  演算結果を表示する
		System.out.println("double:" + sum);

	}
}