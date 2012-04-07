import lejos.robotics.subsumption.*;
import lejos.nxt.*;
public class Reverse implements Behavior {
  TouchSensor touch1 = new TouchSensor(SensorPort.S4);
  TouchSensor touch2 = new TouchSensor(SensorPort.S2);
  UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S1);

  private boolean suppressed = false;
  public boolean takeControl(){
    return touch1.isPressed() && touch2.isPressed() && sonar.getDistance() < 25;
  }
  public void action(){
    suppressed = false;
    while(!suppressed && touch1.isPressed() && touch2.isPressed() && sonar.getDistance() < 25) {
      Motor.A.rotate(-90,true);
      Motor.C.rotate(-90,true);
    }
  }
  public void suppress(){
    suppressed = true;
  }
}
