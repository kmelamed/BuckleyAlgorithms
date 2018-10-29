import java.util.Map;
import java.util.HashMap;

public class FactorialTheBadWay {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
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
	}
}
