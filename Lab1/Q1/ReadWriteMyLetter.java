package Lab1.Q1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class ReadWriteMyLetter {
public static void main(String[] args) {
System.out.println("Reading File from Java code");

String fileName="Navid_S1234567.txt"; 
try{
    FileReader inputFile = new FileReader(fileName);
    BufferedReader bufferReader = new BufferedReader(inputFile);

    String line;
    System.out.println("Before user input. Content in text file only.");

    while ((line = bufferReader.readLine()) != null) {
        System.out.println(line);
    }
    
    bufferReader.close();
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nEnter your second part of the letter :");
    String strInput = scanner.nextLine();

    FileWriter outputFile = new FileWriter(fileName, true);
    BufferedWriter output = new BufferedWriter(outputFile);
    output.write("\n" + strInput);
    output.close();

    System.out.println("\n\nAfter user input. String and content in textfile.");
    FileReader inputFileAfterAppend = new FileReader(fileName);
    BufferedReader bufferReaderAfterAppend = new BufferedReader(inputFileAfterAppend);

    String line2;

    while ((line2 = bufferReaderAfterAppend.readLine()) != null) {
        System.out.println(line2);
    }

    bufferReaderAfterAppend.close();

} catch(Exception e){
    System.out.println("Error while reading file line by line:" +
    e.getMessage());
    }
 } 
}