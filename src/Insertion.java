
public class Insertion implements SortingAlgorithm {

	public void sort(Object[] items) {
		int j;
		for (int p = 1; p < items.length; p++) {
			Object temp = items[p];

			for (j = p; j > 0 && items[j - 1] > temp; j--)
				items[j] = items[j - 1];

			items[j] = temp;
		}
	}
}
