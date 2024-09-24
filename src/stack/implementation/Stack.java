package stack.implementation;


public class Stack {
	
	LinkedListNode head;
	int size = 0;
	
	public void push(int a) {
		LinkedListNode ln = new LinkedListNode(a);
		if(head == null) {
			head = ln;
		}else {
			LinkedListNode temp = head;
			ln.next = temp;
			head = ln;
		}
		size++;
	}
	
	public int pop() {
		LinkedListNode temp = head;
		int s = 0;
		if(head == null) {
			System.out.println("No node to remove");
		}
		else if(temp.next == null) {
			s = head.data;
			head = null;
			size--;
		}
		else {
			s = head.data;
			head = temp.next;
			size--;
		}
		return s;
	}
	
	public int top() {
		LinkedListNode temp = head;
		if(head == null) {
			return -1;
		}else if(temp.next == null){
			return temp.data;
		}else {
			while(temp.next != null) {
				temp = temp.next;
			}
			return temp.data;
		}
	}
	
	public boolean isEmpty() {
		boolean flag = false;
		if(head == null) {
			System.out.print("Stack is empty");
			flag = true;
			return flag;
		}
		return flag;
	}
	
	public int size() {
		return size;	
	}

}
