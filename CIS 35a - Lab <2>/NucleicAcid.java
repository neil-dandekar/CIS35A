// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  2
// Due Date:           02.12.2023
// Date Submitted:     02.09.2023
// __________________________________

public class NucleicAcid {
    // PROPERTIES
    private String name;
    private String formula;
    private float  molarMass;
    private float  density;

    // CONSTRUCTORS
    public NucleicAcid() {
        this.name = "";
        this.formula = "";
        this.molarMass = 0.0f;
        this.density = 0.0f;
    }

    public NucleicAcid(String _name, String _formula,
        float _molarMass, float _density) {
            this.name = _name;
            this.formula = _formula;
            this.molarMass = _molarMass;
            this.density = _density;
    }

    // METHODS
        // GETTERS
    public String getName() {
        return this.name;
    }
    public String getFormula() {
        return this.formula;
    }
    public float getMolarMass() {
        return this.molarMass;
    }
    public float getDensity() {
        return this.density;
    }
        // SETTERS
    public void setName(String _name) {
        this.name = _name;
    }
    public void setFormula(String _formula) {
        this.formula = _formula;
    }
    public void setMolarMass(int _molarMass) {
        this.molarMass = _molarMass;
    }
    public void setDensity(int _density) {
        this.density = _density;
    }
    public void print() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Formula: %s\n", this.formula);
        System.out.printf("Molar Mass: %f g/mol\n", this.molarMass);
        System.out.printf("Density: %f g/cm^3", this.density);
    }
}