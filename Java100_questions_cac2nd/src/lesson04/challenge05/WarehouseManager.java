/**
 * 第4章 倉庫番のお仕事
 *
 * 問題5  袋の中身を調べる【改訂版】
 *
 * AB興産から預かっている荷物を再び検査することになりました。
 * 荷物は全部で5袋あり、その中で数値の5が入っている袋が
 * 何袋目なのかを調べなければなりません。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらに今回はそれぞれの袋の値が重複しないものとします。
 * （つまり、5が入っている袋はただ一つだけ）
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の検査結果を教えてください。
 *
 *  Yさん：
 *  はい、
 *  【※ここに値を出力】袋目
 *  に入っていました。
 *
 */

package lesson04.challenge05;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに配列の宣言を記述する
		int[] ABnimotsu = new int[5]; //袋の配列を用意

		int intputNum = 0;//袋に入れる数字を入れるやつ
		boolean loopFlag = false;//dowhileの条件判定用変数

		//ここに重複チェックおよび値の代入処理を記述する
		for (int i = 0; i < ABnimotsu.length; i++) {//袋に数字を入れたらiが進む
			do {//数が重複してたらここから繰り返す
				loopFlag = false;
				intputNum = (int) (Math.random() * 10) % 5 + 1;//袋に入れる数字を乱数で決める

				for (int j = 0; j < ABnimotsu.length; j++) {//すでに同じ数があるかの判定
					if (ABnimotsu[j] == intputNum) {//ここでjで０～４を順に確認する
						loopFlag = true;//被ってたらフラグをtrueにする
						break;//forから出る
					}
				}
			} while (loopFlag);//フラグがfalseならこの下　そうでないなら乱数からやり直し

			ABnimotsu[i] = intputNum;//数字をぶち込む

		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の検査結果を教えてください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");

		//ここに要素の確認および何袋目かの出力処理を記述する	
		for (int i = 0; i < ABnimotsu.length; i++) {
			if (ABnimotsu[i] == 5) {
				System.out.println((i + 1) + "袋目");
				break;
			}
		}

		System.out.println("に入っていました。");

	}
}
