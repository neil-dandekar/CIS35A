// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  3
// Due Date:           02.19.2023
// Date Submitted:     02.19.2023
// __________________________________

public class Franchise {
	// PROPERTIES:
	private Store stores[];
	
	// CONSTRUCTOR(S)
	public Franchise(int num) {
		stores = new Store[num];
	}

	// METHODS:
		// GETTERS:
	public Store getStores(int i) {
		return stores[i];
	}
	public int getNumberOfStores() {
		return stores.length;
	}
		// SETTER(S):
	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
		// INSTANCE:
	public void calc() {
		for(int i = 0; i < stores.length;i++)
			stores[i].analyzeResults();
	}
}