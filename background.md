---
# Background

## What we're going to talk about
- Role of software on the robot
- What the software team does
- How to use Java to do things
- Don't need anything other than a web browser to follow along

## Why Software Team?
- Can work on it without physically being next to the robot
- Useful skill to learn. Could lead to college study, or a job
- Learning to program is not just for FRC. More and more of the things around us are becoming connected. Its getting easier to interact with a minimum of familiarty with code.
- Almost everything we learn about in writing Java for the robot carries over to something like making a webpage that could be the next tiktok or twitch

- It's fun. Breathing life into the Robot. Great problem solving practice


# What does software do on the bot?
  - Take Driver input
  - Control Motors and other actuators. Driving, aiming, shooting, intake, etc... 
  - Sense robot and "token" positions (how fast is robot going, did we just pick up a ball, how far away is the target)
  - Autonomous Mode: As close as you can get to a self-driving Tesla.
    Robot has to know its location, plan its path, maybe avoid obstacles, detect and aim at targets
    Strategy- Which goal to shoot at first, how many balls to fire
  - When we get further into the code, we'll see FRC has given us building blocks for each of these specific things to make the bot very easy to control.
  - Some pieces like the Computer Vision (Limelight) module don't require programming to start experimenting with

# Programming Basics
  - Computer do *exactly* what a human tells it to do
  - Have to break a problem down into small steps
  
  - Write
     Series of lines that tell the computer what to do
     special characters like curly braces, parens, semicolons matter. Case matters => called syntax
     If you get it wrong, the computer will tell you, but error messages are not always the most clear
     
  - compile
     Ask computer to take your code and turn it into something the computer can run.
     Part of learning to code is learning to understand the messages and how to fix them 
     
  - run
    Try your code and see what it does. If we're trying to drive the robot, maybe it turns right when we wanted it to turn left
    If the program does not do what you want, 99% of the time the code is not correct and needs to be fixed.
    
  - repeat

# Pseudocode
 - Often useful to write down how you'd solve a problem in words rather than code. Can start with a vague description and add in details
   Example: Shooting fuel cells

   - Aim
     - Turn on Vision System
     - Find angle to target
     - Turn turrent to target angle
     
   - Turn shooter motors on
     - Spinner wheel
     - Feed system
     
   - Shoot
     - Open ball gate
     - Wait
     - Close ball gate
     
   - Turn motors off


Can write pseudocode for anything
- Exercise: Write psudocode for making a PB&J sandwich

# Syntax is important
 - braces and brackets and parens mean different things
 - learn the meaning over time and what goes where
 - java will tell you when you are wrong. not always most helpful at telling you how to fix it


# Write your first program
- Lots of languages, this is called Java
- Today, going to use a Java sandbox.
- FRC uses another program called "VSCode" to program in and upload code to bot. Takes a while to install, so we'll save it for another time 

-  http://tpcg.io/TKGwQ9I9
- Most basic program
  - Ignore the "class" and "main" lines for now, we'll come back to them
  - Key here is System.out.println(). Java will print out whatever is inside the quotes
  - Break the program, try and run it to show an example error message

- Comments
 - Anything starting with //
 - Block Comments start /* and end */
 


# Write your next program (lots of information here, but we'll take it slow)

- Variables
 - Types: String, char, int, float,
 - Have to convert between them
 - Can do "operations" on variables. +, -, *, / (integer),
 - compare (== or equals()), !=, >, <
 - be careful of using "=" instead of "=="
 - can be combined with !, && and ||
 - This is kinda boring though, just basic math
 - Exercise:
   - Find number of years until graduation

- Conditionals and Control Flow
 - but computers are GREAT at making decisions. Can make lots of decisions, very fast, 100% accurate
 - if, else if, else
   if (robot_distance > shooter_range) {
     forward_speed = 10;
   } else {
     forward_speed = 0;
   }
 - Exercise:
   - Print upperclassman/underclassman
   
- Variable Scope
  - conditional
  - for
  - function
  - class

- Some questions you'd like a computer to answer could end up with complicated or really long.
- If i wanted to make 1000 bowls of pasta, I wouldn't cut and paste the statments 1000 times.
-  If I wanted to change one thing, I'd have to make the same change 1000 times
-  If I changed my mind and only wanted 500 bowls, I'd have to count out and delete 500 of the lines
-  Programming Rule: Don't Repeat Yourself, use a loop or a function. Always exception to the rules. 

 - for loop
 - function
   - Group of statements/lines that are doing the same task (i.e. if it takes 10 lines to set the speed on a motor, it should be a function)
   - Try to keep functions short ~50 lines. Functions can call other functions.
   - Functions can take input, called "arguments"
   - return values
   - Exercise:
     - Print all values between 6 and 80

- functions
  - Repeatability
  - Arguments
  - calling
  - Return Value
  - Exercise:
 
 - objects/classes
   - Group of functions that share variables between them (other than their arguments)
   - public v private visibility
   - Constructors
   - Inheritance
   - Exercise:


- Java Functional
   
- Next time:
  - How to use VS Code
  - will look at actual code from last year's robot
  - 



# Interested? Where to learn more:
- Code Academy: https://www.codecademy.com/learn/learn-java
- Mentors (
- Previous years software team members
- WPILib: https://docs.wpilib.org/en/stable/docs/getting-started/getting-started-frc-control-system/intro.html
