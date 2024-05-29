package Lab7;

public class MyQueue<E> {

    private java.util.LinkedList<E> list = new java.util.LinkedList<E>();

    public MyQueue(E[] e) {
        for(int i=0; i<e.length; i++) {
          enqueue(e[i]);
        }
      }
      
   public MyQueue() {}
  
    public void enqueue(E e) {
      list.addLast(e);
    }
  
     public E getElement(int i) {
          return list.get(i);
      }
  
    public E dequeue() {
      return list.removeFirst();
    }
  
    public E peek() {
      return list.peek();
    }
  
    public int getSize() {
      return list.size();
    }
  
    public boolean contains(E e)
    {
        return list.contains(e);
       
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
  
    @Override
    public String toString() {
      return "Queue: " + list.toString();
    }
  
  public static void main(String[] args) {
         String readyfruit[] = {"Durian", "Blueberry"};
          MyQueue<String> fruitQ = new MyQueue<String>(readyfruit);
         
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        System.out.println("Current items: " + fruitQ);
        System.out.println("peek (front item): "  + fruitQ.peek());
        System.out.println("Queue size: " + fruitQ.getSize());
        fruitQ.dequeue();   
        System.out.println("Queue at index 2 is: " + fruitQ.getElement(2));
        System.out.println("List contains 'Cherry':" + fruitQ.contains("Cherry"));
        System.out.println("List contains 'Durian':" + fruitQ.contains("Durian"));
        
  
        while(!fruitQ.isEmpty()) {
            System.out.print(fruitQ.dequeue() + " ");
        }
        
        
    } 
}