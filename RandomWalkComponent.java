/* @author: Jianyang Zhang */

package projectA;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class RandomWalkComponent extends JComponent {	
/*
 add private instance variables here:
*/
	private int numSteps;
	private ImPoint imPoint = new ImPoint(200, 200);
	private Drunkard drunkard = new Drunkard(imPoint, 5);
	public ArrayList<Integer> xLocations = new ArrayList<Integer>();
	public ArrayList<Integer> yLocations = new ArrayList<Integer>();
	
/*
 Takes a given number of steps and records the coordinates for x and y separately.
*/
	public RandomWalkComponent(int numSteps){
		xLocations.add(200);
		yLocations.add(200);
		this.numSteps = numSteps;
		for(int i = 0; i < numSteps; i++){			
			drunkard.takeStep();			
			System.out.println(drunkard.getCurrentLoc().getPoint2D());
			xLocations.add(drunkard.getCurrentLoc().getX());
			yLocations.add(drunkard.getCurrentLoc().getY());		
		}
	}
	
/*
 Draw lines to connect the coordinates generated in one maneuver.
*/		
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;		
		for(int j = 0; j < numSteps; j++){			    
		g2.drawLine(xLocations.get(j),yLocations.get(j),xLocations.get(j+1),yLocations.get(j+1));
		}
	}
	
}
 