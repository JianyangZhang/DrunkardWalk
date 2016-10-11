/* @author: Jianyang Zhang */

package projectA;	

/*
 Prompts for the number of steps and check the availability.
 Shows the steps taken by drunkard in a pop-up window.
 All coordinates will be printed in console.
 */

import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;

public class RandomWalkViewer {	

	public static void main(String args[]){
		Scanner user = new Scanner(System.in);
		System.out.print("Enter number of steps:");
		int numSteps = user.nextInt();
		while(numSteps <= 0){
			System.out.println("ERROR: Number entered must be greater than 0.");
			System.out.print("Enter number of steps:");			
			numSteps = user.nextInt();
		}	
		
		RandomWalkComponent viewer = new RandomWalkComponent(numSteps);
		System.out.println("X : " + viewer.xLocations);
		System.out.println("Y : " + viewer.yLocations);
		
		JFrame jf = new JFrame("Random Walk Viewer");        
        jf.setSize(400,400);  // set the size of window
        jf.setVisible(true);  // set the window's visibility
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit when close the window
        jf.add(viewer); // show the window		
	}
}
