/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
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
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個ずつ買いますか？");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("シトロン>");
		String shitoro = reader.readLine();
		System.out.println("ショコラ>");
		String syokora = reader.readLine();
		System.out.println("ピスターシュ>");
		String pisuta = reader.readLine();

		System.out.println("シトロン\t" + shitoro + "個\nショコラ\t" + syokora + "個\nピスターシュ"
				+ pisuta + "個\n");
		int shitoroyen, syokorayen, pisutayen, samyen;
		int sam = 0;
		int shitoto = Integer.parseInt(shitoro);
		int syokoko = Integer.parseInt(syokora);
		int pisusu = Integer.parseInt(pisuta);

		sam = shitoto + syokoko + pisusu;

		shitoroyen = shitoto * 250;
		syokorayen = syokoko * 280;
		pisutayen = pisusu * 320;
		samyen = shitoroyen + syokorayen + pisutayen;

		if (shitoto <= 30 && syokoko <= 30 && pisusu <= 30) {

			System.out.println("合計個数\t" + sam + "個\n合計金額\t" + samyen + "円");
		} else {
			System.out.println("申し訳ございません。商品それぞれ在庫が30個ずつとなっております。");
		}
	}

}
