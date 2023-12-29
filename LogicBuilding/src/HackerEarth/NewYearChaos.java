package HackerEarth;

public class NewYearChaos {

	public static void main(String[] args) {
		int row[] = { 2, 1, 5, 3, 4 };
		miniSwap(row);

	}

	private static void miniSwap(int[] row) {
		int count = 0;
		for (int i = row.length - 1; i >= 0; i--) {
			if (row[i] != i + 1) {
				if (((i - 1) >= 0) && row[i - 1] == (i + 1)) {
					count++;
					swap(row, i, i - 1);
				} else if (((i - 2) >= 0) && row[i - 2] == (i + 1)) {
					count = count + 2;
					swap(row, i - 2, i - 1);
					swap(row, i - 1, i);

				} else {
					System.out.println("To choas");

				}

			}
		}
		System.out.println(count);

	}

	private static void swap(int[] row, int i, int j) {
		int temp = row[i];
		row[i] = row[j];
		row[j] = temp;

	}

}
