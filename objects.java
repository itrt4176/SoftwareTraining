public class Main{
// Run on https://www.tutorialspoint.com/compile_java8_online.php
    public int numWheels = 4;
    public int speed = 0;
    public int maxSpeed = 50;

    public int getNumWheels() { 
    	return numWheels;
    }
    
    public void setNumWheels(int wheels) {
    	numWheels = wheels;
    }

	public void drive(int speed) {
    	if (speed > maxSpeed) {
			this.speed = maxSpeed;
        } else {
        	this.speed = speed;
        }
    }

	public static void main(String []args){
    	Main robot = new Main();
        
        System.out.println("There are " + robot.getNumWheels() + " wheels");
	
    	robot.setNumWheels(2);
        System.out.println("Now there are " + robot.getNumWheels() + " wheels");
        
	}
}
