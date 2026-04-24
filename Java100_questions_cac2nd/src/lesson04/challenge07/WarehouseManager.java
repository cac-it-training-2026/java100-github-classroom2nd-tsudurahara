/**
 * 第4章 倉庫番のお仕事
 *
 * 問題7 荷物の並べ替え（昇順、降順）
 *
 * AB興産からの次の依頼は、昇順、降順による並べ替えです。
 * 5袋ある荷物を中の値によって、小さい順に並べ替えて表示した後、
 * 大きい順に並べ替えて表示します。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の並べ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  並べ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  小さい順に並べ替えた後の状態は、
 *  1,2,3,4,5
 *  です。
 *
 *  大きい順に並べ替えた後の状態は、
 *  5,4,3,2,1
 *  です。
 *
 */

package lesson04.challenge07;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray = new int[5];

		//ここに重複チェックおよび値の代入処理を記述する
		int intputNum = 0;//袋に入れる数字を入れるやつ
		boolean loopFlag = false;//dowhileの条件判定用変数

		//ここに重複チェックおよび値の代入処理を記述する
		for (int i = 0; i < ABKosanArray.length; i++) {//袋に数字を入れたらiが進む
			do {//数が重複してたらここから繰り返す
				loopFlag = false;
				intputNum = (int) (Math.random() * 10) % 5 + 1;//袋に入れる数字を乱数で決める

				for (int j = 0; j < ABKosanArray.length; j++) {//すでに同じ数があるかの判定
					if (ABKosanArray[j] == intputNum) {//ここでjで０～４を順に確認する
						loopFlag = true;//被ってたらフラグをtrueにする
						break;//forから出る
					}
				}
			} while (loopFlag);//フラグがfalseならこの下　そうでないなら乱数からやり直し

			ABKosanArray[i] = intputNum;//数字をぶち込む

		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の並べ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("並べ替え前の状態は、");

		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		//ここに昇順にソートする処理を記述する
		for (int k = 0; k < ABKosanArray.length; k++) {
			for (int l = k + 1; l < ABKosanArray.length; l++) {
				if (ABKosanArray[k] > ABKosanArray[l]) {
					int temp = ABKosanArray[k];
					ABKosanArray[k] = ABKosanArray[l];
					ABKosanArray[l] = temp;
				}
			}
		}

		System.out.println("小さい順に並べ替えた後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		//ここに降順にソートする処理を記述する
		for (int m = 0; m < ABKosanArray.length; m++) {
			for (int n = m + 1; n < ABKosanArray.length; n++) {
				if (ABKosanArray[m] < ABKosanArray[n]) {
					int temp = ABKosanArray[m];
					ABKosanArray[m] = ABKosanArray[n];
					ABKosanArray[n] = temp;
				}
			}
		}

		System.out.println("大きい順に並べ替えた後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");
	}
}
