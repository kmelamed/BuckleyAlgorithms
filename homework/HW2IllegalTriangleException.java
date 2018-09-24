import java.util.Scanner;

public class IllegalTriangleExceptionHW2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the lengths for the legs of a triangle: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		try {
			Triangle t1 = new Triangle(a, b, c);
		} catch (IllegalTriangleException e) {
			System.out.println(e.getMessage());
		}	
	}
}

class IllegalTriangleException extends Exception {
	IllegalTriangleException() {
		super("The sum of any 2 sides has to be greater than the other side");
	}
}
	
class Triangle {
	int a, b, c;
	Triangle(int a, int b, int c) throws IllegalTriangleException {
		if (a + b <= c || a + c <= b || b + c <= a) {
			throw new IllegalTriangleException();
		}
	}	
}
