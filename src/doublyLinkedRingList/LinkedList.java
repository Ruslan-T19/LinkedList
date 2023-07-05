package doublyLinkedRingList;

public class LinkedList {

	Node tail;
	private int size = 0;
	
	public void add(int value) {
	
		if(tail == null) {
			Node nod = new Node(value);
			tail = nod;
			tail.head = nod;
			size++;
		}else {
			Node nod = new Node(value);
			tail.next = nod;
			nod.head = tail.head;
			nod.previus = tail;
			tail.head = null;
			tail = nod;
			size++;
		}
	}
	
	public void delete(int value) {
		
		if(tail.value == value && tail.next == null) {
			tail = null;
		}else if(tail.value == value) {
		//	tail.previus.next = ta
		}
		
	}
	
	
	public void print() {
		if(tail == null) {
			System.out.println("list null");
		}else {
			Node nod = tail.head;
			while(nod.next != null) {
				System.out.println(nod.value);
				System.out.println("TAIL: " + tail);

				System.out.println("HEAD: " + nod.head);
				System.out.println("NOD: " + nod);
				System.out.println("NEXT: " + nod.next);
				System.out.println("PREVIOS: " + nod.previus);

				nod = nod.next;
			}
			System.out.println(nod.value);
			System.out.println("HEAD: " + nod.head);

			System.out.println("NEXT: " + nod.next);
			System.out.println("PREVIOS: " + nod.previus);
		}
	}
	
	
	
	class Node{
		
		private int value;
		private Node head;
		private Node next;
		private Node previus;
		
		public Node() {}
		
		public Node(int value) {
			this.value = value;
		}
	}
}
