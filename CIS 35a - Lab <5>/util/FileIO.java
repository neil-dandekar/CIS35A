package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

import model.*;

public class FileIO {
    // PROPERTIES
    private String fname;

    // CONSTUCTORS
    public FileIO(String fname) {
        this.fname = fname;
    }

    // METHODS
        // INSTANCE
    public Student[] readFile(Student[] students) {
        try {
            FileReader file = new FileReader(this.fname);
            BufferedReader buff = new BufferedReader(file);
            int counter = 0;
            while(true) {
                String line = buff.readLine(); // Read line to String
                counter++; 		               // Implement counter of lines
                // Break loop if counter is more than 40 or reached end of file:
                if(line == null || counter > 40) break; 

                StringTokenizer st = new StringTokenizer(line); // Convert line to String
                int SID = 0;
                int[] scores = new int[5];
                int i = 0;
                while(st.hasMoreTokens() && counter != 1) {
                    String s1 = st.nextToken();
                    if(i == 0) {
                        SID = Integer.parseInt(s1);
                    }
                    else {
                        scores[i-1] = Integer.parseInt(s1);;
                    }
                    i++;
                }
                if(counter != 1) {
                    students[counter-2] = new Student(SID, scores);
                }
            }
            buff.close();
        } catch(Exception e) {
            System.out.println("Error -- " + e.toString());
        }
        return students;
    }
}