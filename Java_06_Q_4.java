package TextBook;

/**
 * 質問4．以下メソッドの実施結果を教えてください。
 * @author hangt
 *
 *
 *何でも出ない
 */
public class Java_06_Q_4 {

	public class Kicker {
		private static void fillArray(String[] array) {
			array[0] = "value2";
		}

		public static void main(String args[]) {
			String[] array = new String[] { "value1" };
			fillArray(array);
			System.out.println(array[0]);
		}
	}

}
