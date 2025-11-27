package question3;

public class LevelOfNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST bst = new BST();
		bst.addElement(5);
		bst.addElement(4);
		bst.addElement(7);
		bst.addElement(6);
		bst.addElement(3);
		bst.addElement(1);
		bst.addElement(8);
		bst.addElement(2);
		
		bst.inorder();
		int data = 8;
		System.out.println("The level of "+data+" is "+bst.findLevel(data));
	}

}
