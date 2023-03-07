class Student {

    private int SID; // Student ID

    private int scores[] = new int[5]; // Student Scores


    // METHODS
        // GETTERS
    public int getSID() {
        return SID;
    }
    public int[] getScores() {
        return scores;
    }
    public int getScore(int index) {
        return scores[index];
    }
        // SETTERS
    public void setSID(int sID) {
        SID = sID;
    }
    public void setScores(int[] scores) {
        this.scores = scores;
    }
    public void setScore(int index, int score) {
        this.scores[index] = score;
    }
    
    //add methods to print values of instance variables.
    public void printSID() {
        System.out.printf("%d ", SID);
    }
    public void printScore(int index) {
        System.out.printf("%d ", scores[index]);
    }
    public void printScores() {
        for (int i = 0; i < scores.length; i++) {
            this.printScore(i);
        }
    }
    public void print() {
        printSID();
        printScores();
    }
}
