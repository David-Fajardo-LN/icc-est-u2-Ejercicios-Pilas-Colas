package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindrome {

    public boolean isPalindrome(String text) {
        Queue<Character> cola = new LinkedList<>(); 

        
        for (char c : text.toCharArray()) {
            cola.add(c);
        }
        
        int size = cola.size();
        for (int i = 0; i < size / 2; i++) {
            char frente = cola.poll(); 
            
            int mover = size -2 -( i*2);
            for (int j = 0; j < mover; j++) {
            char c = cola.poll(); 
            cola.add(c); 
             }
             char ultimo = cola.poll();
             if (frente != ultimo) {
                return false;
        
          }
        }
       
        return true;
        
      }
 
}