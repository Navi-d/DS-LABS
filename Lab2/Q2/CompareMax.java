package Lab2.Q2;

public class CompareMax {

    public static <E> E randomMethod(E value){
        return value;
    }
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z)
	{                      
		T max = x;      
		if ( y.compareTo( max) > 0 ){
			max = y; 
		}
		if ( z.compareTo( max ) > 0 ){
			max = z;                
		}
		return max; 
	}


	public static void main(String[] args) {

		System.out.printf( "Max of %d, %d and %d is %d\n\n", 
				3, 4, 5, CompareMax.<Integer>maximum( 3, 4, 5 ) );

		System.out.printf( "Maxm of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, CompareMax.<Double>maximum( 6.6, 8.8, 7.7 ) );

		System.out.printf( "Max of %s, %s and %s is %s\n","pear",
				"apple", "orange", CompareMax.<String>maximum( "pear", "apple", "orange" ) );

	}

}
