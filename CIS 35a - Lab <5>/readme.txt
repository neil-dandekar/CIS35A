Name:               Neil Dandekar
Class [Section]:    CIS 35A [36Y]
Assignment Number:  5
Due Date:           03.07.2023
Date Submitted:     03.07.2023
__________________________________

Hello.

** All code is formatted so that it is easy to read with comments documenting the functionality.

DRIVER:
* 'Driver.java' is the Driver and contains main. Sample output is provided at the bottom.
* Instructions: Run this file just like any other java file and answer the questions printed to console with 
keyboard input.
    
    DESIGN:
    * Variables
        * (Student[])
            * students - Array of Student objects to demonstrate functionality.
        * (FileIO)
            * file - Object to hold input file.
        * (Statistics)
            * statStudents - Statistics object to calculate statistics on students array.

    * Input
        * N/A

    * Processing 
        * This file declares a Student array and sends it to the FileIO class to initialize it from file input
          then calculates statistics on it with a Statistics object then prints all the results to console.

    * Output
        * The Student array and statistics are printed to console.

SHIP:
* 'Student.java' contains the Student object blueprint (class). 
* Instructions: N/A.
    
    DESIGN:

    * Variables
        * (int)
            * SID - Student ID.
        * (int[])
            * scores - array of student scores.

    * Input
        * N/A

    * Processing 
        * GETTER METHODS: 
            - public int   getSID()
            - public int   getScore(int index)
            - public int[] getScores()
            Getter methods take no input but must be called using an instance of the class. They return the 
            respective instance variable.

        * SETTER METHODS: 
            - public void setSID(int sID)
            - public void setScores(int[] scores)
            - public void setScore(int index, int score)
            Setter methods must be called using an instance of the class. They take an input corresponding to
            the instance variable they will change.

        * INSTANCE METHODS:
            - public void printSID()
            - public void printScore(int index)
            - public void printScores()
            - public void print()
                Low Scores:     [SCORE] [SCORE] [SCORE] [SCORE] [SCORE]
                High Scores:    [SCORE] [SCORE] [SCORE] [SCORE] [SCORE] 
                Average Scores: [SCORE] [SCORE] [SCORE] [SCORE] [SCORE]

    * Output
        * N/A

STATISTICS:
* 'Statistics.java' contains the Statistics object blueprint (class). 
* Instructions: N/A.

    DESIGN:
    * Variables
        * (float[])
            * avgScores - private instance array to represent the average score of each quiz.
        * (int[])
            * lowScores, highScores - private instance arrays to represent the low and high scores, respectively.

    * Input
        * N/A

    * Processing 
        * INSTANCE METHODS: 
            - public void findavg(Student[] students)
            - public void findlow(Student[] students)
            - public void findhigh(Student[] students)
            These methods iterate through and calculate the respective statistics. The low and high starts with setting
            the first element as the min or max then compare each element after that. The average starts with the total
            as the first element then adds each element after that. If any element is null, it is ignored.
            - public void print(int option)
            Takes four options and prints the following: 1: Low Scores, 2: High Scores, 3: Average Scores, 4: All.

    * Output
        * N/A

FILE_IO:
* 'FileIO.java' contains the FileIO object blueprint (class). 
* Instructions: N/A.

    DESIGN:
    * Variables
        * (String)
            * fname - private instance variable to represent the input filename.
        * (FileReader)
            * file - represents the input file.
        * (BufferedReader)
            * buff - used to parse through input file
        * (StringTokenizer)
            * st - used to tokenize String.
        * (int)
            * counter - used to count how many lines have been read from input file.
            * SID - used to represent Student ID to create Student object.
            * scores - used to represent Student Scores to create Student object.
        * (StringTokenizer)
            * st - used to tokenize String.

    * Input
        * N/A

    * Processing 
        * INSTANCE METHODS: 
            - public Student[] readFile(Student[] students)
            Takes in Student[] array and populates it using member file object variable. Uses instances of FileReader,
            BufferedReader, and StringTokenizer to parse through Strings and populate arrays. Also, uses Integer wrapper.
            First, it skips through the first line in the file. For the next lines, it sets the first token as the SID and
            the next tokens (until end of line) as entries into scores. Then, it creates a Student object from these
            variables, adds it to the Student array, and continues this process until end of file is reached. Student array
            is finally returned.

    * Output
        * N/A

Thank you for using my program.
-Neil Dandekar, 03.07.2023