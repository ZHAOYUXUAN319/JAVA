package TextBook;

/**
 * 質問5．以下メソッドの実施結果を教えてください。
 * @author hangt
 *
 *
 *何でも出ない
 */
public class Java_06_Q_5 {

	public class Kicker {
		private static void fillArray(String[] array) {
			array = new String[] { "1", "2" };
		}

		public static void main(String args[]) {
			String[] array = null;
			fillArray(array);
			System.out.println(array == null);
		}
	}

}
