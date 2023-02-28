// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  3-EC
// Due Date:           02.26.2023
// Date Submitted:     02.26.2023
// __________________________________

public class HumanGenome {
    // PROPERTIES
    private String name;
    private int    numGenes;
    private int    numChromosomes;
    private int    numCells;

    // CONSTRUCTORS
    public HumanGenome() {
        this.name = "";
        this.numGenes = 0;
        this.numChromosomes = 0;
        this.numCells = 0;
    }
    public HumanGenome(String _name, int _numGenes, 
        int _numChromosomes, int _numCells) {
        this.name = _name;
        this.numGenes = _numGenes;
        this.numChromosomes = _numChromosomes;
        this.numCells = _numCells;
    }

    // METHODS
        // GETTERS
    public String getName() {
        return this.name;
    }
    public int getNumGenes() {
        return this.numGenes;
    }
    public int getNumChromosomes() {
        return this.numChromosomes;
    }
    public int getNumCells() {
        return this.numCells;
    }
        // SETTERS
    public void setName(String _name) {
        this.name = _name;
    }
    public void setNumGenes(int _numGenes) {
        this.numGenes = _numGenes;
    }
    public void setNumChromosomes(int _numChromosomes) {
        this.numChromosomes = _numChromosomes;
    }
    public void setNumCells(int _numCells) {
        this.numCells = _numCells;
    }
        // INSTANCE
    public void print() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Number of Genes: %d\n", this.numGenes);
        System.out.printf("Number of Chromosomes: %d\n", this.numChromosomes);
        System.out.printf("Number of Cells: %d", this.numCells);
    }
}