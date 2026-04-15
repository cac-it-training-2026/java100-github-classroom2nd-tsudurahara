/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個づつ買いますか？\nシトロン>");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String buyshitoro = reader.readLine();
		System.out.println("ショコラ>");
		String buysyokora = reader.readLine();
		System.out.println("ピスターシュ>");
		String buypisuta = reader.readLine();

		System.out.println("シトロン\t" + buyshitoro + "個\nショコラ\t"
				+ buysyokora + "個\nピスターシュ" + buypisuta + "個\n\nをお買い上げですね"
				+ "\n承りました。");

	}

}
