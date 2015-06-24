###Teoría de la Computación y Sistemas Formales 2
##Trabajo de aplicación – Implementación de un lenguaje formal

##Planteo 1
El lenguaje que se manejará en este trabajo es un formato de datos llamado SXF1. El lenguaje se compone de las siguientes
expresiones: 

* Valores simples expresados con palabras reservadas:
  
  true false Valores booleanos.
  
  null Valor nulo o no definido.
  
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
