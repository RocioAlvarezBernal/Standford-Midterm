import acm.program.*;
import java.util.*;

public class UniqueName extends ConsoleProgram {

	public void run() {
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			String name = readLine("name: ");
			if (name.equals(""))
				break;
			if (!list.contains(name)) {
				list.add(name);
			}
		}

		printList(list);
	}
	private void printList(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			println(list.get(i));
		}
	}

}
