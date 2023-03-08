package driver;
import util.*;
import model.*;

public class Driver {
    public static void main(String [] args) {
        // Create Student array
        Student students[] = new Student[40];
        
        // Populate the student array
        FileIO file = new FileIO("CIS 35a - Lab <5>/input5.txt");
        students = file.readFile(students);
        
        
        // Print data
        System.out.printf("Stud\tQ1\tQ2\tQ3\tQ4\tQ5\n");
        for(int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                students[i].print();
                System.out.println();
            }
        }
        
        // Create object and calculate statistics
        Statistics statStudents = new Statistics();
        statStudents.findlow(students);
        statStudents.findhigh(students);
        statStudents.findavg(students);
        
        // Print the data
        statStudents.print(4);
    }   
}

/* TEST RUN 1 (HEADER + EMPTY FILE):

    STUD    Q1      Q2      Q3      Q4      Q5

    Low Scores:     0       0       0       0       0 
    High Scores:    0       0       0       0       0 
    Average Scores: 0.00    0.00    0.00    0.00    0.00 

END TEST RUN 1*/

/* TEST RUN 2 (HEADER + 1 RECORD):

    STUD    Q1      Q2      Q3      Q4      Q5
    1234    52      7       100     78      34 

    Low Scores:     52      7       100     78      34 
    High Scores:    52      7       100     78      34 
    Average Scores: 52.00   7.00    100.00  78.00   34.00

END TEST RUN 2*/

/* TEST RUN 3 (HEADER + 15 RECORDS):

    STUD    Q1      Q2      Q3      Q4      Q5
    1234    52      7       100     78      34 
    2134    90      36      90      77      30 
    3124    100     45      20      90      70 
    4532    11      17      81      32      77 
    5678    20      12      45      78      34 
    6134    34      80      55      78      45 
    7874    60      100     56      78      78 
    8026    70      10      66      78      56 
    9893    34      9       77      78      20 
    1947    45      40      88      78      55 
    2877    55      50      99      78      80 
    3189    22      70      100     78      77 
    4602    89      50      91      78      60 
    5405    11      11      0       78      10 
    6999    0       98      89      78      20 

    Low Scores:     0       7       0       32      10 
    High Scores:    100     100     100     90      80 
    Average Scores: 46.20   42.33   70.47   75.67   49.73

END TEST RUN 3*/

/* TEST RUN 4 (HEADER + 40 RECORDS): 

    STUD    Q1      Q2      Q3      Q4      Q5
    1234    52      7       100     78      34 
    2134    90      36      90      77      30 
    3124    100     45      20      90      70 
    4532    11      17      81      32      77 
    5678    20      12      45      78      34 
    6134    34      80      55      78      45 
    7874    60      100     56      78      78 
    8026    70      10      66      78      56 
    9893    34      9       77      78      20 
    1947    45      40      88      78      55 
    2877    55      50      99      78      80 
    3189    22      70      100     78      77 
    4602    89      50      91      78      60 
    5405    11      11      0       78      10 
    6999    0       98      89      78      20 
    1234    52      7       100     78      34 
    2134    90      36      90      77      30 
    3124    100     45      20      90      70 
    4532    11      17      81      32      77 
    5678    20      12      45      78      34 
    6134    34      80      55      78      45 
    7874    60      100     56      78      78 
    8026    70      10      66      78      56 
    9893    34      9       77      78      20 
    1947    45      40      88      78      55 
    2877    55      50      99      78      80 
    3189    22      70      100     78      77 
    4602    89      50      91      78      60 
    5405    11      11      0       78      10 
    6999    0       98      89      78      20 
    1234    52      7       100     78      34 
    2134    90      36      90      77      30 
    3124    100     45      20      90      70 
    4532    11      17      81      32      77 
    5678    20      12      45      78      34 
    6134    34      80      55      78      45 
    7874    60      100     56      78      78 
    8026    70      10      66      78      56 
    9893    34      9       77      78      20 

    Low Scores:     0       7       0       32      10 
    High Scores:    100     100     100     90      80 
    Average Scores: 47.62   40.67   69.33   75.31   49.64

END TEST RUN 4*/

/* TEST RUN 5 (HEADER + 42 RECORDS): 

    Stud    Q1      Q2      Q3      Q4      Q5
    1234    52      7       100     78      34 
    2134    90      36      90      77      30 
    3124    100     45      20      90      70 
    4532    11      17      81      32      77 
    5678    20      12      45      78      34 
    6134    34      80      55      78      45 
    7874    60      100     56      78      78 
    8026    70      10      66      78      56 
    9893    34      9       77      78      20 
    1947    45      40      88      78      55 
    2877    55      50      99      78      80 
    3189    22      70      100     78      77 
    4602    89      50      91      78      60 
    5405    11      11      0       78      10 
    6999    0       98      89      78      20 
    1234    52      7       100     78      34 
    2134    90      36      90      77      30 
    3124    100     45      20      90      70 
    4532    11      17      81      32      77 
    5678    20      12      45      78      34 
    6134    34      80      55      78      45 
    7874    60      100     56      78      78 
    8026    70      10      66      78      56 
    9893    34      9       77      78      20 
    1947    45      40      88      78      55 
    2877    55      50      99      78      80 
    3189    22      70      100     78      77 
    4602    89      50      91      78      60 
    5405    11      11      0       78      10 
    6999    0       98      89      78      20 
    1234    52      7       100     78      34 
    2134    90      36      90      77      30 
    3124    100     45      20      90      70 
    4532    11      17      81      32      77 
    5678    20      12      45      78      34 
    6134    34      80      55      78      45 
    7874    60      100     56      78      78 
    8026    70      10      66      78      56 
    9893    34      9       77      78      20 

    Low Scores:     0       7       0       32      10 
    High Scores:    100     100     100     90      80 
    Average Scores: 47.62   40.67   69.33   75.31   49.64

END TEST RUN 5*/