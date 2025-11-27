package question3;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new List();
//		list.addFirst(10);
//		list.addFirst(20);
//		list.addFirst(30);
//		list.addFirst(40);
//		
//		list.display();
//		
//		list.addLast(50);
//		list.addLast(60);
//		list.addLast(70);
//		list.addLast(80);
//		list.display();
//		
//		list.deleteFirst();
//		list.deleteFirst();
//		list.deleteFirst();
//		list.deleteFirst();
//		list.display();
//		list.deleteFirst();
//		list.deleteFirst();
//		list.deleteFirst();
//		list.deleteFirst();
//		list.display();
//		list.deleteFirst();
//		list.display();
//		
//		System.out.println("Delete operations:");
//		list.deleteLast();
//		list.display();
//		list.deleteLast();
//		list.deleteLast();
//		list.deleteLast();
//		list.display();
//		list.deleteLast();
//		list.display();
		list.addPosition(1, 0);
		list.addPosition(2, 1);
		list.addPosition(3, 2);
		list.addPosition(4, 3);
		list.display();
		list.deletePosition(1);
		list.display();
		list.deletePosition(2);
		list.display();
		list.deletePosition(2);
		list.display();
		list.deletePosition(1);
		list.display();
		
	}

}
