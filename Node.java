public class Node<E,T> {
	private E key;
	private T value;
	private Node<E,T> next;
	
	public Node(E key,T value,Node<E,T> next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}
	public Node(E key,T value) {
		this(key,value, null);
	}
	public E getKey() {
		return this.key;
	}
	public void setKey(E key) {
		this.key = key;
	}
	public T getValue() {
		return this.value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<E,T> getNext(){
		return this.next;
	}
	public void setNext(Node<E,T> next) {
		this.next = next;
	}
	public String toString() {
		return "(" +this.key.toString()+" = "+this.value.toString()+")";
	}
}
