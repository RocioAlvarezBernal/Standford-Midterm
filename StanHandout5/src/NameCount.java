
import acm.program.*;
import java.util.*;

public class NameCount extends ConsoleProgram {
	public void run() {
		HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
		readNames(nameMap);
		printMap(nameMap);
	}

	private void readNames(Map<String, Integer> map) {
		while (true) {
			String name = readLine();
			if (name.equals(""))
				break;
			Integer count = map.get(name);
			if (count == null) {
				count = new Integer(1);
			} else {
				count = new Integer(count + 1);
			}
			map.put(name, count);
		}
	}
	
	private void printMap(Map<String, Integer> map) {
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			int count = map.get(key);
			println(key + count);
		}
	}
}