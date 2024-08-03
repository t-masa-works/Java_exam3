package exam;

public class Exam3 {

	public static void main(String[] args) {
		//		この章では、Javaの「繰り返し処理」について説明しています
		//		資料を確認して理解した後、以下の問題を解きソースコードを提出してください
		//
		//		【問1】 基本問題
		//		1から10までの整数の合計を計算し、その結果を表示するプログラムをforループを使用して作成してください
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			int sum = i + total;
			System.out.println(sum);
			total = sum;
		}
		//
		//
		//		【問2】九九
		//		九九を表示するプログラムを作成してください
		for (int i = 1; i <= 9; i++) {
			for (int n = 1; n <= 9; n++) {
				System.out.println(i * n);
			}
			System.out.println();
		}

		//
		//		【問3】階段
		//		添付されている「階段」を出力するようなプログラムを作成してください

		for (int d = 0; d < 5; d++) {
			for (int a = 0; a < (d + 1); a++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//		【問4】ピラミッド
		//		添付されている「ピラミッド」を出力するようなプログラムを作成してください
		for (int d = 0; d < 5; d++) {
			for (int s = 0; s < 5 - (d + 1); s++) {
				System.out.print(" ");
			}
			for (int a = 0; a < (d + 1) * 2 - 1; a++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
