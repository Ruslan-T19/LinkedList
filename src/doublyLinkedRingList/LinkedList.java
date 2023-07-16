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
		
		if(tail.value == value && tail.head == null) {
			tail = null;
			size--;
		}else if(tail.value == value && tail.head != null) {
			Node nod = tail.previus;
			nod.head = tail.head;
			tail.previus = null;
			nod.next = null;
			size--;
		}else if(tail.head.value == value) {
			Node nod = tail.head;
			tail.head = nod.next;
			nod.next.previus = null;
			nod.next = null;
			size--;
		}else {
			Node nod = tail.head;
			while(nod.head == null) {
				
				if(nod.value == value) {
					
					nod.next.previus = nod.previus;
					nod.previus.next = nod.next;
					nod.next = null;
					nod.previus = null;
					size--;
                    break;
				}
				nod = nod.next;
			}
		}
		
	}
	
	public boolean search(int value) {
		
		boolean examination = false;
		
		if(tail.value == value) {
			examination = true;
		}else {
			Node nod = tail.head;
			while(nod.next != null) {
				
				if(nod.value == value) {
					examination = true;
                    break;
				}
				nod = nod.next;
			}
		}
		return examination;
	}
	
	public void size() {
		System.out.println("Lengt list: " + size);
	}
	
	
	public void print() {
		if(tail == null) {
			System.out.println("list null");
		}else {
			Node nod = tail.head;
			while(nod.next != null) {
				System.out.println(nod.value);

				nod = nod.next;
			}
			System.out.println(nod.value);	
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
