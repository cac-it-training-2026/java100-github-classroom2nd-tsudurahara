/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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

		double shitoto = Double.parseDouble(shitoro);
		double syokoko = Double.parseDouble(syokora);
		double pisusu = Double.parseDouble(pisuta);

		System.out.println("シトロン\t" + shitoto + "個\nショコラ\t" + syokoko + "個\nピスターシュ"
				+ pisusu + "個\n");

		double dsam, dyensam;

		dsam = shitoto + syokoko + pisusu;
		dyensam = 250 * shitoto + 280 * syokoko + 320 * pisusu;
		int yensam = (int) dyensam;

		System.out.println("合計個数\t\\" + dsam + "個");
		System.out.println("合計金額\t\\" + yensam + "円");
		System.out.println("をお買い上げですね。\n承りました。\n\n本日のおすすめ商品です。");

		double kazushi, kazusyo, kazupi;
		kazushi = 30 - shitoto;
		kazusyo = 30 - syokoko;
		kazupi = 30 - pisusu;

		System.out.println("\n\n本日のおすすめ商品です\n\nシトロン\t\\250・・・残り" + (int) kazushi + "個\n"
				+ "ショコラ\t\\280・・・残り" + (int) kazusyo + "個\nピスターシュ\\320・・・残り" + (int) kazupi + "個");

	}

}
