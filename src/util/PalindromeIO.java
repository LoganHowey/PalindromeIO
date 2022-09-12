package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PalindromeIO {
    public static void main(String[] args) throws IOException {
        FileWriter outputStream = null;
        FileWriter outputStreams = null;

        String line1;
        String line2;
        try {
            outputStream = new FileWriter("src/util/testing_new.txt");
            outputStreams = new FileWriter("src/util/testing_new1.txt");


            Scanner paliGet = new Scanner(System.in);
            System.out.println("Enter A palindrome below.");

            String paliToWrite = paliGet.nextLine();
            paliToWrite = paliToWrite.replaceAll(" ","");
            outputStream.write(paliToWrite);

            char paliChars;
            String paliReverse = "";

            for (int i = 0; i < paliToWrite.length(); i++) {
                paliChars = paliToWrite.charAt(i);
                paliReverse = paliChars + paliReverse;
            }
            System.out.println(paliReverse);
            outputStreams.write(paliReverse);




        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            if (outputStreams != null) {
                outputStreams.close();
            }
        }
        BufferedReader reader1 = new BufferedReader(new FileReader("src/util/testing_new.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("src/util/testing_new1.txt"));

        line1 = reader1.readLine();
        line2 = reader2.readLine();
        if (line1.equalsIgnoreCase(line2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
