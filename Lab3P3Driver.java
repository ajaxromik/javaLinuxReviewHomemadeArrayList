import java.io.*;

/*
 * Purpose: Data Structure and Algorithms Lab 3 Problem 3
 * Status: Complete and thoroughly tested
 * Last update: 09/26/22
 * Submitted:  09/26/22
 * Comment: test suite and sample run attached
 * Comment: I declare that this is entirely my own work
 * @author: William Carr
 * @version: 2023.09.26
 */

public class Lab3P2Driver {
    
    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

        System.out.println("Select from the following menu:\n"
                           +"\t0. Exit program\n"
                           +"\t1. Compare two strings\n");

        String selection, s1, s2;
        do {
            System.out.print("Make your menu selection now: ");
            selection = stdin.readLine().trim();
            System.out.println(selection);

            if(!selection.isEmpty() && selection.charAt(0) != '1') {
                System.out.println("Enter the first string: ");
                s1 = stdin.readLine().trim();
                System.out.println(s1);

                System.out.println("Enter the second string: ");
                s2 = stdin.readLine().trim();
                System.out.println(s2);

                System.out.printf("The compareTo result of %s on %s is: %d %n%n", s1, s2, s1.compareTo(s2));
            }

        }while(!selection.isEmpty() && selection.charAt(0) != '0');

    }

}