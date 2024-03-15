package Q1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadMyLetter {
public static void main(String[] args) {
    System.out.println("Reading File from Java code");


    String fileName="Lab1/Q1/Navid_S1234567.txt";
     
    try{

        FileReader inputFile = new FileReader(fileName);

        BufferedReader bufferReader = new BufferedReader(inputFile);

        String line;

        while ((line = bufferReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferReader.close();

    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
        System.out.println("Error while reading/writing file: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Error occurred: " + e.getMessage());
    }
    }
}