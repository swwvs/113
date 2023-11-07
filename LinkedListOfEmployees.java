package lab_10;

public class LinkedListOfEmployees {
private Node head;

public LinkedListOfEmployees() {
	head=null;
}
public void insertAtEnd(Employee e) {
	Node newNode = new Node(e);
	if (head==null) {
		head=newNode;
		return;
	}
	Node current =head;
	while (current.getNext()!=null)
		current=current.getNext();
	current.setNext(newNode);
	
}
public void insertAtfront(Employee e) {
	Node newNode = new Node(e);
	newNode.setNext(head);
	head=newNode;
}
public int countEmployee(String g) {
	int counter=0;
	Node current =head;
	while (current.getNext()!=null) {
		if (current.getData().getGender().equalsIgnoreCase(g))
			counter++;
		current = current.getNext();}
	return counter;
	
	
	
}
}
