
public class TestSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] elements = { "beta", "chi", "alpha", "zeta", "nu", "mu" };
		
		// Selection Sort
		SortFactory factory = new NonRecursive();
		factory.setFactory("Selection");

		SortingAlgorithm algorithm = factory.getAlgorithm();

		algorithm.sort(elements);

		for (int i = 0; i < elements.length; i++)
			System.out.println(elements[i]);
		
		// Insertion Sort
		String[] elementsInsertion = { "beta", "chi", "alpha", "zeta", "nu", "mu" };
		factory.setFactory("Insertion");

		algorithm = factory.getAlgorithm();

		algorithm.sort(elementsInsertion);

		for (int i = 0; i < elementsInsertion.length; i++)
			System.out.println(elementsInsertion[i]);
	}
}
