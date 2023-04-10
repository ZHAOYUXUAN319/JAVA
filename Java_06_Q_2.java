package TextBook;

/**
質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼
び出してください。
**/
public class Java_06_Q_2 {

	public static void main(String[] args) {

		int i = 0;
		int Sum = sum(i);
		int Max = max(i);
		int Min = min(i);

		System.out.println("sum:" + Sum);
		System.out.println("max:" + Max);
		System.out.println("min:" + Min);

	}

	public static int sum(int i) {
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		for (i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static int max(int i) {
		int max = 0;
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int i) {
		int min = 0;
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (i = 0; i < array.length; i++) {
			min = array[i];
		}
		return min;
	}

}