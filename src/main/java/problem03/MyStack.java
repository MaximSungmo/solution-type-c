package problem03;

import java.util.Arrays;

public class MyStack {
	
	private String[] buffer;
	int top;
	int size;
	
	public MyStack( int size ) {
		top=-1;
		buffer = new String[size];
		this.size=size;
	}
	
	public boolean isFull() {
		return (top+1)==buffer.length;
	}
	
	public void push(String item) {
		if(top==size-1) {
			size++;
			buffer = Arrays.copyOf(buffer, size);
		}
		buffer[++top] = item;
	}

	public String pop() {
		if(!isEmpty()) {
			return buffer[top--];
		}	
		return null;
	}

	public boolean isEmpty() {
		
		return top==-1;
	}
	
	public int size() {
		return size;
	}
}