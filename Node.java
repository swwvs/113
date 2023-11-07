package lab_10;

public class Node {
private Employee data;
private Node next;
public Node(Employee e) {
	data=e;
	next=null;
}
public Employee getData() {
	return data;
}
public void setData(Employee data) {
	this.data = data;
}
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}


}
