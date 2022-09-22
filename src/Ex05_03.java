/*
 * Ex05_03.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題5-3] ２つの商品の値段から消費税を計算するアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex05_03</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex05_03 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		final double TAX_RATE = 0.08; // 消費税率をdouble型の定数で宣言
		int price1 = 130; // 1つ目の商品の値段を表す変数price1を宣言
		int price2 = 170; // 2つ目の商品の値段を表す変数price2を宣言

		System.out.println("２つの商品の値段を表示します");
		System.out.println(price1);
		System.out.println(price2);

		// 値段price1の消費税を計算した結果を、
		// double型の変数dtax1に代入します
		double dtax1 = (price1 * TAX_RATE);

		// 値段price2の消費税を計算した結果を、
		// double型の変数dtax2に代入します
		double dtax2 = (price2 * TAX_RATE);

		// dtax1とdtax2の値を表示します
		System.out.println("double型での消費税の計算結果を表示します");
		System.out.println(dtax1);
		System.out.println(dtax2);

		// dtax1をint型の変数itax1に、
		// dtax2をint型の変数itax2に代入します(小数点切捨て)
		int itax1 = (int) dtax1;
		int itax2 = (int) dtax2;

		// itax1とitax2の値を表示します
		System.out.println("商品を個別に購入したときの消費税を表示します");
		System.out.println(itax1);
		System.out.println(itax2);

		// 商品をまとめて購入したときの消費税を計算し、
		// int型の変数total_taxに代入ます
		int total_tax = (int) ((price1 + price2) * TAX_RATE);
		// 消費税を表示します
		System.out.println("商品をまとめて購入したときの消費税を表示します");
		System.out.println(total_tax);

	}
}