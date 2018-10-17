package BFS;

import java.util.Arrays;

public class Queue {
	
	private String[] arr = new String[10];
	private int front = 0, back = -1;
	
	
	public void enQueue(String value){
		back++;
		resize();
		arr[back] = value;
	}
	
	public String deQueue(){
		int temp = front;
		front++;
		return arr[temp];
	}
	
	public boolean isEmpty(){
		if(back < 0){
			return true;
		}
		else
			return false;
	}
	
	public String toString(){
		String temp = "";
		for(int y = front; y <= back; y++){
			temp += arr[y] + " ";
		}
		return temp;
	}
	
	private void resize(){
		arr = Arrays.copyOf(arr, back + 1);
	} 
}

