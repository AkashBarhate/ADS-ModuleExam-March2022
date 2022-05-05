class Question2
{
   static Node head;
   static class Node{
     int data;
	 Node next;
   
   Node(int d){
    data=d;
	next =null;
   }
  }
  Node reverse(Node node){
    Node prev=null;
	Node current = node;
	Node next= null;
	while(current != null){
	
	next=current.next;
	current.next=prev;
	prev = current;
	current = next;
  }
  node= prev;
  return node;
 }
  void printList(Node node){
    while(node != null){
	System.out.println(node.data+" ");
	   node=node.next;
	}
  }
 public static void main(String[] args){
   Question2 q2 = new Question2();
   //test case 1:
    q2.head = new Node(1);
    q2.head.next = new Node(2);
    q2.head.next.next = new Node(3);
    q2.head.next.next.next = new Node(4);
    q2.head.next.next.next.next = new Node(5);
	/* test case 2
	q2.head = new Node(3);
    q2.head.next = new Node(4);
    q2.head.next.next = new Node(2);
    q2.head.next.next.next = new Node(5);
	*/
	
	System.out.println("given linked list: ");
	q2.printList(head);

	System.out.println("reverse linked list: ");
		head=q2.reverse(head);
		q2.printList(head);
 
 
 }



}
