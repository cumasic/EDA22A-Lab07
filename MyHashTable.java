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
        return this.first == null;
    }
    public boolean containsKey(E key){
        Node<E,T> aux = this.first;
		if(aux.getKey() == key)
			return true;
		else {
			while(aux.getNext() != null && aux.getKey()!=key) {
				aux = aux.getNext();
			}
			if(aux.getKey()==key)
				return true;
			else
				return false;
    }
    public boolean containsValue(T value){
        Node<E,T> aux = this.first;
		if(aux.getValue() == value) {
			return true;
		}
		else {
			while(aux.getNext() != null && aux.getNext().getValue() != value) {
				aux = aux.getNext();
			}
			if(aux.getValue() == value)
				return true;
			else
				return false;
		}
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
