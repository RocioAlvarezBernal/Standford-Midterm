import stanford.karel.*;

public class KareltheRobot extends SuperKarel { 
	public void run() {
		moveUp();
		for (int i = 0; i < 4; i++) {
			border();
			next();
		}
	}
	private void border() {
		move();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}
	private void moveUp() {
		turnLeft();
		move();
		turnRight();
	}
	private void next() {
		turnRight();
		move();
		turnRight();
		move();
		turnRight();
	}
}