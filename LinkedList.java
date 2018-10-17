package BFS;

public class LinkedList {
	private Node header;
	public LinkedList(String val){
		header= new Node(val, null,null);
	}
	public boolean isEmpty() {
		if(header!=null)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public void insertAtFront (String value){
		Node temp = new Node(value,null,null);
		if(header.getPrevious() != getClearest()){
			header.setPrevious(getClearest());
		}if(header.getNext() != null){
			temp.setNext(header.getNext());
			temp.getNext().setPrevious(temp);
		}
		header.setNext(temp);
	}
	
	public void insertAtEnd (String value){
		Node temp = new Node(value,getClearest(),null);
		getClearest().setNext(temp);
	}

	public void insertAfterValue (String j, String value){
		Node temp = header;
		while(temp.getNext()!=null)
		{
			if(temp.getValue()==j)
			{
			Node kanew = new Node(value,null,null);
			kanew.setPrevious(temp);
			kanew.setNext(temp.getNext());
			temp.setNext(kanew);
			kanew.getNext().setPrevious(kanew);
			break;
			}
			else
			{
				temp=temp.getNext();
			}
		}
	}public void insertBeforeValue (String j, String value){
		Node temp = header;
		while(temp.getNext()!=null)
		{
			if(temp.getNext().getValue()==j)
			{
			Node kanew = new Node(value,null,null);
			kanew.setPrevious(temp);
			kanew.setNext(temp.getNext());
			temp.setNext(kanew);
			kanew.getNext().setPrevious(kanew);
			break;
			}
			else
			{
				temp=temp.getNext();
			}
		}
	} 

	
	
	public void deleteFromFront (){
		Node Mew = header.getNext().getNext();
		Node old = header.getNext();
		if(header.getNext()!=null)
		header.setNext(Mew);
		else {
		old.setNext(null);
		Mew.setPrevious(null);
		}
	}
	
	public void deleteFromEnd ()
	{
		Node newend = getClearest().getPrevious();
		newend.setNext(null);
	}
	
	public void deleteValue (String val){
		Node temp = header;
		while(temp.getNext() != null||temp.getPrevious()!=null)
		{
			if(temp.getValue() == val){
				if(temp.getPrevious() != null)
				{
					if(temp.getNext() != null){
						
						temp.getPrevious().setNext(temp.getNext());
						temp.getNext().setPrevious(temp.getPrevious());
						temp.setNext(null);
						temp.setPrevious(null);
						break;
					}
					else
					{
						deleteFromEnd();
						break;
					}
					
				}
				else
				{
					deleteFromFront();
					break;
				}
			}
			temp = temp.getNext();
		}
	}
	public Node getClearest(){
		Node temp = header;
		while(temp.getNext() != null){
			temp = temp.getNext();
		}
		return temp;
	}
	public String getfirst() {
		if(header.getNext()==null) {
			return null;
		}
		else {
			return header.getNext().getValue();
		}
	}
	public String toString(){
		Node curnode = header.getNext();
		while(curnode.getNext()!= null)
		{
			System.out.print(curnode.getValue()+" ");
			curnode = curnode.getNext();
		}
		System.out.println(curnode.getValue());
		return "";	
	}
	
}