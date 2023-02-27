// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  3
// Due Date:           02.19.2023
// Date Submitted:     02.19.2023
// __________________________________

public class Store {
	// PROPERTIES
	private float avgSalesByWeek[];
	private float avgWeeklySales;
	private float salesByWeek[][];
	private float totalSalesByWeek[];
	private float totalSalesForAllWeeks;
	private int weekWithHighestSales;
	private int weekWithLowestSales;
	
	// CONSTRUCTOR(S)
	Store() {
		avgSalesByWeek = new float[5];
		salesByWeek = new float[5][7];
		totalSalesByWeek = new float[5];
	}

	// METHODS
		// GETTER(S)
	float getTotalSalesForWeek(int week) {
		float total = 0;
		for(int i = 0; i < 7; i++) {
			total += salesByWeek[week][i];
		}
		return total;
	}
		// SETTER(S)
	public void setSaleForWeekDayIntersection(int week, int day, float sale) {
		salesByWeek[week][day] = sale;
	}
		// INSTANCE
	public void printData() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 7; j++) {
				System.out.printf("$%-10.2f ", salesByWeek[i][j]);
			}
			if(i==4);
			else System.out.println();
		}
	}
	public void calcTotalSalesByWeek() {
		for(int i = 0; i < salesByWeek.length; i++) {
            totalSalesByWeek[i] = getTotalSalesForWeek(i);
		}
	}
	public void calcAvgSalesByWeek() {
		for(int i = 0; i < salesByWeek.length; i++) {
            avgSalesByWeek[i] = totalSalesByWeek[i]/7;
		}
	}
	public void calcTotal() {
		this.totalSalesForAllWeeks = 0;
        for(int i = 0; i < totalSalesByWeek.length; i++) {
            this.totalSalesForAllWeeks += totalSalesByWeek[i];
		}
	}
	public void calcAvgWeeklySales() {
		this.avgWeeklySales = 0;
        for(int i = 0; i < avgSalesByWeek.length; i++) {
            this.avgWeeklySales += avgSalesByWeek[i];
		}
	}
	public void calcWeekWithHighestSales() {
		this.weekWithHighestSales = 0;
		float max = totalSalesByWeek[0];
		for(int i = 0; i < totalSalesByWeek.length; i++) {
			if(totalSalesByWeek[i] > max) {
				max = totalSalesByWeek[i];
				this.weekWithHighestSales = i;
			}
		}
	}
	public void calcWeekWithLowestSales() {
        this.weekWithLowestSales = 0;
		float min = totalSalesByWeek[0];
		for(int i = 1; i < totalSalesByWeek.length; i++) {
			if(totalSalesByWeek[i] < min) {
				min = totalSalesByWeek[i];
				this.weekWithLowestSales = i;
			}
		}
	}
	public void analyzeResults() {
		calcTotalSalesByWeek();
		calcAvgSalesByWeek();
		calcAvgWeeklySales();
		calcTotal();
		calcWeekWithHighestSales();
		calcWeekWithLowestSales();
	}
	public void print(int x) {
		//write a switch statement - 1 through 8 - 
		//8 - print sales data - printdata()
		//1 - 6 (the calculated values)
		//7 - print all.
		switch(x) {
			// TOTAL SALES BY WEEK:
			case 1:
			System.out.printf("Total Sales: [");
			for(int i = 0; i < salesByWeek.length - 1; i++) {
				System.out.printf("$%.2f, ", totalSalesByWeek[i]);
			}
			System.out.printf("$%.2f]", totalSalesByWeek[salesByWeek.length-1]);
			break;
				
			// AVERAGE SALES BY WEEK:
			case 2:
			System.out.printf("Average Sales: [");
			for(int i = 0; i < salesByWeek.length - 1; i++) {
				System.out.printf("$%.2f, ", avgSalesByWeek[i]);
			}
			System.out.printf("$%.2f]", avgSalesByWeek[salesByWeek.length-1]);
			break;

			// TOTAL SALES:
			case 3:
			System.out.printf("Total Sales: $%.2f", totalSalesForAllWeeks);
			break;
			
			// AVERAGE WEEKLY SALES:
			case 4: 
			System.out.printf("Average Weekly Sales: $%.2f", avgWeeklySales);
			break;
			
			// WEEK WITH HIGHEST SALES:
			case 5: 
			System.out.printf("Week with highest sales: %d [$%.2f]", weekWithHighestSales+1, 
			totalSalesByWeek[weekWithHighestSales]);
			break;
			
			// WEEK WITH LOWEST SALES:
			case 6: 
			System.out.printf("Week with lowest sales: %d [$%.2f]", weekWithLowestSales+1, 
			totalSalesByWeek[weekWithLowestSales]);
			break;

			// PRINT DATA:
			case 7:
				printData();
				break;
				
			// ALL OPERATIONS:
			case 8:
			for(int i = 1; i < 8; i++) {
				this.print(i);
				if(i != 7) System.out.printf("\n\n");
			}
			break;

			default:
				break;
		}
	}
}