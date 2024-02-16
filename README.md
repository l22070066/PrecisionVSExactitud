El programa inicia declarando los variables que se van a utilizar. Esto incluye el Scanner que se va a utilizar para leer los datos que el usuario ingresara. También incluye el arreglo de números para calcular la precisión y exactitud. 
Después de esto, le pedimos al usuario que ingrese el valor real, con el que compararemos los valores dados por el usuario. Estos datos se reciben con una for loop, la cual le asigna un valor a cada espacio dentro del arreglo. 
Después de esto, ya tenemos que verificar la exactitud.
La exactitud se logra calcular mediante otra for loop, la cual compara los valores del arreglo, con el valor real. 
Antes de iniciar la for loop, se declara un booleano con valor falso, cuando se chequen todos los valores y se cumpla la condición que todos estén dentro del rango, entonces se declara como verdadero. 
Verifica que cada valor este dentro de 0.1 unidades. En dado caso que no se cumpla esto, se terminara la for loop, y el valor del booleano sea falso. 
Después hay un if que verifica que el booleano sea verdadero, en dado caso que dirá que el arreglo de datos es preciso. Si es falso, entonces se imprimirá que es impreciso.
La precisión se calcula de manera similar, en que se utiliza el mismo sistema de fors, solo que esta vez tenemos que incluir otro for, para comparar cada valor del arreglo. 
Si llega a haber un valor que no este dentro de 0.1 unidades, entonces se termina la for loop y tenemos que no son precisos. Pero si se cumplen todas las condiciones, entonces si son precisos.
