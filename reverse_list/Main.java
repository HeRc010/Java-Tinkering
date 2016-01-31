import java.io.*;

class Node {
    int data;
    Node next;
}

class List {
    Node head;
}

class Reverse {
    public static void reverseList(List list) {
	if (list == null) return;

	Node prev = null, current = list.head, next = null;
	while (current != null) {
	    next = current.next;
	    current.next = prev;

	    prev = current;
	    current = next;
	}

	list.head = prev;
    }
}

public class Main {
    private static void printList(List list) {
	if (list == null) return;
	
        Node next = list.head;
	while (next != null) {
	    System.out.println(next.data);
	    next = next.next;
	}
    }
    
    public static void main(String[] args) {
	System.out.println("Test List:");

	List list = new List();
	list.head = new Node();
	list.head.data = 1;
	
	list.head.next = new Node();
	list.head.next.data = 2;

	list.head.next.next = new Node();
	list.head.next.next.data = 3;

	printList(list);

	Reverse.reverseList(list);

	printList(list);
    }
}
