/* @author: Jianyang Zhang */

package projectA;

import java.util.Random;

/**
   Drunkard class
       Represents a "drunkard" doing a random walk on a grid.
*/
public class Drunkard {

    // add private instance variables here:
	Random rand = new Random();
	private ImPoint flag;	// The location of drunkard during the random walking
	private int stepSize;
    private int direction;
     



    /**
       Creates drunkard with given starting location and distance
       to move in a single step.
       @param startLoc starting location of drunkard
       @param theStepSize size of one step in the random walk
    */
    public Drunkard(ImPoint startLoc, int theStepSize) {
    	flag = startLoc;
    	stepSize = theStepSize;    	
    }


    /**
       Takes a step of length step-size (see constructor) in one of
       the four compass directions.  Changes the current location of the
       drunkard.
    */
    public void takeStep() {
    	direction = rand.nextInt(4)+1;
    	if(direction== 1){
    		 flag = flag.translate(0, stepSize);
    	}else if(direction== 2){
    		 flag = flag.translate(0, -stepSize);
    	}else if(direction == 3){
    		 flag = flag.translate(-stepSize, 0);
    	}else{
    	     flag = flag.translate(stepSize, 0);
    	}
    }


    /**
       gets the current location of the drunkard.
       @return an ImPoint object representing drunkard's current location
    */
    public ImPoint getCurrentLoc() {
    	ImPoint CurrentLoc = new ImPoint(flag.getX(), flag.getY());
    	return CurrentLoc;
    }

}