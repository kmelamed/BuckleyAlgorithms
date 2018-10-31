import java.util.Map;
import java.util.HashMap;

public class FactorialTheBadWay {

	static Map<String, String> map = new HashMap<>();

	public static void main(String[] args) {

		for (int i = 1; i < 27; i++) {
			String s = "";
			for (int j = 0; j < i; j++) {
				s += Character.toString((char)(i+63));
			}
			map.put((Character.toString((char)(i+64))), s);
		}
		System.out.println(map);

		String newAlphabet = "";
		newAlphabet += "(A|";
		for (int i = 0; i < map.size() - 2; i++) {
			if (i % 2 == 0) {
				newAlphabet += map.keySet().toArray()[i + 2] + "|";
			} else {
				newAlphabet += map.keySet().toArray()[i] + "|";
			}
		}
		newAlphabet += "Z)";
		System.out.println(newAlphabet);

		mapFactorial(5);
	}

	static void mapFactorial(int n) {
		Map<String, String> newMap = new HashMap<>();
		int counter = n;
		for (String s: map.keySet()) {
			if (counter == 0) break;
			counter--;
			newMap.put(s, map.get(s));
		}	

		for (int i = n; i > 1; i--) {
			String key1 = ((char)(63+i)) + "";
			String key2 = ((char)(64+i)) + "";
			String newVal = "";
			for (int j = newMap.get(key2).length(); j > 0; j--) {
				newVal += map.get(key1);
			}
			System.out.println(newMap);
			newMap.put(key1, newVal);
		}
		System.out.println(newMap);
		System.out.println(newMap.get("A").length());
	}
}
