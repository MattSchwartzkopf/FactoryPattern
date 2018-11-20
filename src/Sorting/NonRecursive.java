package Sorting;

public class NonRecursive extends SortFactory {

	protected String algorithm;
	


	public void setFactory(String algorithm) {
		this.algorithm = algorithm;
	}

	public SortingAlgorithm getAlgorithm() {
		SelectionSort selectionSorter = new SelectionSort();
		Insertion insertionSorter = new Insertion();
		
		if(algorithm == "Selection")
			return selectionSorter;
		else if(algorithm == "Insertion")
			return insertionSorter;
		else
			return null;
	} 
	
}
