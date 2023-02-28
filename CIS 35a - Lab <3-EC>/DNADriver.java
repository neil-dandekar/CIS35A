// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  3-EC
// Due Date:           02.26.2023
// Date Submitted:     02.26.2023
// __________________________________

import java.util.Scanner;

public class DNADriver {
    public static void main(String[] args) {
        // Create Scanner object and take DNA strand input:
        Scanner s1 = new Scanner(System.in);
        System.out.printf("Enter a DNA strand: ");
        String strand = s1.nextLine();
        s1.close();

        // Create DNA object with input strand:
        DNA dna = new DNA(strand);

        // Test DNA methods:
        System.out.printf("\n");
        dna.print();
        System.out.printf("\n");
        dna.highestMolarMass();
        System.out.printf("\n");
        dna.totalDensity();

        // Thank you statement:
        System.out.printf("\nThank you for using my program. \n-Neil Dandekar, 02.26.2023\n");
    }
}

// TEST CASES:
// 1. AGCCTAGGATCAG
// 2. AGCCTAGGATCTAGGATCAG
// 3. AGCCTATAGGATCAG
// 4. AAAGCCTAGGATAGGATCAG
// 5. AAAGCCTCTGAGGATAGGATCAG

/* TEST CASE 1:

    Enter a DNA strand: AGCCTAGGATCAG

    L_TO_R_HELIX:
    Index 0:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 1:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 2:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 3:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 4:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 5:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 6:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 7:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 8:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 9:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 10:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 11:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 12:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3


    R_TO_L_HELIX:
    Index 0:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 1:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 2:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 3:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 4:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 5:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 6:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 7:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 8:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 9:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 10:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 11:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 12:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Highest Molar Mass (LtoRHelix): Guanine [151.130005 g/mol] [indeces: 1, 6, 7, 12].
    Highest Molar Mass (RtoLHelix): Guanine [151.130005 g/mol] [indeces: 2, 3, 10].

    Total Density (LtoRHelix): 22.296001 g/cm^3.
    Total Density (RtoLHelix): 20.892000 g/cm^3.

    Thank you for using my program. 
    -Neil Dandekar, 02.26.2023

END TEST CASE 1 */

/* TEST CASE 2

    Enter a DNA strand: AGCCTAGGATCTAGGATCAG

    L_TO_R_HELIX:
    Index 0:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 1:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 2:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 3:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 4:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 5:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 6:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 7:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 8:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 9:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 10:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 11:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 12:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 13:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 14:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 15:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 16:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 17:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 18:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 19:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    R_TO_L_HELIX:
    Index 0:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 1:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 2:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 3:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 4:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 5:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 6:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 7:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 8:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 9:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 10:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 11:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 12:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 13:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 14:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 15:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 16:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 17:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 18:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 19:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Highest Molar Mass (LtoRHelix): 151.130005 g/mol [index: 1].
    Highest Molar Mass (RtoLHelix): 151.130005 g/mol [index: 2].

    Total Density (LtoRHelix): 33.892002 g/cm^3.
    Total Density (RtoLHelix): 31.837999 g/cm^3.

    Thank you for using my program. 
    -Neil Dandekar, 02.26.2023

END TEST CASE 2 */

/* TEST CASE 3

    Enter a DNA strand: AGCCTATAGGATCAG

    L_TO_R_HELIX:
    Index 0:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 1:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 2:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 3:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 4:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 5:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 6:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 7:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 8:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 9:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 10:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 11:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 12:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 13:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 14:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    R_TO_L_HELIX:
    Index 0:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 1:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 2:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 3:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 4:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 5:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 6:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 7:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 8:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 9:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 10:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 11:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 12:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 13:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 14:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Highest Molar Mass (LtoRHelix): Guanine [151.130005 g/mol] [indeces: 1, 8, 9, 14].
    Highest Molar Mass (RtoLHelix): Guanine [151.130005 g/mol] [indeces: 2, 3, 12].

    Total Density (LtoRHelix): 25.119001 g/cm^3.
    Total Density (RtoLHelix): 23.715000 g/cm^3.

    Thank you for using my program. 
    -Neil Dandekar, 02.26.2023

END TEST CASE 3 */

/* TEST CASE 4

    Enter a DNA strand: AAAGCCTAGGATAGGATCAG

    L_TO_R_HELIX:
    Index 0:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 1:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 2:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 3:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 4:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 5:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 6:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 7:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 8:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 9:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 10:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 11:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 12:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 13:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 14:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 15:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 16:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 17:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 18:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 19:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    R_TO_L_HELIX:
    Index 0:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 1:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 2:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 3:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 4:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 5:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 6:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 7:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 8:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 9:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 10:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 11:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 12:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 13:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 14:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 15:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 16:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 17:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 18:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 19:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Highest Molar Mass (LtoRHelix): Guanine [151.130005 g/mol] [indeces: 3, 8, 9, 13, 14, 19].
    Highest Molar Mass (RtoLHelix): Guanine [151.130005 g/mol] [indeces: 4, 5, 17].

    Total Density (LtoRHelix): 34.319000 g/cm^3.
    Total Density (RtoLHelix): 30.483997 g/cm^3.

    Thank you for using my program. 
    -Neil Dandekar, 02.26.2023

END TEST CASE 4*/

/* TEST CASE 5

    Enter a DNA strand: AAAGCCTCTGAGGATAGGATCAG

    L_TO_R_HELIX:
    Index 0:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 1:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 2:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 3:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 4:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 5:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 6:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 7:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 8:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 9:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 10:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 11:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 12:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 13:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 14:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 15:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 16:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 17:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 18:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 19:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 20:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 21:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 22:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    R_TO_L_HELIX:
    Index 0:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 1:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 2:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 3:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 4:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 5:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 6:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 7:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 8:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 9:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 10:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 11:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 12:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 13:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 14:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 15:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 16:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 17:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Index 18:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 19:
    Name: Adenine
    Formula: C5H5N5
    Molar Mass: 135.130005 g/mol
    Density: 1.600000 g/cm^3

    Index 20:
    Name: Guanine
    Formula: C5H5N5O
    Molar Mass: 151.130005 g/mol
    Density: 2.200000 g/cm^3

    Index 21:
    Name: Thymine
    Formula: C5H6N2O2
    Molar Mass: 126.114998 g/mol
    Density: 1.223000 g/cm^3

    Index 22:
    Name: Cytosine
    Formula: C4H5N3O
    Molar Mass: 111.099998 g/mol
    Density: 1.550000 g/cm^3

    Highest Molar Mass (LtoRHelix): Guanine [151.130005 g/mol] [indeces: 3, 9, 11, 12, 16, 17, 22].
    Highest Molar Mass (RtoLHelix): Guanine [151.130005 g/mol] [indeces: 4, 5, 7, 20].

    Total Density (LtoRHelix): 39.292004 g/cm^3.
    Total Density (RtoLHelix): 35.833996 g/cm^3.

    Thank you for using my program. 
    -Neil Dandekar, 02.26.2023

END TEST CASE 5 */