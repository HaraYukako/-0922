/*
 * Ex09_03.java
 *
 * Copyright(c) 2015-2017 Nihon Unisys, Ltd. All rights reserved.
 */
/**
 *  [問題9-3]
 *
 * <p>実行時の指定</p>
 * <p>java Ex09_03</p>
 *
 * @author Unisys
 * @version 1.0
 */
public class Ex09_03 {
    /**
     * 実行時の起点
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        double radius = 1;

        System.out.print("半径" + radius + "の円の面積は" );
        if ( 50 <= calcCircleArea(radius) &&  calcCircleArea(radius) <= 100 ) {
            System.out.print("50以上 かつ 100以下");
        }
        else {
            System.out.print("50未満 又は 100より大きい");
        }
        System.out.print("です");
    }
    /**
     * 引数の値を表示するメソッド
     *
     * @param radius
     */
    static double calcCircleArea(double radius) {
        final double PI = 3.1415;

        return PI*radius*radius; // 円周率×半径×半径
    }
}