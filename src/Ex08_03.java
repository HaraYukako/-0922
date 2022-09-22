/*
 * Ex08_03.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題8-3] 実行時に指定した任意の数の値を、指定した順番の逆順に表示するアプリケーション
 * <p>実行時の指定（値は空白で区切って任意の数指定）</p>
 * <p>java Ex08_03 値1 ...</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex08_03 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 実行時に指定した値を逆順で表示する
		/*	String imput = args[i];
			int val = Integer.parseInt(imput);
		
			int[] intArray = { val };
			for (int i : intArray) {
				System.out.println(i);
			}
		}*/
		int idx = args.length - 1;

		for (int i = idx; i >= 0; i--) {
			System.out.println(args[i]);
		}
	}
}