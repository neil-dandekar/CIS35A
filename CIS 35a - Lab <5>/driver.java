//Putting it together in driver class:

public class driver {
    public static void main(String [] args) {

        Student lab2 [] = new Student[40];
        
        //Populate the student array
        
        lab2 = Util.readFile("filename.txt", lab2);
        
        Statistics statlab2 = new Statistics();
        
        statlab2.findlow(lab2);
        
        //add calls to findhigh and find average
        
        //Print the data and statistics
        
    }
    
}
