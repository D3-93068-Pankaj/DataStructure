package question1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new List();
		
		list.insertNodeBefore(0, 1);
		list.display();
		list.addFirst(0);
//		list.addFirst(1);
//		list.addFirst(2);
//		list.addFirst(3);
//		list.display();
//		
//		list.insertNodeBefore(4, 3);
//		list.display();
//		list.insertNodeBefore(5, 0);
//		list.display();
//		list.insertNodeBefore(6, 1);
//		list.display();
		
		list.insertNodeAfter(8, 4);
		list.display();
		list.insertNodeAfter(9, 0);
		list.display();
	}

}
