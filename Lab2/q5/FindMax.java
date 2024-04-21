package Lab2.q5;

/* @author Amaan Geelani Syed S2191704 */

public class FindMax {
    public static class Circle implements Comparable<Circle>{
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public int compareTo(Circle o) {
            if(radius < o.radius){
                return -1;
            } else if (radius > o.radius){
                return 1;
            } else {
                return 0;
            }
        }
        
        @Override
        public String toString(){
            return "Circle {Radius: "+radius+"}";
        }

       
        
    }
    
    public static <E extends Comparable<E>> E max(E[] array){
            E max = array[0];
            
            for(E e : array){
                if(e.compareTo(max)>0)
                    max = e;
            }
            
            return max;
    }
    
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3};
        System.out.println("Max number: "+max(numbers));
        
        String[] strings = {"red","blue","green"};
        System.out.println("Max string: "+max(strings));
        
        Circle[] circles = {new Circle(3d),new Circle(2.9d),new Circle(5.9d)};
        System.out.println("Max circle: "+max(circles));
    }
    
}
