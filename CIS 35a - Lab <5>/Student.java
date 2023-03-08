class Student {
    // PROPERTIES
    private int SID; // Student ID
    private int scores[] = new int[5]; // Student Scores

    // CONSTRUCTORS
    public Student(int sID, int[] scores) {
        SID = sID;
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
        System.out.printf("%d ", SID); // Prints Student ID
    }
    public void printScore(int index) { // Prints individual Student Score at given index [0-4]
        System.out.printf("%d ", scores[index]); 
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
}