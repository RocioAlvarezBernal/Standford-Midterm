import acm.program.*;

public class Problem3SimpleJavaprograms extends ConsoleProgram {

	public void run() {
		int x = -1;
		int y = -1;
		while (true) {
			int input = readInt("? ");
			if (input == 0)
				break;
			if (input > x) {
				y = x;
				x = input;
			} else if (input > y) {
				y = input;
			}
		}
		println("largest " + x);
		println("second largest " + y);
	}
}
