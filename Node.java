package BFS;

public class Node {
private String value;
private Node next;
private Node previous;
	public Node(String v, Node p,Node n)
	{
		value=v;
		next=n;
		previous=p;
	}
	public Node getNext()
	{
		return next;
	}
	public Node getPrevious()
	{
		return previous;
	}
	public void setNext(Node n) {
		next = n;
	}
	public void setPrevious(Node p) {
		previous = p;
	}
	public String getValue() {
		return value;
	}
}