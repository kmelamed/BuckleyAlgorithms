import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OccurenceOfEachLetterLab {

	public static void main(String[] args) throws FileNotFoundException {
		countLetterOccurences("Occurences.txt");
	}

	public static void countLetterOccurences (String fileName) throws FileNotFoundException { //[65, 90]=A-Z  [97, 122]=a-z (char)(i)
		File fromFile = new File(fileName);		
		Scanner in = new Scanner(fromFile);
		File toFile = new File("Temp.txt");
		PrintWriter out = new PrintWriter(toFile);
		
		int[] counterArr = new int[26];
		
		while (in.hasNextLine()) {
			String s = in.nextLine();
			for (int i = 0; i <= s.length() - 1; i++) {
				for (int j = 65; j <= 90; j++) {
					int counter = 0;
					if (s.charAt(i) == (char)(j) || s.charAt(i) == (char)(j+32)) {
						counterArr[j-65]++;
					}
				}
			}
		}
		
		for (int i = 0; i < 26; i++) {
			out.println((char)(i+65) + ": " + counterArr[i]);
		}
		in.close();
		out.close();
		
		//		for (int i = 0; i <= s.length() - 1; i++) {
		//			for (int j = 65; j <= 90; j++) {
		//				int counter = 0;
		//				if (s.charAt(i) == (char)(j) || s.charAt(i) == (char)(j+32)) {
		//					counter++;
		//				}
		//				System.out.println((char)(j) + ": " + counter);
		//			}
		//		}

//		while (in.hasNextLine()) {
//			for (int j = 65; j <= 90; j++) { 
//				String s = in.nextLine();
//				int counter = 0;
//				for (int i = 0; i <= s.length() - 1; i++) {	
//					if (s.charAt(i) == (char)(j) || s.charAt(i) == (char)(j+32)) {
//						counter++;
//					}		
//				}
//				System.out.println((char)(j) + ": " + counter);
//			}
//		}	
	}

}
