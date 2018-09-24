import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReformatBracesHW3 {

	public static void main(String[] args) throws FileNotFoundException {
		File fromFile = new File("src/BracesSourceHW.java");
		File toFile = new File("src/Temp.java");
		Scanner in = new Scanner(fromFile);
		PrintWriter out = new PrintWriter(toFile);

		while(in.hasNextLine()) {
			String s = in.nextLine();
			int tabs = 0;
			if (s.contains("{") ) {
				for (int i = 0; i < s.length() - 1; i++) {
					if (s.charAt(i)=='\t') {
						tabs++;
					}
				}
				out.print(s.substring(0, s.indexOf('{')) + "\n");
				for (int j = 0; j < tabs; j++) {
					out.print("\t");
				}
				out.print("{");
			} else if (s.contains("}")) {
				for (int i = 0; i < s.length() - 1; i++) {
					if (s.charAt(i)=='\t') {
						tabs++;
					}
				}
				out.print(s.substring(0, s.indexOf('}')) + "\n");
				for (int j = 0; j < tabs; j++) {
					out.print("\t");
				}
				out.print("}");
			} else {
				out.println(s);
			}

		}

		out.close();
		in.close();
	}

}
