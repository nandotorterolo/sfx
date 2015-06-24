###Teoría de la Computación y Sistemas Formales 2
##Trabajo de aplicación – Implementación de un lenguaje formal

##Planteo 1
El lenguaje que se manejará en este trabajo es un formato de datos llamado SXF1. El lenguaje se compone de las siguientes
expresiones: 

* Valores simples expresados con palabras reservadas:
  
  | Valores booleanos:|
  |-------------------|
  | true              |
  | false             |
  
  | Valor nulo o no definido.|
  |--------------------------|
  | null                     |
  
* Numerales enteros y de punto flotante, siguiendo las convenciones de Java:
  1 123 -4 +15 Enteros de 32 bits (int).
  
  0l -1234567879L Enteros de 64 bits (long).
  
  1.1 -1.23 +1e23 1d 0.1D Punto flotante de precisión doble (double).
  
  1f 0.010F -1e-2f Punto flotante de precisión simple (float).
  
  0xCAFE 0xC4F3L Enteros en notación hexadecimal (int y long).
  
* Cadenas de texto entre comillas dobles, siguiendo las convenciones de Java:
  
  "" "abcde" Cadenas de texto (String).
  
  "\n\\\u1234" Ejemplos de cadenas con escapes.
  
* Listas de valores entre paréntesis rectos (List):
  
  [] [1 2 3] [true "a" 1.1f] Listas simples.
  
  [[1 2 3] [4 [5] 6] ["hola"]] Listas anidadas.
  
* Diccionarios definidos con pares clave:valor entre llaves (Map).
  
  {} {1:"1" "2":2} Las claves y valores pueden ser de cualquier tipo.
  
  {"a": {"b":1 "c":[2]}} Diccionarios anidados.
  
* Llamadas a constructores previamente registrados (del tipo de corresponda).
  
  Date(2015 5 17) Construye una fecha (java.util.Date) para el año, mes y día dados.
  
  Class1("nombre") Habiendo registrado el constructor para Class1, se lo llama con el String "nombre" como argumento.

La implementación que se pretende de este lenguaje debe ser un componente al cual se le provee el código fuente, ya sea en un
String directamente o con la ruta al archivo donde se encuentra. El analizador sintáctico debe devolver la estructura de datos
resultante.
El componente debe permitir registrar constructores dando un identificador que se utilizará en el fuente y un método para
construir el objeto dada una lista de argumentos. 

##Planteo 2
La segunda versión del lenguaje se llama SXF2. Además de las construcciones anteriores, se agregan abreviaciones (conocidas
como azúcar sintáctico): 

* Notación abreviada de listas dentro de listas:
  [1 2 | 3 4 | 5 6] Equivalente a: [[1 2] [3 4] [5 6]].
  [1 2 | 3 | | 4 5 6] Equivalente a: [[1 2] [3] [] [4 5 6]].
  [| true |] Equivalente a: [[] [true] []].
  [|] Equivalente a: [[] []].
  [| [1 2] | 3] Equivalente a: [[] [[1 2]] [3]].

* Notación abreviada de listas de diccionarios:
  {"x":0 "y":1 | "x":1 "y":0 | "x":0 "y":1} Equivalente a: [{"x":0 "y":1} {"x":1 "y":0}
  {"x":0 "y":1}].
  {"a":true | "b":false "c":1.2} Equivalente a:
  [{"a":true} {"b":false "c":1.2}].
  {| "x":77 |} Equivalente a: [{} {"x":77} {}].

* Mapeo de constructor a lista:
  Class1[1 2 | 3 4 | 5 6]
  Class1[[1 2] [3 4] [5 6]]
  Class1()[1 2 | 3 4 | 5 6]

Equivalente a:
  [Class1(1 2) Class1(3 4) Class1(5 6)].
  Class2["a" 7 0 | "a" 1.1]
  Class2("a")[7 0 | 1.1]
  Equivalente a:
  [Class2("a" 7 0) Class2("a" 1.1)]. 

El componente implementado para la versión anterior se debe extender con las nuevas construcciones. 
