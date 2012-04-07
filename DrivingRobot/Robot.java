import lejos.nxt.*;
import lejos.robotics.subsumption.*;
public class Robot {
  public static void main (String[] args) throws Exception {
    Behavior moveForward = new MoveForward();
    Behavior turnLeft = new TurnLeft();
    Behavior turnRight = new TurnRight();
    Behavior reverse = new Reverse();
    Behavior [] behaviours = {moveForward, turnLeft, turnRight, reverse};
    Arbitrator arbitrator = new Arbitrator(behaviours);
    arbitrator.start();
  }
}
