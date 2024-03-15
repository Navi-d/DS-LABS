package Lab2.Q3;



public class StorePairGeneric<E extends Comparable<E>> implements Comparable<StorePairGeneric<E>> { 
	
    private E first, second;
        
        public StorePairGeneric(E first, E second){
            this.first = first;
            this.second = second;
        }
        
        public E getFirst(){
            return first;
        }
        
        public E getSecond(){
            return second;
        }
        
        public void setPair (E first, E second){
            this.first = first;
            this.second = second;
        }
        
        @Override
        public boolean equals(Object o) {
            
            StorePairGeneric<E> other =  (StorePairGeneric<E>) o;
            return this.first.equals(other.first);
        }
        
        @Override
        public int compareTo(StorePairGeneric<E> o) {
            return this.first.compareTo(o.first);
        }
        
        @Override
        public String toString(){
            return "first = " + first + ", second = " + second;
        }
    
        public static void main(String[] args) {
    
            StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
            StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
            StorePairGeneric<String> c = new StorePairGeneric<>("6","3");
            
            System.out.println(a.toString());
            System.out.println(b.toString());
            System.out.println(c.toString());
            
            System.out.println(a.compareTo(b)); //a > b, it returns a positive number (1)
            // System.out.println(a.compareTo(c)); //a == c, it returns 0
            // System.out.println(b.compareTo(c)); //b < c, it returns a negative number (-1)
            
            System.out.println(a.equals(b)); 
            System.out.println(a.equals(c));
            System.out.println(b.equals(c));
    
    
        }
    
    }
