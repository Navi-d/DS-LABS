package stack;

/* @author Amaan Geelani Syed S2191704 */

import java.util.Stack;

public class Q3 {
    public static int sum(Stack<Integer> stack){
        // variable to store sum valie
        int sum = 0;
        
        // temporary stack to store elements
        Stack<Integer> tempStack = new Stack<>();
        
        // first loop
        while(!stack.isEmpty()){
            //pop element and add to sum
            int element = stack.pop();
            sum+=element;
            //store element in temp stack
            tempStack.push(element);
        }
        
        //second loop
//        while(!tempStack.isEmpty()){
//            //push all elements back in old stack
//            stack.push(tempStack.pop());
//        }
        
        //return the sum
        return sum;
    }
    
    
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);
        S.push(6);
        S.push(7);
        System.out.println(sum(S));
        System.out.println(S);
    }
    
}
