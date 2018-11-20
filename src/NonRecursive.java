
public class NonRecursive extends SortFactory {

	protected SortingAlgorithm algorithm;
	
	public SortingAlgorithm getAlgorithm() {
		return this.algorithm;
	} 

	public void setFactory(SortingAlgorithm algorithm) {
		this.algorithm = algorithm;
	}
	
}
