/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		double dsam;
		double dshitoy, dsyokoy, dpisuy;
		int shitoy, syokoy, pisuy, yensam;

		dsam = shitoto + syokoko + pisusu;

		dshitoy = 250 * shitoto;
		dsyokoy = 280 * syokoko;
		dpisuy = 320 * pisusu;

		shitoy = (int) dshitoy;
		syokoy = (int) dsyokoy;
		pisuy = (int) dpisuy;

		yensam = shitoy + syokoy + pisuy;

		System.out.println("合計個数\t\\" + dsam + "個");
		System.out.println("合計金額\t\\" + yensam + "円");
		System.out.println("をお買い上げですね。\n承りました。\n\n本日のおすすめ商品です。");

		double kazushi, kazusyo, kazupi;
		kazushi = 30 - shitoto;
		kazusyo = 30 - syokoko;
		kazupi = 30 - pisusu;

		System.out.println("\nシトロン\t\\250・・・残り" + (int) kazushi + "個\n"
				+ "ショコラ\t\\280・・・残り" + (int) kazusyo + "個\nピスターシュ\\320・・・残り" + (int) kazupi + "個");

		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。\n");

		double shitopa, syokopa, pisupa;
		shitopa = (double) shitoy / (double) yensam * 100;
		syokopa = (double) syokoy / (double) yensam * 100;
		pisupa = (double) pisuy / (double) yensam * 100;

		System.out.println("売り上げの割合\n売り上げ合計\t\\" + yensam);
		System.out.println("内訳\nシトロン\t\\" + shitoy + "・・・" + (int) shitopa +
				"%\nショコラ\t\\" + syokoy + "・・・" + (int) syokopa
				+ "%\nピスターシュ\\" + pisuy + "・・・" + (int) pisupa + "%");

	}

}
