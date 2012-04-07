import lejos.robotics.subsumption.*;
import lejos.nxt.*;
public class TurnRight implements Behavior {
  TouchSensor touch1 = new TouchSensor(SensorPort.S4);
  TouchSensor touch2 = new TouchSensor(SensorPort.S2);
  private boolean suppressed = false;
  public boolean takeControl(){
    return !touch1.isPressed() && touch2.isPressed();
  }
  public void action(){
    suppressed = false;
    while(!suppressed && !touch1.isPressed() && touch2.isPressed()) {
      Motor.A.rotate(90,true);
    }
  }
  public void suppress(){
    suppressed = true;
  }
}
