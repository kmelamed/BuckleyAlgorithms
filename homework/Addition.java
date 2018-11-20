
public class AdditionBinary {

	public static void main(String[] args) {
	
	}
	
	static int add(int x, int y) {
		//and, xor, shift left
		int carry = 1;
		while (carry != 0) {
			carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		return x;
	}
	
	static int subtract (int x, int y) {
		int carry = 1;
		y = ~y + 1;
		while (carry != 0) {
			carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		return x;
	}
	
	static int multiply (int x, int y) {
		int product = 0;
		for (int i = 0; i < y; i = add(i, 1)) {
			product = add(product, x);
		}
		return product;
	}
	
	static int divide (int x, int y) {
		int quotient = 0;
		while (x >= y) {
			x = subtract(x, y);
			quotient = add(quotient, 1);
		}
		return quotient;
	}
	
	static int modulo (int x, int y) {
		int quotient = divide(x, y);
		int n = multiply(quotient, y);
		return subtract(x, n);
	}

}
