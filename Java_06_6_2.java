package TextBook;

/**
 * 1. メソッド名: subArray
2. 引数１︓intの配列 array
3. 引数２︓開始のstartIndex
4. 引数３︓⻑さlength
5. 戻り値︓intの配列
6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する

 * @author hangt
 * 
int[] array = new int[] {1, 2, 3, 4};
// start = 1, length = 2
int[] result = new int[] {2, 3}

 *
 */

public class Java_06_6_2 {

	public static void printArray(char[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		char prefix = ' ';
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ' ';
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
	public static void main(String[] args) {
		//int length = 2;
		//int start = 1;
		char [] array = {1, 2, 3, 4};
		//int[] result = subArray(array,1,2);
		printArray(result(array,1,2));
		//printArray(result);
		
	}

	public static int[] result(char[] array, int start, int length) {
		int [] result = new int [length];
		
		for(int i = 0; i < length; i++) {
			result[i] = array[start];
			start ++;
		}
		return result;
	}
}
