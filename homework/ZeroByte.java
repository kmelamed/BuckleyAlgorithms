package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class ZeroByteTwo {

	public static void main(String[] args) {
		File folder = new File("/Users/kaylenmelamed/ZeroByte"); 
		File[] listOfFiles = folder.listFiles(); 
		String [] lines = new String[listOfFiles.length]; 
		int k = 0; 
		for (File f: listOfFiles) {
			if (f.isFile()) {
				lines[k] = f.getName(); 
				k++; 
			} 
		} 
		Arrays.sort(lines);
		for (int i = 0; i < lines.length; i ++) {
			lines[i] = lines[i].replace("DOT", "."); 
			String result = ""; 
			for (int j = 0; j < lines[i].length(); j++) { 
				if (Character.isDigit(lines[i].charAt(j)))
					continue; 
				else 
					result += lines[i].charAt(j);
			}
			lines[i] = result; 
		}
		try (FileWriter fw = new FileWriter("/Users/kaylenmelamed/Documents/workspace/Algorithms&DataStructures/src/Test/Test.java", true)) {
			BufferedWriter bw = new BufferedWriter(fw); 
			PrintWriter pw = new PrintWriter("/Users/kaylenmelamed/Documents/workspace/Algorithms&DataStructures/src/Test/Test.java"); 
			PrintWriter out = new PrintWriter(fw);
			for (String line: lines){
				if (line.equals(".DS_Store")) continue;
				out.println(line); 
			}
			fw.close(); 
			pw.close(); 
			out.close(); 
		} catch (IOException e) {
			System.out.println("failed");
		}
		System.out.println(Arrays.toString(lines));

		try {
			runProcess("javac -cp src src/Test/Test.java");
			runProcess("java -cp src Test.Test");
		} catch (Exception j) {
			j.printStackTrace();
		}
		System.out.println("**********");	
		
		File file = new File("/Users/kaylenmelamed/Documents/workspace/Algorithms&DataStructures/src/Test/Test.java");
		if(file.delete())
			System.out.println("Deleted");
		else
			System.out.println("Failed");
		
	}

	private static void printLines(String name, InputStream ins) throws Exception {
		String line = null;
		BufferedReader in = new BufferedReader(
				new InputStreamReader(ins));
		while ((line = in.readLine()) != null) {
			System.out.println(name + " " + line);
		}
	}

	private static void runProcess(String command) throws Exception {
		Process pro = Runtime.getRuntime().exec(command);
		printLines(command + " stdout:", pro.getInputStream());
		printLines(command + " stderr:", pro.getErrorStream());
		pro.waitFor();
		System.out.println(command + " exitValue() " + pro.exitValue());
	}

}
