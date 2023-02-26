Name:               Neil Dandekar
Class [Section]:    CIS 35A [36Y]
Assignment Number:  2
Due Date:           02.12.2023
Date Submitted:     02.09.2023
__________________________________

Hello.

** All code is formatted so that it is easy to read with comments documenting the functionality.

PART1:

    GENOME_INPUT:
    * 'GenomeInput.java' is the Driver and contains main. Sample output is provided at the bottom.
    * Instructions: Run this file just like any other java file and answer the questions printed to console with 
    keyboard input

        DESIGN:
        * Variables
            * (GenomeInput)
                * d1 - GenomeInput object used to call readValue() and to create new HumanGenome objects.
            * (HumanGenome)
                * Bob, Sally, Sri - HumanGenome objects to demonstrate functionality.

        * Input
            * Use a scanner to read input for HumanGenome object info (name, number of genes, number of 
            chromosomes, number of cells) for each HumanGenome

        * Processing 
            * public static void main(String[] args):
                Creates d1 GenomeInput object and creates/prints 3 HumanGenome objects.

            * public HumanGenome readValue(Scanner s1):
                Takes one Scanner object, s1, argument. Uses the Scanner object to prompt user for input to 
                create and return a HumanGenome object. Information collected include the name, number of genes, 
                number of chromosomes, and number of cells using the Scanner class methods.

        * Output
            * Each HumanGenome object is printed as a string, displaying their respective properties.

    HUMAN_GENOME:
    * 'HumanGenome.java' contains the HumanGenome object blueprint (class). 
    * Instructions: N/A.
        
        DESIGN:
        * Variables
            * (int)
                * numGenes - private instance variable to represent the number of genes.
                * numChromosomes - private instance variable to represent the number of chromosomes.
                * numCells - private instance variable to represent the number of cells.
            * (String)
                * name - private instance variable to represent the name of the HumanGenome object.

        * Input
            * N/A

        * Processing 
            * GETTER METHODS: 
                - public String getName()
                - public String getNumGenes()
                - public int getNumChromosomes()
                - public int getNumCells()
                Getter methods take no input but must be called using an instance of the class. They return the 
                respective instance variable. For example, getName() returns the name of the HumanGenome object.

            * SETTER METHODS: 
                - public void setName(String _name)
                - public void setNumGenes(String _numGenes)
                - public void setNumChromosomes(int _numChromosomes)
                - public void setNumCells(int _numCells)
                Setter methods must be called using an instance of the class. They take an input corresponding to
                the instance variable they will change. For example, setName() takes a String input and sets it as 
                its name.

            * INSTANCE METHODS:
                - public void print()
                Prints the object as a String. 
                Format: 
                    Name: [NAME]
                    Number of Genes: [NUM_GENES]
                    Number of Chromosomes: [NUM_CHROMOSOMES]
                    Number of Cells: [NUM_CELLS]

        * Output
            * N/A

PART 2:

    GENO_NUCLEIC_ACID:
    * 'GenoNucleicAcid.java' is the Driver and contains main. Sample output is provided at the bottom.
    * Instructions: Run this file just like any other java file and answer the questions printed to console with 
    keyboard input

        DESIGN:
        * Variables
            * (GenoNucleicAcid)
                * d1 - GenoNucleicAcid object used to call readValue() and to create new NucleicAcid objects.
            * (NucleicAcid)
                * Cytosine, Adenine, Guanine, Thymine, Uracil - NucleicAcid objects to demonstrate functionality.

        * Input
            * Use a scanner to read input for NucleicAcid object info (name, formula, molar mass, density) for 
            each NucleicAcid.

        * Processing 
            * public static void main(String[] args):
                Creates d1 GenoNucleicAcid object and creates/prints 3 NucleicAcid objects.

            * public NucleicAcid readValue(Scanner s1):
                Takes one Scanner object, s1, argument. Uses the Scanner object to prompt user for input to 
                create and return a NucleicAcid object. Information collected include the name, formula, molar 
                mass, and density using the Scanner class methods.

        * Output
            * Each NucleicAcid object is printed as a string, displaying their respective properties.

    NUCLEIC_ACID:
    * 'NucleicAcid.java' contains the NucleicAcid object blueprint (class). 
    * Instructions: N/A.
        
        DESIGN:
        * Variables
            * (int)
                * molarMass - private instance variable to represent the molar mass.
                * density - private instance variable to represent the density.
            * (String)
                * formula - private instance variable to represent the formula.
                * name - private instance variable to represent the name of the NucleicAcid object.

        * Input
            * N/A

        * Processing 
            * GETTER METHODS: 
                - public String getName()
                - public String getFormula()
                - public int    getMolarMass()
                - public int    getDensity()
                Getter methods take no input but must be called using an instance of the class. They return the 
                respective instance variable. For example, getName() returns the name of the NucleicAcid object.

            * SETTER METHODS: 
                - public void setName(String _name)
                - public void setFormula(String _numGenes)
                - public void setMolarMass(int _numChromosomes)
                - public void setDensity(int _numCells)
                Setter methods must be called using an instance of the class. They take an input corresponding to
                the instance variable they will change. For example, setName() takes a String input and sets it as 
                its name.

            * INSTANCE METHODS:
                - public void print()
                Prints the object as a String. 
                Format: 
                    Name: [NAME]
                    Formula: [FORMULA]
                    Molar Mass: [MOLAR_MASS]
                    Density: [DENSITY]

        * Output
            * N/A

Thank you for using my program.
-Neil Dandekar, 02.09.2023