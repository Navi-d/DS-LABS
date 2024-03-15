package dsl2;

import java.util.Arrays;

/* @author Amaan Geelani Syed S2191704 */

public class MinMaxTwoDArray {
    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0];
        
        //using normal for loop
        for (int i = 0; i < list.length; i++) {
            System.out.println("Using for loop"+Arrays.toString(list[i]));
            for (int j = 0; j < list[0].length; j++) {
                if(list[i][j].compareTo(min) < 0)
                    min = list[i][j];
            }
        }
        
        // Using for-each loop
//        for (E[] row : list) {
//            for(E e: row){
//                if(e.compareTo(min) < 0)
//                    min = e;
//            }
//        }
        
        return min;
    }
    
    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        
        //using normal for loop
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list[0].length; j++) {
//                if(list[i][j].compareTo(max) > 0)
//                    max = list[i][j];
//            }
//        }
        
        // Using for-each loop
        for (E[] sublist : list) {
            System.out.println("Using for each"+Arrays.toString(sublist));
            for(E e: sublist){
                if(e.compareTo(max) > 0)
                    max = e;
            }
        }
        
        return max;
    }
    
    
    public static void main(String[] args) {
        Integer[][] array = {{4, 5, 6},
                             {1, 2, 3}};
        System.out.println("Min :"+min(array));
        System.out.println("Max :"+max(array));
    }
}
