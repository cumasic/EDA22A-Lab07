public class MyHashTable<E,T> implements HashTable<E,T> {
    private Node<E,T> first;
	
	public MyHashTable() {
		this.first = null;
	}
    public int size() {
        Node<E,T> aux = this.first;
    	int tamaño=0;
    	if(isEmpty())
    		return tamaño;
    	for(tamaño=1 ; aux.getNext() != null;tamaño++) 
    		aux = aux.getNext();
    	return tamaño;
    }
    public boolean isEmpty() {
    }
    public boolean containsKey(E key){
    }
    public boolean containsValue(T value){
    }
    public T get(E key) throws NullPointerException{
    }
    public T put(E key, T value){
    }
    public T remove(E key) {
    }
    public void clear() {
    }
    public int hashCode() {
    }
    public String toString() {
    }
}
