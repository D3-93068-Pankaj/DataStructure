package question3;

public class BST {

	static class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
		}
	}
	
	Node root;
	
	public void addElement(int data) {
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
		if(parent.data >= data) {
			parent.left = newNode;
		}else {
			parent.right = newNode;
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
	
	private Node binarySearch(int data, Node root) {
		if(root == null) {
			return null;
		}
		if(root.data == data) {
			return root;
		}
		if(root.data >= data) {
			return binarySearch(data, root.left);
		}else {
			return binarySearch(data, root.right);
		}
	}
	
	public int findLevel(int data) {
		Node n = binarySearch(data, root);
		if(n == null) {
			return -1;
		}
		return findLevel(n);
	}
	
	private int findLevel(Node root) {
		if(root == null) {
			return -1;
		}
		int leftLevel = findLevel(root.left);
		int rightLevel = findLevel(root.right);
		
		return leftLevel > rightLevel ? leftLevel+1 : rightLevel+1;
	}
}
