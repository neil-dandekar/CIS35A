// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  3
// Due Date:           02.19.2023
// Date Submitted:     02.19.2023
// __________________________________

public class Driver {
	public static void main(String[] args) {
        // Create driver object and run program:
		Driver d1 = new Driver();
		d1.runProgram("Salesdat.txt");
	}

	// METHOD(S):
	void runProgram(String filename) {
		// weufh
		// Feed data file to new FileIO object:
		FileIO file = new FileIO(filename);

		// Read data file to new Franchise object:
		Franchise f = file.readData();

		// Calculate all Store data in Franchise object:
		f.calc();

		// Create UI object and run program for user:
		UI ui = new UI(f);
		ui.play();
	}
}