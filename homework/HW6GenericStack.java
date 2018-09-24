import java.util.Stack;

public class GenericStackHW6 {

	public static void main(String[] args) {
				
	}

}

class GenericStack<E> {
	private E[] arr = (E[])new Object[10]; //array to store elements
	private int last = -1; //index of the last element

	public GenericStack() {

	}	
	public Integer getSize() {
		return last+1;		
	}
	public E peek() {
		if (!isEmpty()) {
			for (int i = getSize() - 1; i >= 0; i--) {
				if(arr[i] != null) {
					return arr[i];
				}
			}
		}
		return null;
	}
	public E pop() {
		if (last>=0) {
			E popOff = arr[last];
			arr[last] = null;
			last--;
			return popOff;
		} else {
			return null;
		}
	}
	public void push(E x) {
		if (arr.length > last + 1) {
			arr[last + 1] = x;
			last++;
		} else {
			E[] eDouble = (E[])new Object[arr.length * 2];
			int i = 0;
			for (E n: arr) {
				eDouble[i] = n;
				i++;
			}
			arr = eDouble;
			last++;
			arr[last] = x;
		}
	}
	public boolean isEmpty() {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				return false;
		}
		return true;
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Stack: [");
		for (E x: arr) {
			if (x!=null) {
				s.append(x + ", ");
			}
		}
		s.deleteCharAt(s.length()-1);
		s.deleteCharAt(s.length()-1);
		s.append("]");
		String sString = s.toString();
		return sString; 
	}

}
