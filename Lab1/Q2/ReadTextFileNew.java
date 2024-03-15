package Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ReadTextFileNew {
    public static void main(String[] args) {
        String[] fileNameArray = {"Lab1/Q2/text1.txt", "Lab1/Q2/text2.txt", "Lab1/Q2/text3.txt",
        "Lab1/Q2/text4.txt"};
       
        String[] delimiterArray = {",", ", ", "; ", "\\d+"};
        for (int i = 0; i < fileNameArray.length; i++){
            System.out.println("Reading File from text file : " + fileNameArray[i] + "\n");
            try{

                FileReader inputFile = new FileReader(fileNameArray[i]);

                BufferedReader bufferReader = new BufferedReader(inputFile);

                String line;
                int counter=0;
                
                while ((line = bufferReader.readLine()) != null) {
                System.out.println("Line " + (counter+1) + " is : " + line);
    
                if (i!=3) {
                    tokenizerApproach(line, delimiterArray[i]);
                }
    
                splitApproach(line, delimiterArray[i]);
                counter++;
            }
            bufferReader.close();
            } catch(Exception e){
                System.out.println("Error while reading file line by line:" +
                e.getMessage());
            }   
        }
      }
        public static void tokenizerApproach(String s, String delimiter){
            //Approach 1
            System.out.println("Split using StringTokenizer:");
            StringTokenizer st2 = new StringTokenizer(s, delimiter);
            int numOfChar = 0;
    
            while(st2.hasMoreElements()) {
                System.out.println(st2.nextElement());
                numOfChar++;
            }
            System.out.println("Number of characters: "+ numOfChar+"\n");
        }
            
        public static void splitApproach(String s, String delimiter){
            //Approach 2
            System.out.println("Split using split method:");
            String[] tokens = s.split(delimiter);
            int tokenCount = tokens.length;
    
            for (int j = 0; j < tokenCount; j++) {
                System.out.println(tokens[j]);
            }
            System.out.println("Number of characters : " + tokenCount+"\n");
            }
}
