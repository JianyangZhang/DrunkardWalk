/* @author: Jianyang Zhang */

package projectA;

/*
 Test Drunkard class for 10 steps with hard-coded start location and step size.
 The steps taken by drunkard are random. The test result will be "succeed" 
 if and only if x or y coordinate increases or decreases 5. If both of
 them are changed or neither of them is changed, the result will be "failed". 
 */

public class DrunkardTester {
	public static void main(String[] args){
		ImPoint imPoint = new ImPoint(100,100); // start location
		Drunkard drunkard = new Drunkard(imPoint,5); // initiate drunkard class with step size 5
		System.out.println("Drunkard starts at (" + drunkard.getCurrentLoc().getX() + "," + drunkard.getCurrentLoc().getY() + "), step size is 5.");
		System.out.println("[Expected] Start Location: (100,100)");
		for(int i = 0; i < 10; i++){
			ImPoint lastStep = new ImPoint(0,0);
			lastStep = drunkard.getCurrentLoc();
			drunkard.takeStep();
			int deltaX = Math.abs(lastStep.getX() - drunkard.getCurrentLoc().getX()); // The absolute value of difference after a step in X direction 
		    int deltaY = Math.abs(lastStep.getY() - drunkard.getCurrentLoc().getY()); // The absolute value of difference after a step in Y direction
		    System.out.print("Took step to (" + drunkard.getCurrentLoc().getX() + "," + drunkard.getCurrentLoc().getY() + ")");
			if((deltaX == 5 && deltaY == 0)^(deltaX == 0 && deltaY == 5)){				
				System.out.println(" **Succeed**");
			}else{
				System.out.println(" **Failed**");
			}			
		}		
	}
}
