package app;
import java.util.Stack;

import utils.QueuePalindrome;
import utils.SignValidator;
import utils.StackSorter;
public class App {
public static void main(String[] args) {
     runSignValidator();
     runStackSorter();
     runQueuePalindrome();
   }
    private static void runSignValidator() {
       SignValidator signValidator = new SignValidator();
       String cadena1 = "{[()]}";
       String cadena2 = "{[(])}";
       String cadena3 = "()[]{}";
       String cadena4 = "((()";
       System.out.println("Ejercicio 01: Validación de Signos");
       System.out.println("Cadena: " + cadena1 + " | Resultado: " +
       signValidator.isValid(cadena1));
       System.out.println("Cadena: " + cadena2 + " | Resultado: " +
        signValidator.isValid(cadena2));
       System.out.println("Cadena: " + cadena3 + " | Resultado: " +
        signValidator.isValid(cadena3));
       System.out.println("Cadena: " + cadena4 + " | Resultado: " +
        signValidator.isValid(cadena4));
    }
    private static void runStackSorter() {
      Stack<Integer> stack = new Stack<>();
      stack.push(2);
      stack.push(4);
      stack.push(1);
      stack.push(5);
      Stack<Integer> stack2 = new Stack<>();
      stack2.push(3);
      stack2.push(6);
      stack2.push(0);
      stack2.push(7);
     StackSorter sorter = new StackSorter();
     System.out.println("\nEjercicio 02: Ordenar Stack");
     System.out.println("Stack original: " + stack);
     sorter.sortStack(stack);
     System.out.println("Stack ordenado: " + stack);
     System.out.println("Tope esperado: " + stack.peek());
     System.out.println("\nEjemplo 2 ");
     System.out.println("Stack original: " + stack2);
     sorter.sortStack(stack2);
     System.out.println("Stack ordenado: " + stack2);
     System.out.println("Tope esperado: " + stack2.peek());
       }
     private static void runQueuePalindrome() {
     QueuePalindrome queuePalindrome = new QueuePalindrome();
     System.out.println("\nEjercicio 03: Palíndromo usando Colas");
     System.out.println("ana | Resultado: " + queuePalindrome.isPalindrome("ana"));
     System.out.println("radar | Resultado: " +
     queuePalindrome.isPalindrome("radar"));
     System.out.println("java | Resultado: " +
     queuePalindrome.isPalindrome("java"));
     System.out.println("reconocer | Resultado: " + queuePalindrome.isPalindrome("reconocer"));
     System.out.println("miguel | Resultado: " +
     queuePalindrome.isPalindrome("miguel"));
  }
}