/*
 * Ex08_02.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題8-2] 実行時に指定した値の和を求めるアプリケーション
 * <p>実行時の指定（値は空白で区切って任意の数指定）</p>
 * <p>java Ex08_02 値1 ...</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex08_02 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 作業用変数の宣言
		/*int sumple = 0;
		 int num = args.length;
		 int Max =0;*/
		int val1;
		int ans = 0;

		// 実行時に指定された値の数だけ繰返し処理をする
		//for (int total= 0; Max<num; total++) {
		//args[]
		for (int i = 0; i < args.length; i++) {
			// 実行時に指定した値を受け取る
			//String input =args[];
			// 作業用変数 = Integer.parseInt(args[カウンタ変数]);
			//sumple = Integer.parseInt(args[]);
			val1 = Integer.parseInt(args[i]);

			// これまでの和に作業用変数の値を足す
			ans += val1; //ans = ans + val1
		}
		System.out.println("指定された数の和は次の通りです");
		// 結果を表示する。
		System.out.println(ans);
	}
}
