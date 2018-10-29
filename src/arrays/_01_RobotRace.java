package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.
		Robot[] r = new Robot[5];
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot();
			r[i].setX(i*200);
			r[i].setY(500);
		}
		boolean ifwon = false;
		while (ifwon == false) {
			for (int i = 0; i < r.length; i++) {
				Random random = new Random();
				int rand = random.nextInt(50);
				r[i].setSpeed(20);
				r[i].move(rand);
				if(r[i].getY()<0) {
					ifwon = true;
					System.out.println("winner!");
				}
			}
			
		}
	
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
