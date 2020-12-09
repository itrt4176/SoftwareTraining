public class Main{
// Run on https://www.tutorialspoint.com/compile_java8_online.php

     public static void main(String []args){
        int x = 10;
        
        double y = 10.5;
        
        String hi = "Hello World";
        
        System.out.println(hi);
        
        // Addition
        x = 5 + 3;
        System.out.println("5 + 3 = " + x);
        
        // Division
        x = 10 / 3;
        System.out.println("Integer Division: 10/3="+x);
        
        y = 10.0/3;
        System.out.println("'Real' Division 10.0/3="+y);
        
        // Comparison (<, >, <=, >=, ==, !=)
        boolean lt = 2<8;
        System.out.println("Is 2 < 8? "+lt);
        
        boolean not_equals = 3 != 5;
        System.out.println("Is 3 != 5? "+not_equals);
        
        // Logical Operators
        System.out.println("True and True= "+ (true && true));
        System.out.println("True and False= "+ (true && false));
        System.out.println("True or False= " + (true || false));
        System.out.println("False or False= " + (false || false));
        System.out.println("Negation, !true = " + !true);
     }
} 
