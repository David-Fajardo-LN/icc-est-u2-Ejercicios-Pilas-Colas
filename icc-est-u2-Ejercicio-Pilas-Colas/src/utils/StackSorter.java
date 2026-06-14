package utils;

import java.util.Stack;

public class StackSorter {
 
    public void sortStack (Stack<Integer> stack){
        
        Stack<Integer> aux = new Stack<>();

        while ( !stack.isEmpty()){
            int temporal = stack.pop();


            while ( !aux.isEmpty() && aux.peek()< temporal){
                stack.push(aux.pop());

            }

            aux.push(temporal);

        }
        while (!aux.isEmpty()) {
            stack.push(aux.pop());
            
            
        }
    }
    
}