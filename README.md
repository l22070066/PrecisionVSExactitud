PrecisionOExactitud:
El programa inicia declarando los variables que se van a utilizar. Esto incluye el Scanner que se va a utilizar para leer los datos que el usuario ingresara. También incluye el arreglo de números para calcular la precisión y exactitud. Después de esto, le pedimos al usuario que ingrese el valor real, con el que compararemos los valores dados por el usuario. Estos datos se reciben con una for loop, la cual le asigna un valor a cada espacio dentro del arreglo. Después de esto, ya tenemos que verificar la exactitud. La exactitud se logra calcular mediante otra for loop, la cual compara los valores del arreglo, con el valor real. Antes de iniciar la for loop, se declara un booleano con valor falso, cuando se chequen todos los valores y se cumpla la condición que todos estén dentro del rango, entonces se declara como verdadero. Verifica que cada valor este dentro de 0.1 unidades. En dado caso que no se cumpla esto, se terminara la for loop, y el valor del booleano sea falso. Después hay un if que verifica que el booleano sea verdadero, en dado caso que dirá que el arreglo de datos es preciso. Si es falso, entonces se imprimirá que es impreciso. La precisión se calcula de manera similar, en que se utiliza el mismo sistema de fors, solo que esta vez tenemos que incluir otro for, para comparar cada valor del arreglo. Si llega a haber un valor que no este dentro de 0.1 unidades, entonces se termina la for loop y tenemos que no son precisos. Pero si se cumplen todas las condiciones, entonces si son precisos.

PuntoFijo:
El programa inicia con la importación de una libreria la cual permite que el usuario ingrese una funcion a traves de texto. Con esto continuamos a declarar los variables que se utilizaran. Ya con estos definidos, le pedimos al usuario que ingrese su funcion. Esta se convierte a algo que podemos calcular con la libreria, solo le tenemos que indicar cual va a ser el variable en la ecuacion y su valor. Despues le pedimos al usuario la funcion g(x). Con ambas funciones definidas, ahora le pediremos al usuario el primer valor y el error deseado. Con esto podemos continuar al metodo Punto Fijo. Ahora empezaremos con un ciclo for, el cual se utiliza para las iteraciones del metodo. Dentro del ciclo, el primer ciclo sera diferente al resto, ya que no se puede calcular el error en la primera iteración. Con la segunda función g(x), podemos reemplazar el valor de x dado por el usuario y encontrar la posición estimada de la raiz. En la primera iteración. Esto sera lo único que se hace. Despues de la primera iteración, se hara casi lo mismo, salvo por la declaración de otro variable y la igualación a la raiz anterior, con esto, se puede calcular el error utilizando la formula (x1-x0)/x1. Con este valor del error, tambien tenemos una condición, la cual chequa que el error calculado por la función sea menor que el error dado por el usuario. Cuando se cumple esta condición, tenemos que el programa imprimira los datos de la ejecucioón, como el número de iteraciones y el error, junto con la raiz aproximada de f(x).

Jacobi:
El programa inicia declarando 12 variables, de los cuales, 5 son matrices y 7 son variables regulares. Todos son doubles. Las matrices se utilizaran en base al procedimiento requerido del Metodo de Jacobi. Y por utlimo, se declara un variable del tipo int para contar las iteraciones. Para iniciar, se utilizaran dos ciclos for, los cuales serviran para establecer los valores de la matriz original. Mientras el usuario ingresa los valores, aprovechamos el uso de este for y el ingreso de los datos para que establecer las siguientes matrices que se usaran. Estas incluyen a la matriz diagonal, la cual contiene solo los valores de la diagonal, pero a parte de esto, son los reciprocos, dado que se requiere para el metodo. Tambien se aprovecha para llenar la matriz superior e inferior negativas. Ya con estas 3 matrices llenas, continuamos a establecer la matriz de valores iniciales y la matriz de la ecuacion. La matriz de los valores iniciales la crearmos usando los valores de la matriz diagonal, multiplicada por la solucion a las ecuaciones originales. Le aplicamos estos valores a los variables doubles declarados antes, especificamente xV, yV y zV, los cuales representan los valores viejos ya calculados en el metodo. La matriz de la ecucaion se establece a traves de la multiplicacion de la matriz diagonal con la matriz inferior y superior negativa. Con todas nuestras matrices ya declaradas, podemos continuar a la aplicacion del metodo. Ahora ya empezamos a aproximar a las soluciones de la ecuacion. Primero se pedira el margen de error deseado. La primera iteracion no se hara nada, dado que los primeros valores se calcularon previamente. Los valores se calcularan mediante el uso de la matriz de ecuacion y el valor viejo de los variables (xV, yV, zV). Igualando estos a xN, yN y zN. Despues existe una condicion para checar que el margen de error. Cuando se cumpla, un booleano se hara verdadero, despues de esto continuamos a igualar los valores de xV, yV y zV a los recien calculados xN, yN y zN. En dado caso que el booleano sea verdadero, entonces se terminara el ciclo y se le presentara los valores aproximados al usuario, junto con las iteraciones que se requirieron.

MetodoSimpson:
El programa inicia importando la libreria utilizada anterior mente en el metodo del punto fijo. Ya con esta libreria importada, empezamos con la clase, declarando un Scanner para leer datos. Despues de esto, creamos el metodo metodosimpson(), en el cual se ejecutara el codigo. Dentro del metodo, declaramos nuestro variable func, que es aquello de la libreria y sera lo que representan nuestra funcion. Despues declaramos 3 doubles, a, b y x, de los cuales, a y b son el limite inferior y superior respectivamente. El variable x se utilizara para calcular el valor de la funcion, es decir, solucionar para x. Y por ultimo, declararemos el int n, el cual se usara para los intervalos del metodo. Con los variables declarados, le pedimos al usuario que ingrese su funcion, la cual se convertira a una ecuacion la cual Java puede calcular, a traves de la libreria. Con esto ya establecido, le pedimos al usuario el valor de limite inferior y superior, mas aparte los intervalos deseados. En dado caso que el usuario ingrese un numero de intervalos inpar, se le arrojara un error, indicandole que deben ser pares. Despues calculamos h, declaramos dos doubles, sumaImpar y sumaPar, e igualamos x a el valor de a, o el limite inferior. Con esto abrimos un ciclo for, en el cual calcularemos los valores del los intervalos, sean par o impar. En caso que sean par, calculamos su valor y lo agregamos al variable de sumaPar, en el caso contrario, se agregara a sumaImpar. Esto se repitira dependiendo de el numero de intervalos. Y por ultimo, calcularemos el valor de la funcion en los limites del intervalo, ya que no se calcularon en el ciclo for. Con esto, tenemos todos los datos necesarios para hacer nuestra aproximacion. Imprimimos la linea en la cual indica cual es la aproximacion y se calcula el area mediante la formula de simpson, en este caso dividiremos h en 3 multiplicandolo por, el valor del limite inferior del intervalo, sumandole 4 veces la sumaImpar, mas 2 veces la suma par, mas el valor del limite superior del intervalo.
