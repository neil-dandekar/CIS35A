class Statistics {
    // PROPERTIES
    private float[] avgScores  = new float[5];
    private int[]   lowScores  = new int[5];
    private int[]   highScores = new int[5];

    // CONSTRUCTORS
    public Statistics(float[] avgScores, int[] lowScores, int[] highScores) {
        this.avgScores  = avgScores;
        this.lowScores  = lowScores;
        this.highScores = highScores;
    }

    // METHODS
        // INSTANCE
    public void findlow(Student[] students) {
        for(int i = 0; i < lowScores.length; i++) {
            int min = students[0].getScore(i);
            for(int j = 1; j < students.length; j++) {
                if(students[j].getScore(i) < min) {
                    min = students[j].getScore(i);
                }
            }
            lowScores[i] = min;
        }
    }
    public void findhigh(Student[] students) {
        for(int i = 0; i < highScores.length; i++) {
            int max = students[0].getScore(i);
            for(int j = 1; j < students.length; j++) {
                if(students[j].getScore(i) > max) {
                    max = students[j].getScore(i);
                }
            }
            highScores[i] = max;
        }
    }
    public void findavg(Student[] students) {
        for(int i = 0; i < avgScores.length; i++) {
            int total = students[0].getScore(i);
            for(int j = 1; j < students.length; j++) {
                    total += students[j].getScore(i);
            }
            avgScores[i] = total/5f;
        }
    }
    public void print(int option) {
        switch(option) {
            case 1: {
                System.out.printf("Low Scores:\t");
                for (int i = 0; i < lowScores.length; i++) {
                    System.out.printf("%d ", lowScores[i]);
                }
                break;
            }

            case 2: {
                System.out.printf("High Scores: \t");
                for (int i = 0; i < highScores.length; i++) {
                    System.out.printf("%d ", highScores[i]);
                }
                break;
            }

            case 3: {
                System.out.printf("Average Scores: ");
                for (int i = 0; i < avgScores.length; i++) {
                    System.out.printf("%d ", avgScores[i]);
                }
                break;
            }
            
            case 4: {
                for (int i = 0; i < 4; i++) {
                    this.print(i);
                    if(i != 3) System.out.printf("\n");
                }
            }

            default:
                break;
        }
    }
}