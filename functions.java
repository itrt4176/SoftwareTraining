public class Main{
// Run on https://www.tutorialspoint.com/compile_java8_online.php

    public static int repeater(String text, int count) {
      for (int i = 0; i < count; i++) {
        System.out.println(text);
      }

	  return (count);
    }

	/*
    public static void drive(int speed, int direction) {
      setSpeed(speed);
      if (direction == 1) {
        driveForward();
      } else {
        driveBackwards();
      }
    }
	*/
    
	public static void main(String []args){
		repeater("make pasta", 2);
        
       	repeater("scoop ice cream", 7);
	}
}
