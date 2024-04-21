package Lab2.q4;

/* @author Amaan Geelani Syed S2191704 */

public class Q4 {
    
//    public static <E> String minmax(E array[]){
//    public static <E extends Comparable> String minmax(E array[]){
    public static <E extends Comparable<E>> String minmax(E array[]){
        E min = array[0];
        E max = array[0];
        for(E e : array){
            if(e.compareTo(min)<0){
                min = e;
            }
            if(e.compareTo(max)>0){
                max = e;
            }
        }
        return "Min = "+min+" Max = "+max;
    }
    
    public static void main(String[] args) {
        Integer[] integerArray = {2,5,1,7,4,9,0};
        String[] stringArray = {"Alice", "Charlie", "Bob", "Evan", "Diana"};
        
        System.out.println(minmax(integerArray));
        System.out.println(minmax(stringArray));
    }
}
