Name:               Neil Dandekar
Class [Section]:    CIS 35A [36Y]
Assignment Number:  3-EC
Due Date:           02.26.2023
Date Submitted:     02.26.2023
__________________________________

Hello.

** All code is formatted so that it is easy to read with comments documenting the functionality.

DNA_DRIVER:
* 'DNADriver.java' is the Driver and contains main. Sample output is provided at the bottom.
* Instructions: Run this file just like any other java file and answer the questions printed to console with 
keyboard input

    DESIGN:
    * Variables
        * (DNA)
            * dna - DNA object to demonstrate functionality.
        * (Scanner)
            * s1 - Scanner object to take user input for DNA strand.
    * Input
        * Takes String input for DNA strand.

    * Processing 
        * This file takes user input for a DNA strand then uses it to initialize a new DNA object. Then,
        it calls print(), highestMolarMass(), and totalDensity() on the DNA object.
    
    * Output
        * Prints the output of each of the instance methods of the DNA object.

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

DNA:
* 'DNA.java' contains the DNA object blueprint (class). 
* Instructions: N/A.
    
    DESIGN:
    * Variables
        * (NucleicAcid[])
            * LtoRHelix - private instance variable to represent the Nucleic Acids of the left to right helix.
            * RtoLHelix - private instance variable to represent the Nucleic Acids of the right to left helix.

    * Input
        * N/A

    * Processing 
        * INSTANCE METHODS:
            - public void LtoRHelixPopulats(String strand)
            This method populates LtoRHelix. It loops through the input strand and uses a switch case block. If the
            character is an 'A', it creates and Adenine Nucleic Acid and etc. for each other letter. At the very end,
            it adds this NucleicAcid to the LtoRHelix array and continues until it has passed through the entire strand.

            - public void print()
            This method prints the data of the LtoRHelix and RtoLHelix. It loops through each array and prints each of
            the NucleicAcids in the arrays.
            Format:
                L_TO_R_HELIX:
                Index [INDEX]:
                Name: [NAME]
                Formula: [FORMULA]
                Molar Mass: [MOLAR_MASS]
                Density: [DENSITY]
                ...

                R_TO_L_HELIX:
                Index [INDEX]:
                Name: [NAME]
                Formula: [FORMULA]
                Molar Mass: [MOLAR_MASS]
                Density: [DENSITY]
                ...
            
            - public void highestMolarMass()
            This method prints the highest molar mass in each helix array as well as the indeces that they occur. First,
            it sets the highest molar mass of each array as the first element and loops through each array simultaneously.
            As it does so, it will compare each current Nucleic Acid's molar mass with the current max and update it if 
            needed. Once it's done, it'll loop once more through the arrays to find every occurence of the max molar mass
            and concatenaate all indeces into one string which is printed at the end along with the actual max.
            Format:
                Highest Molar Mass (LtoRHelix): [NAME] [[MOLAR_MASS] g/mol] [indeces: [INDEX_1], [INDEX_2], [INDEX_3], ...].
                Highest Molar Mass (RtoLHelix): [NAME] [[MOLAR_MASS] g/mol] [indeces: [INDEX_1], [INDEX_2], [INDEX_3], ...].
            
            - public void totalDensity()
            This method prints the total density of all Nucleic Acids in each helix array. First, it sets the running total
            of each array to 0. Then, it loops through each array simultaneously and adds the current Nucleic Acid's density
            to the corresponding running total. Finally, it prints the results.
            Format: 
                Total Density (LtoRHelix): [MOLAR_MASS] g/cm^3.
                Total Density (RtoLHelix): [MOLAR_MASS] g/cm^3.

    * Output
        * N/A

Thank you for using my program.
-Neil Dandekar, 02.26.2023