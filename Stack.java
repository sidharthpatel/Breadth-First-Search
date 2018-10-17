package BFS;

import java.util.Arrays;


public class Stack {
	
	private String[] arr = new String[1];
	private int top = -1;
	
	public void push(String a){
		top++;
		resize();
		arr[top] = a;
	}
	
	public String pop(){
		int x = top;
		top--;
		return arr[x];
	}
	
	public String peek(){
		return arr[top];
	}
	
	public String toString(){
		String temp = "";
		
		for(int x = 0; x <= top; x++){
			temp += arr[x] + " ";
		}
		return temp;
	}
	
	public boolean isEmpty(){
		if(top == -1)
			return true;
		else 
			return false;
	}
	
	private void resize(){
		arr = Arrays.copyOf(arr, top + 1);
	}
}
