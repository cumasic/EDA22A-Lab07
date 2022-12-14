<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Laboratorio de Estructura de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Hashing</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>07</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN</td><td>14-Ago-2022</td><td colspan="2">HORA DE PRESENTACIÓN: </td><td>11:59 pm</td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Umasi Cariapaza, Carlos Daniel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</tdbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">SOLUCIÓN Y RESULTADOS</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS<br>
            Para la solución del ejercicio de HashTable se utilizaron varios métodos los cuales permitieron la correcta solución del ejercicio los cuales fueron:<br>
            -El tamaño de la tabla: size()<br>
            Este método permite saber cuán grande puede llegar a ser la tabla por los elementos clave-valor que lo componen:<br>
<pre>
for(tamaño=1 ; aux.getNext() != null; tamaño++) 
    aux = aux.getNext();</pre>
            <p>Usando un bucle para su respectiva realización</p>
            -Saber si está vacío: isEmpty()<br>
            El método indica si está lleno o vacío la tabla.<br>
            -Encontrar una key: containsKey(E key)<br>
            El método encuentra una key si está en la tabla de lo contrario no lo hará.<br>
<pre>
while(aux.getNext() != null && aux.getKey()!=key) {
	aux = aux.getNext();
}
if(aux.getKey()==key)
	return true;
else
	return false;</pre>
            <p>Usando un bucle y condicionales para su realización de esta búsqueda.<p>
            <p>-Encontrar un valor: containsValue(T value)<br>
            El método encuentra un valor si está en la tabla, de lo contrario no lo hará.<br>
<pre>
while(aux.getNext() != null && aux.getNext().getValue() != value) {
	aux = aux.getNext();
}
if(aux.getValue() == value)
	return true;
else
	return false;</pre>
            <p>Usando un bucle y condicionales para su realización de esta búsqueda</p>
            <p>-Buscar un valor  por medio de su clave: get(E key)<br>
            Este método busca una valor por su clave dando el valor si se llega encontrar en la tabla.<br>
<pre>
while(aux != null && !aux.getKey().equals(key)) 
	aux = aux.getNext();
if(aux != null ) {
	if(aux.getValue().equals(null))
		throw new NullPointerException("No existe valor en la clave");
	else
		return aux.getValue();
	}
else 
	throw new NullPointerException("No existe dicha clave");</pre>
            <p>El cual verifica clave por clave hasta encontrar alguna coincidencia de lo contrario mostrará error.</p>
            <p>-Añadir un nuevo elemento: put(E key, T value)<br>
            Este método añade un nuevo elemento a la tabla.
<pre>
for(;aux.getNext() != null; aux = aux.getNext()) 
aux.setNext(new Node<E,T>(key,value));</pre>
            <p>Con un bucle y un setNext enlaza un nuevo elemento a la tabla Hash.</p>
            <p>-Remover elementos: remove(E key)<br>
            Este método remueve elementos de una determinada clave.<br>
<pre>
while(aux.getNext() != null && !aux.getNext().getKey().equals(key)) {
	aux = aux.getNext();
}
if(aux.getNext() != null) {
	T valorAntiguo = aux.getNext().getValue();
	aux.setNext(aux.getNext().getNext());
	return valorAntiguo;
}</pre>
            <p>Utiliza un bucle para reconocer la clave y de acuerdo a eso eliminar el elemento.</p>
            <p>-Limpiar la tabla: clear()
            Este método borra toda la tabla.<br></p>
            <p>-Generar un HashCode: hashCode()<br>
            Este método crea un hashCode en base a las claves las cuales suma y genera este código.</p>
            <p>-Un toString: toString()<br>
            Método utilizado para leer correctamente la tabla hash. </p>
            <p>La forma en cómo utilizar este código es corriendo la clase Test la cual tiene los ejemplos de la funcionalidad de cada método.</p>
            </td>
        </tr>
        <tr>
            <td>
            III. CONCLUSIONES
            <ul>
                <li>Es interesante la funcionalidad de la tabla hash pues permite un mejor orden de la información al ser de clave-valor.
                <li>Además permite un gran variedad de usos pues al tener una única clave puedes utilizarlo para almacenar diversos elementos y modificarlos a través de esa clave.
                <li>Se podría mejor la forma en la que se buscan las claves pues al hacerlo lineal se pierde muchos recursos y tiempo.
            </ul>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">RETROALIMENTACIÓN GENERAL</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">REFERENCIAS Y BIBLIOGRAFÍA<br>
            </th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            <p>-Proyectos de tecnología con arduino, 2022. Manejo de ramas de Git, en vs code . (branch). [video] Available at: https://www.youtube.com/watch?v=k8UlMFtNDpE.</p>
            <p>-Weiss M., Data Structures & Problem Solving Using Java, 2010, Addison-Wesley.</p>
            <p>-https://www.cpp.edu/~ftang/courses/CS240/lectures/hashing.html<br></p>
            </td>
        </tr>
    </tbody>
</table>
