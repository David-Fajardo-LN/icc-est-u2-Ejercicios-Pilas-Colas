package utils;

import java.util.Stack;

public class SignValidator {
 
     public boolean isValid (String s){ 
        Stack<Character> pila = new Stack<>();

        for ( char signo : s.toCharArray()){
            
           
            
            if ( signo  == '(' || signo == '[' || signo == '{'){
                pila.push(signo);
                
            
            }else{
                  if ( pila.isEmpty() ){
                return false;

            char ultimo = pila.pop();

             if (signo == ')' && ultimo != '(') {
                    return false;
                }

                if (signo == '}' && ultimo != '{') {
                    return false;
                }

                if (signo == ']' && ultimo != '[') {
                    return false;
            }
                
            }

        }
    }
    return pila.isEmpty();
        



         
     }
 }