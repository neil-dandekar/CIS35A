// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  3-EC
// Due Date:           02.26.2023
// Date Submitted:     02.26.2023
// __________________________________

public class DNA {
    // PROPERTIES
    NucleicAcid[] LtoRHelix;
    NucleicAcid[] RtoLHelix;

    // CONSTRUCTORS
    // Default Constructor
	public DNA() {
        this.LtoRHelix = null;
        this.RtoLHelix = null;
    }
    // Overloaded constructor 
    public DNA(String strand){
        LtoRHelixpopulate(strand);
    }

    // METHODS
        // INSTANCE
    public void LtoRHelixpopulate(String strand) {
        LtoRHelix = new NucleicAcid[strand.length()];
        RtoLHelix = new NucleicAcid[strand.length()];

        for(int i = 0; i < strand.length(); i++) {
            NucleicAcid LRAcid = new NucleicAcid();
            NucleicAcid RLAcid = new NucleicAcid();
            switch (strand.charAt(i)) {
                case 'A':
                    LRAcid = new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.6f);
                    RLAcid = new NucleicAcid("Thymine", "C5H6N2O2", 126.115f, 1.223f);
                    break;

                case 'T':
                    LRAcid = new NucleicAcid("Thymine", "C5H6N2O2", 126.115f, 1.223f);
                    RLAcid = new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.6f);
                    break;

                case 'G':
                    LRAcid = new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 2.200f);
                    RLAcid = new NucleicAcid("Cytosine", "C4H5N3O", 111.10f, 1.55f);
                    break;

                case 'C':
                    LRAcid = new NucleicAcid("Cytosine", "C4H5N3O", 111.10f, 1.55f);
                    RLAcid = new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 2.200f);
                    break;
            
                default:
                    break;
            }

            LtoRHelix[i] = LRAcid;
            RtoLHelix[i] = RLAcid;
        }
    }
    public void print() {
        System.out.printf("L_TO_R_HELIX:\n");
        for(int i = 0; i < LtoRHelix.length; i++) {
            System.out.printf("Index %d:\n", i);
            LtoRHelix[i].print();
            if(i != LtoRHelix.length-1) System.out.printf("\n");
            System.out.printf("\n");
        }
        System.out.printf("\nR_TO_L_HELIX:\n");
        for(int i = 0; i < LtoRHelix.length; i++) {
            System.out.printf("Index %d:\n", i);
            RtoLHelix[i].print();
            if(i != LtoRHelix.length-1) System.out.printf("\n");
            System.out.printf("\n");
        }
    }
    public void highestMolarMass() {
        float LRmax = LtoRHelix[0].getMolarMass();
        String LRmaxIndeces = "";
        String LRmaxName = "";

        float RLmax = RtoLHelix[0].getMolarMass();
        String RLmaxIndeces = "";
        String RLmaxName = "";

        for(int i = 0; i < LtoRHelix.length; i++) {

            if(LtoRHelix[i].getMolarMass() > LRmax) {
                LRmax = LtoRHelix[i].getMolarMass();
                LRmaxName = LtoRHelix[i].getName();
            }

            if(RtoLHelix[i].getMolarMass() > RLmax) {
                RLmax = RtoLHelix[i].getMolarMass();
                RLmaxName = RtoLHelix[i].getName();
            }

        }

        for(int i = 0; i < LtoRHelix.length; i++) {
            if(LtoRHelix[i].getMolarMass() == LRmax) {
                if(LRmaxIndeces.length() == 0) LRmaxIndeces += i;
                else LRmaxIndeces += ", " + i;
            }
            if(RtoLHelix[i].getMolarMass() == RLmax) {
                if(RLmaxIndeces.length() == 0) RLmaxIndeces += i;
                else RLmaxIndeces += ", " + i;
            }
        }

        System.out.printf("Highest Molar Mass (LtoRHelix): %s [%f g/mol] [indeces: %s].\n", LRmaxName, LRmax, LRmaxIndeces);
        System.out.printf("Highest Molar Mass (RtoLHelix): %s [%f g/mol] [indeces: %s].\n", RLmaxName, RLmax, RLmaxIndeces);
    }
    public void totalDensity() {
        float LRtotalD = 0;
        float RLtotalD = 0;
        for(int i = 0; i < LtoRHelix.length; i++) {
            LRtotalD += LtoRHelix[i].getDensity();
            RLtotalD += RtoLHelix[i].getDensity();
        }
        System.out.printf("Total Density (LtoRHelix): %f g/cm^3.\n", LRtotalD);
        System.out.printf("Total Density (RtoLHelix): %f g/cm^3.\n", RLtotalD);
    }
}