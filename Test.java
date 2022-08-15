public class Test {
    public static void main(String[] args) {
        MyHashTable<Integer,String> Prueba = new MyHashTable<Integer,String>();
		//Método put
        Prueba.put(12397977, "Juan");
		Prueba.put(1, "Proyecto1");
		Prueba.put(12397, "Proyecto2445");
		Prueba.put(12397, "Trabajo321");
		Prueba.put(14257, "Trabajofinal");
		Prueba.put(125778, "Exposición");
		//Método toString
        System.out.println("Método toString: "+Prueba);
		//Método Remove
        Prueba.remove(1);
		System.out.println("Método remove: "+Prueba);
        //Método size
		System.out.println("Método size"+Prueba.size());
        //Método containsKey
		System.out.println("Método containsKey: "+Prueba.containsKey(1234));
        //Método containsValue
		System.out.println("Método containsValue: "+Prueba.containsValue("Proyecto1"));
        //Método get
		System.out.println("Método get: "+Prueba.get(12397));
        //Método hashCode
		System.out.println(Prueba.hashCode());
        //Método clear
        Prueba.clear();
        System.out.println("Método clear: "+Prueba);
    }
}
