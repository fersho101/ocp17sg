* To create an instance of a class -> Park p = new Park();

Constructor
- There's no return type.
- Match tha name of tha class.

* constructor's purpose -> initialize fields.
* if there's not a constructor -> the compiler will suply a don nothing default constructor.
...
...


*** Initializing Variables ***

- local variable -> variable difinida dentro de un constructor, metodo o initializerblock.
- final keyword -> es equivalente a declarar una constante. 
  ej:
    final int y = 10; 
    y = 11; //No compila.
    final int[] x = new int[10];
    x = null; //No compila.

- local variable no tiene valor por defecto. Deben inicializarse antes de usarse.
- instance variable -> varable definida dentro de un objeto.
- class variable -> variable definda a nivel de clase y es compartida a todas la instacias de la clase. Tiene la palabra "static".
    - no es requerido iniicalizarse. tiene valor por defecto. 0 para valores numericos, null para objetos, false para boolean.

* Var 
- el compilador asiga el tipo.
- deben declararse e inicializarse en la misma linea.
- solo para locals varibles, no para instance varibles.





