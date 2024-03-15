package Q2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
public class ReadText1File {
    
    public static void main(String[] args) {
        String fileName="Lab1/Q2/text1.txt";
        System.out.println("Reading File from text file : text1.txt \n");
        try{

            FileReader inputFile = new FileReader(fileName);

            BufferedReader bufferReader = new BufferedReader(inputFile);

            String line;
            
            int counter=0;
            
             while ((line = bufferReader.readLine()) != null) {
                System.out.println("Line " + (counter+1) + " is : " + line);
                
                System.out.println("Split by comma using StringTokenizer:");
                StringTokenizer st2 = new StringTokenizer(line, ",");
                int numOfChar = 0;

                while(st2.hasMoreElements()) {
                    System.out.println(st2.nextElement());
                    numOfChar++;
                }
                 System.out.println("Number of characters: "+ numOfChar+"\n");

                //Approach 2
                System.out.println("Split by comma using split method:");
                String[] tokens = line.split(",");
                int tokenCount = tokens.length;
                for (int j = 0; j < tokenCount; j++) {
                    System.out.println(tokens[j]);
                }
                System.out.println("Number of characters : " + tokenCount+"\n");
                counter++;
            }
            bufferReader.close();
        }catch(Exception e){
            System.out.println("Error while reading file line by line:" +
            e.getMessage());
        }
    }
}
