package doublyLinkedRingList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		
		list.print();
		
		System.out.println(list.search(5));
		
		list.delete(4);
		list.print();
	}

}
