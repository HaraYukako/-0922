package ExA01_01.java;

/*public class ExA01_01 {
	public static void main (String[] args)*/

/*[問題A1-1]実行時に指定した2つの値を連結して表示するアプリケーション
 * 〈ｐ〉実行時の指定〈/p〉
 * 〈ｐ〉java EXA01_01 値1　値2〈/p〉
 *
 */
/**
 * @author HARAY1
 *
 */
public class ExA01_01 {
	public static void main(String[] args) {
		//+(文字列連結演算子)で連結して表示する
		System.out.println(args[0] + "：" + args[1]);
	}
}