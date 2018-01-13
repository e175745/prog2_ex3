package e17;
import robocode.*;
import java.awt.*;

public class E175745 extends Robot {
	boolean movingForward;
	public void run() {
		setBodyColor(Color.lightGray);
		setGunColor(Color.gray);
		setRadarColor(Color.darkGray);
		enemy = getothers();
		if (enemy >= 5) {
			setAhead(30000);
			movingForard = true;
			setTurnLeft(90);
			waitFor(new TurnCompleteCondition(this));
			setTurnRight(180);
			waitFor(new TurnCompleteCondition(this));
			setTurnLeft(90);
			waitFor(new TurnCompleteCondition(this));
		} else {
		}
	}
	public void onScannedRobot(ScannedRobotEvent e){
		fire(3);
	}
	public void onHitRobot(HitRobotEvent e) {
		if (e.isMyFault()) {
			turnRight(10);
		}
	}
	public void onHitWall(HitWallEvent e){
		if (movingForward) {
			setBack(10000);
			movingForward = false;
		}else{
			setAhead(10000);
			movingForward = true;
		}
	}
	public void onHitRobot(HitRobotEvent e){
		if (movingForward) {
			setBack(10000);
			movingForward = false;
		} else {
			setAhead(10000);
			movingForward = true;
		}
	}
	public void onWin(WinEvent e) { // 勝利の踊り。無くても良い。
		 for (int i = 0; i < 50; i++){
			turnRight(30);
			turnLeft(30);
		}
	}
}