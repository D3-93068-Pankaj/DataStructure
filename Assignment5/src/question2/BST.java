package question2;

public class BST {

	static class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
		}
	}
	
	Node root;
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(root == null) {
			root = newNode;
			return;
		}
		
		Node trav = root;
		Node parent = null;
		while(trav != null) {
			if(trav.data >= data) {
				parent = trav;
				trav = trav.left;
			}else {
				parent = trav;
				trav = trav.right;
			}
		}
		if(parent.data < data) {
			parent.right = newNode;
		}else {
			parent.left = newNode;
		}
	}
	
	public void inorder() {
		inorder(root);
		System.out.println();
	}
	
	private void inorder(Node root) {
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public int findSuccessorNode(int data) {
		boolean isPresent = binarySearch(data, root);
		if(isPresent)
			return findSuccessorNode(data, root);
		else
			return -1;
	}
	
	private boolean binarySearch(int data, Node root) {
		if(root == null) {
			return false;
		}
		if(root.data == data) {
			return true;
		}
		if(root.data > data) {
			return binarySearch(data, root.left);
		}else {
			return binarySearch(data, root.right);
		}
	}
	
	private int findSuccessorNode(int data, Node root) {
		if(root == null) {
			return -1;
		}
		
		
		int val1 = findSuccessorNode(data, root.left);
		if(val1 != -1) return val1;
		if(root.data > data) {
			return root.data;
		}
		int val2 = findSuccessorNode(data, root.right);
		
		return val2;
	}
}
