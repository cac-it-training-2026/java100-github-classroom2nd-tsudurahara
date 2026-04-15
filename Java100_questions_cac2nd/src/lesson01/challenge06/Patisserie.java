/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");

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

			int kazushi, kazusyo, kazupi;
			kazushi = 30 - shitoto;
			kazusyo = 30 - syokoko;
			kazupi = 30 - pisusu;

			System.out.println("\n\n本日のおすすめ商品です\n\nシトロン\t\\250・・・残り" + kazushi + "個\n"
					+ "ショコラ\t\\280・・・残り" + kazusyo + "個\nピスターシュ\\320・・・残り" + kazupi + "個");

		} else {
			System.out.println("申し訳ございません。商品それぞれ在庫が30個ずつとなっております。");
		}
	}

}
