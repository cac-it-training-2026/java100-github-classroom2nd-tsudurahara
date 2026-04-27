/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("シトロン>");
		String shitoro = reader.readLine();
		System.out.print("ショコラ>");
		String syokora = reader.readLine();
		System.out.print("ピスターシュ>");
		String pisuta = reader.readLine();

		double shitoto = Double.parseDouble(shitoro);
		double syokoko = Double.parseDouble(syokora);
		double pisusu = Double.parseDouble(pisuta);
		double toutaru = shitoto + syokoko + pisusu;

		System.out.println("\nシトロン\t" + shitoto + "個\nショコラ\t" + syokoko + "個\nピスターシュ"
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

		System.out.println("合計個数\t" + dsam + "個");
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

		int ishitopa = (int) shitopa;
		int isyokopa = (int) syokopa;
		int ipisupa = (int) pisupa;

		double makayen;
		//makayen = ((ishitopa / 100) * 250) + ((isyokopa / 100) * 280) + ((ipisupa / 100) * 320);
		makayen = (yensam / (int) toutaru) / 10 * 10;

		System.out.println("売り上げの割合\n売り上げ合計\t\\" + yensam);
		System.out.println("\n内訳\nシトロン\t\\" + shitoy + "・・・" + ishitopa +
				"%\nショコラ\t\\" + syokoy + "・・・" + isyokopa
				+ "%\nピスターシュ\\" + pisuy + "・・・" + ipisupa + "%");

		System.out.println("\n明日のマカロンの配合率が決まりました！\n");
		System.out.println("シトロン\t・・・" + ishitopa + "%\nショコラ\t・・・" + isyokopa
				+ "%\nピスターシュ・・・" + ipisupa + "%");
		System.out.println("\nが楽しめます！\n\n値段は" + (int) makayen + "です");

	}

}
