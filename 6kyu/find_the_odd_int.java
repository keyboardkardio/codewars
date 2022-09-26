public class FindOdd {
	public static int findIt(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int currentNumber = a[i];
			for (int j = 0; j < a.length; j++) {
				if (a[j] == currentNumber) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return currentNumber;
			}
		}
		
		return 0;
	}
}
