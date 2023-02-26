

import java.util.Scanner;

public class GenomeInput {
    static Scanner s1 = new Scanner(System.in);
    public static void main(String [] args) {

        // GenomeInput object to use HumanGenome class
        GenomeInput d1 = new GenomeInput();

        // Create and print HumanGenome object "Bob"
        HumanGenome Bob = d1.readValue(s1);
        Bob.print();
        System.out.printf("\n");

        s1.nextLine(); // Clear input buffer

        // Create and print HumanGenome object "Sally"
        HumanGenome Sally = d1.readValue(s1);
        Sally.print();
        s1.nextLine(); // Clear input buffer
        System.out.printf("\n");

        // Create and print HumanGenome object "Sri"
        HumanGenome Sri = d1.readValue(s1);
        Sri.print();
        System.out.printf("\n");

        s1.nextLine(); // Clear input buffer

        // Thank you statement:
        System.out.printf("%nThank you for using my program. %n-Neil Dandekar, 02.09.2023%n");
    }

    // METHODS
    public HumanGenome readValue(Scanner s1) {

        // Collect and store name:
        System.out.printf("\nEnter a name: ");
        String name = s1.nextLine();

        // Collect and store address:
        System.out.printf("Enter the number of genes: ");
        int numGenes = s1.nextInt();

        // Collect and store age:
        System.out.printf("Enter the number of chromosomes: ");
        int numChromosomes = s1.nextInt();

        // Collect and store phone number:
        System.out.printf("Enter the number of cells: ");
        int numCells = s1.nextInt();
        
        // Create and return new HumanGenome object
        return new HumanGenome(name, numGenes, numChromosomes, numCells);
    }
}

/* TEST RUN:

    Enter a name: Human Bob
    Enter the number of genes: 20000
    Enter the number of chromosomes: 46
    Enter the number of cells: 76
    Name: Human Bob
    Number of Genes: 20000
    Number of Chromosomes: 46
    Number of Cells: 76

    Enter a name: Human Sally
    Enter the number of genes: 20000
    Enter the number of chromosomes: 46
    Enter the number of cells: 120
    Name: Human Sally
    Number of Genes: 20000
    Number of Chromosomes: 46
    Number of Cells: 120

    Enter a name: Human Sri
    Enter the number of genes: 20000
    Enter the number of chromosomes: 46
    Enter the number of cells: 75
    Name: Human Sri
    Number of Genes: 20000
    Number of Chromosomes: 46
    Number of Cells: 75

    Thank you for using my program. 
    -Neil Dandekar, 02.09.2023

 * END TEST RUN */