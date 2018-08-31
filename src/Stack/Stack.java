package Stack;


public class Stack<T> {
	
	private Node head;
	
	void push(T num){
		if(head==null){
			Node node = new Node();
			node.data = num;
			node.next = null;
			head = node;
		}else{
			Node node = new Node();
			node.data = num;
			node.next = head;
			head = node;
		}
	}
	
	void pop(){
		if(head!=null)
			head = head.next;
		else
			System.out.println("Stack is empty");
	}
	
	T peek(){
		return head.data;
	}
	
	boolean isEmpty(){
		return head==null;
	}
	
	void printStack(){
		Node cur = head;
		while(cur!=null){
			System.out.println(cur.data);
			cur = cur.next;
		}
	}
	
	class Node{
		T data;
		Node next;
	}

}