/*
 * Ex08_04.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題8-4] 実行時に指定された長さの底辺をもつ三角形を描くアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex08_04 値1</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex08_04 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		int width = Integer.parseInt(args[0]);
		//実行時に指定された長さの三角形を描きます
		for (int x = 1; x <= width; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 実行時に指定された長さの三角形をかきます
	/*	int imput = Integer.parseInt(args[0]);
		for (int i = 0; i < imput; i++) {
			System.out.print("*");
			System.out.println();
			for (int m = 0; m  imput; m--) {
				System.out.print("*");
			}
		}
	
	}*/
}