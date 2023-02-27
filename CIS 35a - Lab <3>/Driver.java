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
		d1.runProgram("CIS 35a - Lab <3>/Salesdat.txt");
	}

	// METHOD(S):
	void runProgram(String filename) {
		
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

/* TEST RUN 1:

	Hello, welcome to Lab 3 by Neil Dandekar.

	The program will prompt you to select a store # (1-6).
	Then, select an operation from the list below:
			1. Print Total Sales by Week
			2. Print Average Sales by Week
			3. Print Total Sales
			4. Print Average Weekly Sales
			5. Print Week with Highest Sales
			6. Print Week with Lowest Sales
			7. Print Data
			8. All Above Operations
	To end the program, enter 'quit'. Enjoy.

	Select a Store: 1
	Select an Operation: 1

	Total Sales: [$16419.52, $20615.00, $24878.00, $29141.00, $33404.00]

	Select a Store: 1
	Select an Operation: 2

	Average Sales: [$2345.65, $2945.00, $3554.00, $4163.00, $4772.00]

	Select a Store: 1
	Select an Operation: 3

	Total Sales: $124457.52

	Select a Store: 1
	Select an Operation: 4

	Average Weekly Sales: $17779.64

	Select a Store: 1
	Select an Operation: 5

	Week with highest sales: 5 [$33404.00]

	Select a Store: 1
	Select an Operation: 6

	Week with lowest sales: 1 [$16419.52]

	Select a Store: 1
	Select an Operation: 7

	$2541.56    $2258.96    $2214.00    $2256.00    $2154.00    $2398.00    $2597.00    
	$2684.00    $2771.00    $2858.00    $2945.00    $3032.00    $3119.00    $3206.00    
	$3293.00    $3380.00    $3467.00    $3554.00    $3641.00    $3728.00    $3815.00    
	$3902.00    $3989.00    $4076.00    $4163.00    $4250.00    $4337.00    $4424.00    
	$4511.00    $4598.00    $4685.00    $4772.00    $4859.00    $4946.00    $5033.00    

	Select a Store: 1
	Select an Operation: 8

	Total Sales: [$16419.52, $20615.00, $24878.00, $29141.00, $33404.00]

	Average Sales: [$2345.65, $2945.00, $3554.00, $4163.00, $4772.00]

	Total Sales: $124457.52

	Average Weekly Sales: $17779.64

	Week with highest sales: 5 [$33404.00]

	Week with lowest sales: 1 [$16419.52]

	$2541.56    $2258.96    $2214.00    $2256.00    $2154.00    $2398.00    $2597.00    
	$2684.00    $2771.00    $2858.00    $2945.00    $3032.00    $3119.00    $3206.00    
	$3293.00    $3380.00    $3467.00    $3554.00    $3641.00    $3728.00    $3815.00    
	$3902.00    $3989.00    $4076.00    $4163.00    $4250.00    $4337.00    $4424.00    
	$4511.00    $4598.00    $4685.00    $4772.00    $4859.00    $4946.00    $5033.00    

	Select a Store: quit

	Thank you for using my program. 
	-Neil Dandekar, 02.19.2023

 * END TEST RUN 1*/

/* TEST RUN 2:

	Hello, welcome to Lab 3 by Neil Dandekar.

	The program will prompt you to select a store # (1-6).
	Then, select an operation from the list below:
			1. Print Total Sales by Week
			2. Print Average Sales by Week
			3. Print Total Sales
			4. Print Average Weekly Sales
			5. Print Week with Highest Sales
			6. Print Week with Lowest Sales
			7. Print Data
			8. All Above Operations
	To end the program, enter 'quit'. Enjoy.

	Select a Store: 1
	Select an Operation: 1

	Total Sales: [$16419.52, $20615.00, $24878.00, $29141.00, $33404.00]

	Select a Store: 2
	Select an Operation: 2

	Average Sales: [$1845.65, $2445.00, $3054.00, $3663.00, $4272.00]

	Select a Store: 3
	Select an Operation: 3

	Total Sales: $141957.52

	Select a Store: 4
	Select an Operation: 4

	Average Weekly Sales: $22889.55

	Select a Store: 5
	Select an Operation: 5

	Week with highest sales: 5 [$33443.55]

	Select a Store: 6
	Select an Operation: 6

	Week with lowest sales: 1 [$26912.45]

	Select a Store: 3   
	Select an Operation: 7

	$3041.56    $2758.96    $2714.00    $2756.00    $2654.00    $2898.00    $3097.00    
	$3184.00    $3271.00    $3358.00    $3445.00    $3532.00    $3619.00    $3706.00    
	$3793.00    $3880.00    $3967.00    $4054.00    $4141.00    $4228.00    $4315.00    
	$4402.00    $4489.00    $4576.00    $4663.00    $4750.00    $4837.00    $4924.00    
	$5011.00    $5098.00    $5185.00    $5272.00    $5359.00    $5446.00    $5533.00    

	Select a Store: 5
	Select an Operation: 8

	Total Sales: [$16459.07, $20654.55, $24917.55, $29180.55, $33443.55]

	Average Sales: [$2351.30, $2950.65, $3559.65, $4168.65, $4777.65]

	Total Sales: $124655.27

	Average Weekly Sales: $17807.90

	Week with highest sales: 5 [$33443.55]

	Week with lowest sales: 1 [$16459.07]

	$2547.21    $2264.61    $2219.65    $2261.65    $2159.65    $2403.65    $2602.65    
	$2689.65    $2776.65    $2863.65    $2950.65    $3037.65    $3124.65    $3211.65    
	$3298.65    $3385.65    $3472.65    $3559.65    $3646.65    $3733.65    $3820.65    
	$3907.65    $3994.65    $4081.65    $4168.65    $4255.65    $4342.65    $4429.65    
	$4516.65    $4603.65    $4690.65    $4777.65    $4864.65    $4951.65    $5038.65    

	Select a Store: quit

	Thank you for using my program. 
	-Neil Dandekar, 02.19.2023

 * END TEST RUN 2*/