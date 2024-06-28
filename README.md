# InterfazEstructura

* Ariana Sophía Sarango Tandazo.

**Ciclo:**

* Segundo "A"

## ACD - ESTRUCTURA DE DATOS


Generar un diagrama UML y código en Java con las siguientes características:


* Arboles binarios (AVL y Rojo Negro).
* Grafo.
* Listas enlazadas.
* Listas doblemente enlazadas.
* Listas circular.
* Listas doblemente circulares.
* En el caso de los arboles genere recorridos en orden, postorden y preorden, en todas las demas presente de acuerdo al orden de inserción.
* En todas las estructuras se pueda agregar, insertar y eliminar.

## INTERFAZ ESTRUCTURA DE DATOS

Generar y diseñar una interfaz de escritorio que soporte las estructuras de datos que ha realizado.


## Diagrama UML

![DiagramaUML.png](DiagramaUML.png)

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

### **Enumeraciones**

* **Color:** Define los colores ROJO y NEGRO.

### **Clases Abstractas**


* **Nodo:** Clase abstracta para los nodos, con atributos dato y color.
* **Lista:** Clase abstracta para las listas, con atributos cabeza, cola y tamaño.
* **EstructuraDato:** Clase abstracta para las estructuras de datos con métodos agregar, eliminar e insertar.
* **ArbolBinario:** Clase abstracta para los árboles binarios con varios métodos para operaciones de árbol.
* **Grafo:** Clase abstracta para los grafos, con listas de nodos y aristas.

### **Clases Concretas**

#### _Nodos_

* **NodoSimple:** Extiende Nodo y añade el atributo siguiente.
* **NodoDoble:** Extiende Nodo y añade los atributos siguiente y anterior.

#### _Listas_

* **ListaEnlazadaSimple:** Extiende Lista con implementación específica para listas enlazadas simples.
* **ListaDobleEnlazada:** Extiende Lista con implementación específica para listas doblemente enlazadas.
* **ListaCircularSimple:** Extiende ListaEnlazadaSimple para listas circulares simples.
* **ListaDobleCircular:** Extiende ListaDobleEnlazada para listas doblemente circulares.

#### _Árboles_

* **ArbolAVL:** Extiende ArbolBinario con implementación específica para árboles AVL.
* **ArbolRojoNegro:** Extiende ArbolBinario con implementación específica para árboles Rojo-Negro.

#### _Grafo_

* **Arista:** Define una arista con nodos.


Referencias


G. P. M. “Las principales estructuras de datos que deberías saber para tu próxima entrevista de programación”. freeCodeCamp.org. Accedido el 19 de junio de 2024. [En línea]. Disponible: https://www.freecodecamp.org/espanol/news/las-principales-estructuras-de-datos-que-deberias-saber-para-tu-proxima-entrevista-de-programacion/


“DSTool: Herramienta para la programación con estructuras de datos”. HCI-RG: welcome - home. Accedido el 19 de junio de 2024. [En línea]. Disponible: https://www.hci.uniovi.es/Products/DSTool/avl/avl-operaciones.html


Sitio Web Docente del Prof. Edgardo AdriÃ¡n Franco MartÃ­nez en el IPN. Accedido el 19 de junio de 2024. [En línea]. Disponible: https://docencia.eafranco.com/materiales/estructurasdedatos/12/Tema12.pdf