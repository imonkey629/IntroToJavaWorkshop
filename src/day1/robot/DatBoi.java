package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class DatBoi {
public static void main(String[] args) {

 Robot Harambe=new Robot();
 Harambe.setSpeed(10);
 Harambe.penDown();
 Harambe.setPenColor(21, 8, 2);
 for (int i = 0; i < 4; i++) {
	

for (int j = 0; j < 4; j++) {
Harambe.move(200);
Harambe.turn(90);
Harambe.move(200);
Harambe.turn(90);	
Harambe.move(200);
Harambe.turn(90);
Harambe.move(400);
}

 } 
 
}
}
