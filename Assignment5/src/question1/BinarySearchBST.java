package question1;

public class BinarySearchBST {

	public static void main(String[] args) {
		BST bst = new BST();
		
		bst.add(5);
		bst.add(6);
		bst.add(3);
		bst.add(4);
		bst.add(7);
		bst.add(2);
		bst.add(8);
		bst.add(1);
		
		bst.inorder();
		
		System.out.println(bst.binarySearch(8));
	}
}
