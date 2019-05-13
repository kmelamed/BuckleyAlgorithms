package Test;

public class BinarySearchTree {

	public static void main(String[] args) {

		Node root = new Node(10); 

		root.insert(11);
		root.insert(3);
		root.insert(8);
		root.insert(12);
		root.insert(7);
		root.insert(13);
		root.insert(2);

		System.out.println(root.tree());

		System.out.println(root.leftKid.val);
		System.out.println(root.rightKid.val);
		
		System.out.println(root.tree());

	}
}

class Node {
	int val;
	Node leftKid;
	Node rightKid;

	public Node (int v) { 
		this.val = v; 
	}

	public void insert(int value) {

		if (val > value) {
			if(leftKid == null)
				leftKid = new Node (value); 
			else { 
				leftKid.insert(value);
			}
		} else if (val < value) {
			if (rightKid == null)
				rightKid = new Node (value); 
			else { 
				rightKid.insert(value);
			}
		} 

	}

	public boolean search(int value) { 
		if (value == val) {
			return true; 
		} else if (rightKid == null && leftKid == null) { 
			return false;
		} else if (rightKid == null) {
			return leftKid.search(value);
		} else if (leftKid == null) {
			return rightKid.search(value);
		} else if (val < value) {
			System.out.println(rightKid);
			return rightKid.search(value); 
		} else {
			return leftKid.search(value);  
		}
	}

	public void delete(Node root, int key){ 
		root = pDelete(root, key); 
	} 

	private Node pDelete(Node root, int key){ 
		if (root == null)  return root; 

		if (root.val > key) 
			root.leftKid = pDelete(root.leftKid, key); 
		else if (root.val < key) 
			root.rightKid = pDelete(root.rightKid, key); 

		else { 
			if (root.leftKid == null && root.rightKid == null) // node w 2 kids
				return null; 
			else if (root.leftKid == null) // node w 1 kid
				return root.rightKid; 
			else if (root.rightKid == null) 
				return root.leftKid; 

			root.val = getMin(root.rightKid); 
			root.rightKid = pDelete(root.rightKid, root.val); 
		} 

		return root; 
	} 
	
	int getMin(Node root) { 
		int min = root.val; 
		while (root.leftKid != null) { 
			min = root.leftKid.val; 
			root = root.leftKid; 
		} 
		return min; 
	} 

	public String tree() {
		return tree(0);
	}

	public String tree(int x) {
		char ch1, ch2;

		if (x % 3 == 0) {
			ch1 = '(';
			ch2 = ')';
		} else if (x % 3 == 1) {
			ch1 = '[';
			ch2 = ']';
		} else {
			ch1 = '{';
			ch2 = '}';
		}
		if (leftKid == null && rightKid == null) {
			return "" + val;
		} else {
			if (rightKid == null)
				return (val + ":" + ch1 + leftKid.tree(x + 1) + ", " + rightKid + ch2);
			else if (leftKid == null)
				return (val + ":" + ch1 + leftKid + ", " + rightKid.tree(x + 1) + ch2);
			else
				return (val + ":" + ch1 + leftKid.tree(x + 1) + ", " + rightKid.tree(x + 1) + ch2);
		}
	}

	@Override
	public String toString() {
		String left, right;
		if (leftKid != null) {
			left = "" + leftKid.val;
		} else {
			left = null;
		}
		if (rightKid != null) {
			right = "" + rightKid.val;
		} else {
			right = null;
		}
		return ("val: " + val + ", left: " + left + ", right: " + right);

	}

}
