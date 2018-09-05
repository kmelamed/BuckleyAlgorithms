
public class HW1stringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 1110; i++) {
			sb.append((char)((int)(Math.random()*(126-33+1))+33));
		}
		
		for (int i = 1; i < 1110; i++) {
			System.out.print(sb.charAt(i));
			if (i % 100 == 0) {
				System.out.println("\n");
			}
		}

	}

}
