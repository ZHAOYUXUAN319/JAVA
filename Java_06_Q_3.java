package TextBook;

/**
 * 質問３．以下メソッドの実施結果を教えてください。
 * @author hangt
 *
 *
 *何でも出ない
 */
public class Java_06_Q_3 {

	public class Kicker {
		private static void sayHello(String y) {
			y = "Hello world";
		}

		public static void main(String args[]) {
			String x = null;
			sayHello(x);
			System.out.println(x);
		}
	}
}