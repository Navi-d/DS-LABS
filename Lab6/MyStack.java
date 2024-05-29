package Lab6;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {

    ArrayList<E> list = new ArrayList<E>();

    public int getSize() {
        return list.size();

    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        if(isEmpty())
            throw new EmptyStackException();
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    public E peek() {
        if(isEmpty())
            throw new EmptyStackException();
        return list.get(getSize()-1);
    }

    public Boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack" + list.toString();
    }

    /* //to return true if found, false if not found
    public boolean search(E o) {
        return list.contains(o);
    }
    

    /* //to return int value, 1 if found, 0 if not found
    public int search(E o) {
        if(list.contains(o))
            return 1;
        else
            return 0;
    }
    */

    public int search(E o) {
            return list.indexOf(o);
    }
}