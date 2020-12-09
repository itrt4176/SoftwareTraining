public class Main{
// Run on https://www.tutorialspoint.com/compile_java8_online.php

	public static void main(String []args){
		for (int i = 0; i < 5; i++) {
          System.out.println("i: "+i);
        }
        
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
          sum = sum + i;
        }
        System.out.println("Sum of 0-1000: "+sum);
      
	}
}
