package question1;

public class BST {

	static class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
		}
	}
	
	private Node root;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
			return;
		}
		
		add(newNode,root);
	}
	
	private void add(Node newNode, Node root) {
		if(root == null) {
			return;
		}
		if(root.data >= newNode.data) {
			if(root.left == null) {
				root.left = newNode;
			}else {
				add(newNode,root.left);
			}
		}else {
			if(root.right == null) {
				root.right = newNode;
			}else {
				add(newNode, root.right);
			}
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
	
	
	//Binary Search in BinarySearchTree
	public boolean binarySearch(int data) {
		return binarySearch(data, root);
	}
	
	private boolean binarySearch(int data, Node root) {
		if(root == null) {
			return false;
		}
		
		if(root.data == data) {
			return true;
		}
		
		if(root.data >= data) {
			return binarySearch(data, root.left);
		}else {
			return binarySearch(data, root.right);
		}
	}
}
