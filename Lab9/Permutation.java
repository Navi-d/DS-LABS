package Lab9;

public class Permutation {

    public static void main(String[] args) {
        permuteString("", "ABC");
    }

    public static void permuteString(String beginningString, String endingString) {
        // See the process
       // System.out.println(beginningString + ", " + endingString);

        // Base case
        if (endingString.length() <= 1) {
            System.out.println("word: " + beginningString + endingString);
        }
        // Recursive case
        else {
            for (int i = 0; i < endingString.length(); i++) {
                String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                permuteString(beginningString + endingString.charAt(i), newString);
            } 
        }// "" "ABC" -> "A" "BC" -> "AB" "C" -> ABC
        //                       -> "AC" "B" -> ACB
        //           -> "B" "AC" -> "BA" "C" -> BAC
        //                       -> "BC" "A" -> BCA
    }
}
