// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  2
// Due Date:           02.12.2023
// Date Submitted:     02.09.2023
// __________________________________

import java.util.Scanner;

public class GenoNucleicAcid {
    static Scanner s1 = new Scanner(System.in);
    public static void main(String [] args) {

        // GenoNucleicAcid object to use NucleicAcid class
        GenoNucleicAcid d1 = new GenoNucleicAcid();

        // Create and print NucleicAcid object "Cytosine"
        NucleicAcid Cytosine = d1.readValue(s1);
        Cytosine.print();
        System.out.printf("\n");

        s1.nextLine(); // Clear input buffer

        // Create and print NucleicAcid object "Adenine"
        NucleicAcid Adenine = d1.readValue(s1);
        Adenine.print();
        s1.nextLine(); // Clear input buffer
        System.out.printf("\n");

        // Create and print NucleicAcid object "Guanine"
        NucleicAcid Guanine = d1.readValue(s1);
        Guanine.print();
        System.out.printf("\n");

        s1.nextLine(); // Clear input buffer

        // Create and print NucleicAcid object "Thymine"
        NucleicAcid Thymine = d1.readValue(s1);
        Thymine.print();
        System.out.printf("\n");

        s1.nextLine(); // Clear input buffer

        // Create and print NucleicAcid object "Uracil"
        NucleicAcid Uracil = d1.readValue(s1);
        Uracil.print();
        System.out.printf("\n");

        s1.nextLine(); // Clear input buffer

        // Thank you statement:
        System.out.printf("%nThank you for using my program. %n-Neil Dandekar, 02.09.2023%n");
    }

    // METHODS
    public NucleicAcid readValue(Scanner s1) {

        // Collect and store name:
        System.out.printf("\nEnter a name: ");
        String name = s1.nextLine();

        // Collect and store address:
        System.out.printf("Enter the formula: ");
        String formula = s1.nextLine();

        // Collect and store age:
        System.out.printf("Enter the molar mass: ");
        float molarMass = s1.nextFloat();

        // Collect and store phone number:
        System.out.printf("Enter the density: ");
        float density = s1.nextFloat();
        
        // Create and return new NucleicAcid object
        return new NucleicAcid(name, formula, molarMass, density);
    }
}

/* TEST RUN:

    Enter a name: Cytosine
    Enter the formula: C4H5N3O
    Enter the molar mass: 111.10
    Enter the density: 1.55
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Enter a name: Adenine
    Enter the formula: C5H5N5
    Enter the molar mass: 135.13
    Enter the density: 1.6
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Enter a name: Guanine
    Enter the formula: C5H5N5O
    Enter the molar mass: 151.13
    Enter the density: 2.200
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Enter a name: Thymine
    Enter the formula: C5H6N2O2
    Enter the molar mass: 126.115
    Enter the density: 1.223 
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Enter a name: Uracil
    Enter the formula: C4H4N2O2
    Enter the molar mass: 112.08676
    Enter the density: 1.32
    Name: Uracil
    Formula: C4H4N2O2
    Molar Mass: 112.086761 g/mol
    Density: 1.320000 g/cm^3

 * END TEST RUN */