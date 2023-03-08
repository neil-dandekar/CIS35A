// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  5
// Due Date:           03.07.2023
// Date Submitted:     03.07.2023
// __________________________________

package model;

public class Student {
    // PROPERTIES
    private int SID; // Student ID
    private int scores[] = new int[5]; // Student Scores

    // CONSTRUCTORS
    public Student(int SID, int[] scores) {
        this.SID = SID;
        this.scores = scores;
    }
    
    // METHODS
        // GETTERS
    public int getSID() { // Returns Student ID
        return SID;
    }
    public int getScore(int index) { // Returns individual score at given index [0-4]
        return scores[index];
    }
    public int[] getScores() { // Returns Student Score array
        return scores;
    }
        // SETTERS
    public void setSID(int sID) { // Sets Student ID
        SID = sID;
    }
    public void setScores(int[] scores) { // Sets Student Score array
        this.scores = scores;
    }
    public void setScore(int index, int score) { // Sets individual Student Score at given index [0-4]
        this.scores[index] = score;
    }
        // INSTANCE
    public void printSID() {
        System.out.printf("%d \t", SID); // Prints Student ID
    }
    public void printScore(int index) { // Prints individual Student Score at given index [0-4]
        System.out.printf("%d \t", scores[index]); 
    }
    public void printScores() { // Prints all Student Scores
        for (int i = 0; i < scores.length; i++) {
            this.printScore(i);
        }
    }
    public void print() { // Prints both Student ID and all Student Scores
        printSID();
        printScores();
    }

    // public static void main(String[] args) {
    //     int scores[] = {1, 2, 3, 4, 5};
    //     Student s1 = new Student(1234, scores);
    //     s1.print();
    // }
}