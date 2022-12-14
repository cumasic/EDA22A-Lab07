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
        Node<E,T> aux = this.first;
		while(aux != null && !aux.getKey().equals(key)) {
			aux = aux.getNext();
		}
		if(aux != null ) {
			if(aux.getValue().equals(null))
				throw new NullPointerException("No existe valor en la clave");
			else
				return aux.getValue();
		}
		else 
			throw new NullPointerException("No existe dicha clave");
    }
    public T put(E key, T value){
        Node<E,T> aux = this.first;
    	if(isEmpty()) {
    		this.first = new Node<E,T>(key,value,this.first);
    		aux = this.first;
    		return null;
    	}
		else {
			for(;aux.getNext() != null; aux = aux.getNext()) {
				if(aux.getKey() == key){
					if(aux.getValue() == null) {
						return null;
					}
					else {
						T valorAntiguo = aux.getValue();
						aux.setValue(value);
		    			return valorAntiguo;
					}
	    		}
			}
			aux.setNext(new Node<E,T>(key,value));
			return null;
		}
    }
    public T remove(E key) throws NullPointerException{
        Node<E,T> aux = this.first;
		if(!isEmpty()) {
			if(aux.getKey().equals(key)) {
				T valorAntiguo = aux.getValue();
				aux.setKey(aux.getNext().getKey());
				aux.setValue(aux.getNext().getValue());
				aux.setNext(aux.getNext().getNext());
				return valorAntiguo;
			}
			else {
				while(aux.getNext() != null && !aux.getNext().getKey().equals(key)) {
					aux = aux.getNext();
				}
				if(aux.getNext() != null) {
					T valorAntiguo = aux.getNext().getValue();
					aux.setNext(aux.getNext().getNext());
					return valorAntiguo;
				}
				else
					throw new NullPointerException("No existe dicha clave");
			}
		}
		else
			throw new NullPointerException("La tabla esta vacía");
    }
    public void clear() {
        this.first = null;
    }
    public int hashCode() {
        Node<E,T> aux = this.first;
    	int codigo = 0;
    	while(aux != null) { 
    		codigo += (int)aux.getKey();
    		aux = aux.getNext();
    	}
    	return codigo;
    }
    public String toString() {
        Node<E,T> aux = this.first;
    	String tabla="[ ";
		while(aux != null) {
			tabla += aux.getKey() + " = " + aux.getValue()+", ";
			aux = aux.getNext();
		}
		tabla += "]";
		return tabla;
    }
}
