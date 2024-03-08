PrecisionOExactitud:
El programa inicia declarando los variables que se van a utilizar. Esto incluye el Scanner que se va a utilizar para leer los datos que el usuario ingresara. También incluye el arreglo de números para calcular la precisión y exactitud. 
Después de esto, le pedimos al usuario que ingrese el valor real, con el que compararemos los valores dados por el usuario. Estos datos se reciben con una for loop, la cual le asigna un valor a cada espacio dentro del arreglo. 
Después de esto, ya tenemos que verificar la exactitud.
La exactitud se logra calcular mediante otra for loop, la cual compara los valores del arreglo, con el valor real. 
Antes de iniciar la for loop, se declara un booleano con valor falso, cuando se chequen todos los valores y se cumpla la condición que todos estén dentro del rango, entonces se declara como verdadero. 
Verifica que cada valor este dentro de 0.1 unidades. En dado caso que no se cumpla esto, se terminara la for loop, y el valor del booleano sea falso. 
Después hay un if que verifica que el booleano sea verdadero, en dado caso que dirá que el arreglo de datos es preciso. Si es falso, entonces se imprimirá que es impreciso.
La precisión se calcula de manera similar, en que se utiliza el mismo sistema de fors, solo que esta vez tenemos que incluir otro for, para comparar cada valor del arreglo. 
Si llega a haber un valor que no este dentro de 0.1 unidades, entonces se termina la for loop y tenemos que no son precisos. Pero si se cumplen todas las condiciones, entonces si son precisos.

PuntoFijo:
El programa inicia con la importación de una libreria la cual permite que el usuario ingrese una funcion a traves de texto. Con esto continuamos a declarar los variables que se utilizaran. 
Ya con estos definidos, le pedimos al usuario que ingrese su funcion. Esta se convierte a algo que podemos calcular con la libreria, solo le tenemos que indicar cual va a ser el variable en la ecuacion y su valor.
Despues le pedimos al usuario la funcion g(x). Con ambas funciones definidas, ahora le pediremos al usuario el primer valor y el error deseado. Con esto podemos continuar al metodo Punto Fijo.
Ahora empezaremos con un ciclo for, el cual se utiliza para las iteraciones del metodo. Dentro del ciclo, el primer ciclo sera diferente al resto, ya que no se puede calcular el error en la primera iteración.
Con la segunda función g(x), podemos reemplazar el valor de x dado por el usuario y encontrar la posición estimada de la raiz. En la primera iteración. Esto sera lo único que se hace.
Despues de la primera iteración, se hara casi lo mismo, salvo por la declaración de otro variable y la igualación a la raiz anterior, con esto, se puede calcular el error utilizando la formula (x1-x0)/x1.
Con este valor del error, tambien tenemos una condición, la cual chequa que el error calculado por la función sea menor que el error dado por el usuario.
Cuando se cumple esta condición, tenemos que el programa imprimira los datos de la ejecucioón, como el número de iteraciones y el error, junto con la raiz aproximada de f(x).
