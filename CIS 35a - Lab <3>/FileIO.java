// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  3
// Due Date:           02.19.2023
// Date Submitted:     02.19.2023
// __________________________________

// Import packages/libraries:
import java.io.*;   // FileIO
import java.util.*; // Breaking down Strings

public class FileIO {
	// PROPERTIES
	private String fname = null;   // File name
	private boolean DEBUG = false; // Prints input (for debugging)

	// CONSTRUCTOR(S)
	public FileIO(String fname) {
		this.fname = fname;
	}

	// METHODS
	// Reads data file and returns a Franchise object (ASSOCIATION):
	public Franchise readData() {
		Franchise a1 = null; // Create object
		int counter = 0;

		// Try/Catch block for possible FileIO exceptions:
		//  - For checked exceptions
		try {
			FileReader file = new FileReader(fname);		// Take in file
			BufferedReader buff = new BufferedReader(file); // Pass file to Buffer
			String temp;
			boolean eof = false; // End of file - while loop condition
			while (!eof) {
				String line = buff.readLine(); // Read line to String
				counter++; 		  // Implement counter of lines
				if (line == null) // readLine = null at eof
					eof = true;   // End loop
				else {
					// Print input if DEBUG:
					if (DEBUG)	
						System.out.println("Reading" + line);
					// Build Franchise:
					if (counter == 1) {
						temp = line; // Line of input
						// Cast input to Integer and create Franchise with [input] # of Stores:
						a1 = new Franchise(Integer.parseInt(temp));
					// Print input if DEBUG:
						if (DEBUG)
							System.out.println("d  " + a1.getNumberOfStores());
					}
					// Do nothing for second line:
					if (counter == 2);
					// Build a Store:
					if (counter > 2) {
						// Builds a store:
						// - Franchise object, counter (index >= 0), input
						int x = buildStore(a1, (counter-3), line);
						// Print input if DEBUG:
						if (DEBUG)
							System.out.println("Reading Store # "+(counter-2)+" Number of weeks read =  " +  x);
						if (DEBUG)
						{	
							System.out.println("Data read:");
							a1.getStores(counter-3).printData();
						}
					}
				}
			}
			buff.close(); // Prevent resource leak
		// Catch exception - prints error message:
		} catch (Exception e) {
			System.out.println("Error -- " + e.toString());
		}
		return a1; // Return franchise
	}
	
	// Builds a store to Franchise object from input:
	public int buildStore(Franchise a1, int counter, String temp) {
		// Initialize variables to create the Store:
		Store tstore = new Store();
		String s1 =  "";
		float sale = 0.0f;
		int week = 0;
		int day = 0;
		
		// Object created to take a String and chop it into smaller values:
		// Using space as a delimiter to separate and read sales values:
		StringTokenizer st = new StringTokenizer(temp);
		// Process the whole line (weeks):
		while(st.hasMoreTokens()) {
			// Loop for days:
			for(day = 0; day < 7; day++) {
				s1 = st.nextToken(); // Individual sales value
				sale = Float.parseFloat(s1); // Convert to float
				// Build individual sale for temp Store:
				tstore.setSaleForWeekDayIntersection(week, day, sale);
			}
			week++; // Increment weeks
		}
		// Add temp Store to Franchise
		a1.setStores(tstore, counter);
		return week; // Ensure x weeks of data are received
	}
}