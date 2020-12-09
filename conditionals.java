public class Main{
// Run on https://www.tutorialspoint.com/compile_java8_online.php

     public static void main(String []args){

		int target_distance = 5;
        int shooter_range = 10;
        int drive_speed = 0;
        int flywheel_speed = 0;


	 	if (target_distance < shooter_range) {
			drive_speed = 5;        
        }
		 

		if (drive_speed > 0) {
          System.out.println("Moving forward");
        } else {
          System.out.println("Moving backwards");
        }
        
        // Set faster shooter speeds for further targets
        if (target_distance < 5) {
          flywheel_speed = 3; // Slow
          
        } else if (target_distance < 10) {
          flywheel_speed = 8; // Fast
          
        } else {
          flywheel_speed = 0; // Out of range, turn flywheel off
        }
        
        System.out.println("Flywheel speed: "+flywheel_speed);
        
        flywheel_speed = 0;
        drive_speed = 0;
        if (flywheel_speed == 0 && drive_speed == 0) {
          System.out.println("Bot stopped");
        }
     }
}
