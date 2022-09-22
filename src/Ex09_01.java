/*
 * Ex09_01.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */

/**
 *  [問題9-1] 実行時に指定された2つの数値の四則演算結果を表示するアプリケーション
 * <p>実行時の指定</p>
 * <p>java Ex09_01 値1 値2</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex09_01 {
	/**
	 * 実行時の起点
	 *
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// 実行時に指定された値の四則演算結果を表示します。
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		int addition = add(x, y);
		System.out.println("和 = " + addition);
		int subtraction = subtract(x, y);
		System.out.println("差 = " + subtraction);
		int multiplication = multiply(x, y);
		System.out.println("積 = " + multiplication);
		int division = divide(x, y);
		System.out.println("商 = " + division);
	}

	//メソッドを4つ定義します。
	static int add(int x, int y) {
		int result = x + y;
		return result;
	}

	static int subtract(int x, int y) {
		int result = x - y;
		return result;
	}

	static int multiply(int x, int y) {
		int result = x * y;
		return result;
	}

	static int divide(int x, int y) {
		int result = x / y;
		return result;
	}
}
/*public static void main(String[] args) {
	// 実行時に指定された値の四則演算結果を表示します。
	String imput1 = args[0];
	String imput2 = args[1];
	int x = Integer.parseInt(imput1);
	int y = Integer.parseInt(imput2);
	System.out.println("和 = " + add(x, y));
	System.out.println("差 = " + subtract(x, y));
	System.out.println("積 = " + multiply(x, y));
	System.out.println("商 = " + divide(x, y));
}

// メソッドを4つ定義します。
public static int add(int x, int y) {
	return (x + y);
}

public static int subtract(int x, int y) {
	return (x - y);
}

public static int multiply(int x, int y) {
	return (x * y);
}

public static int divide(int x, int y) {
	return (x / y);
}
}*/