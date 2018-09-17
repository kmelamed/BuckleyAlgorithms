import java.io.*;

public class UpdateCountHW4 {

	public static void main(String[] args) throws IOException {
		int counter; //counts how many times the program is executed
		File f1 = new File("count.dat");
		DataOutputStream out;
		//out.writeInt(0);
		DataInputStream in;
		
		if (f1.exists()) {
			in = new DataInputStream(new FileInputStream(f1));
			counter = in.readInt() + 1;
			out = new DataOutputStream(new FileOutputStream(f1));
			out.writeInt(counter);		
			in.close();
		} else {
			counter = 1;
			out = new DataOutputStream(new FileOutputStream(f1));
			out.writeInt(counter);
			System.out.println(1);
		}
		in = new DataInputStream(new FileInputStream(f1));
		System.out.print(in.readInt());
		
		out.close();
	}
}
