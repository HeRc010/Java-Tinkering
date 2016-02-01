import java.io.*;

class Node {
      int data;
      Node next;
}

class List {
      Node head;
}

class ListUtils {
      public static void printList(List list) {
      	     if (list == null) return;

      	     Node nextNode = list.head;
	     while (nextNode != null) {
	     	   System.out.println(nextNode.data);
		   nextNode = nextNode.next;
	     }
      }
      
      public static Node getNthLast(List list, int n) {
      	     if (list == null) return null;

	     int count = 0;
      	     Node nextNode = list.head, nthLast = null;
	     while (nextNode != null) {
	     	   if (count < n) {
		      ++count;
		   } else {
		     if (nthLast == null) {
		     	nthLast = list.head;
		     } else {
		        nthLast = nthLast.next;
		     }
		   }

		   nextNode = nextNode.next;
	     }

	     return nthLast;
      }
}

public class Main {
       public static void main(String[] args) {
       	      System.out.println("Test Nth Last:");

	      List list = new List();
	      list.head = new Node();
	      list.head.data = 1;

	      list.head.next = new Node();
	      list.head.next.data = 2;

	      list.head.next.next = new Node();
	      list.head.next.next.data = 3;

	      list.head.next.next.next = new Node();
	      list.head.next.next.next.data = 4;

	      //ListUtils.printList(list);
	      System.out.println(ListUtils.getNthLast(list, 0).data);
	      System.out.println(ListUtils.getNthLast(list, 1).data);
	      System.out.println(ListUtils.getNthLast(list, 2).data);
	      System.out.println(ListUtils.getNthLast(list, 3).data);
	      System.out.println(ListUtils.getNthLast(list, 4).data);
	      System.out.println(ListUtils.getNthLast(list, 5).data);
       }
}
