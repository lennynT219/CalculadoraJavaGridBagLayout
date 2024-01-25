# COMO FUNCIONA 
En esta calculadora, se presenta una pantalla en la que deben ser ingresados dos números para poder realizar los cálculos.
Debajo de las entradas de texto hay un pequeño espacio que reflejará las respuestas.
Para las operaciones básicas, el programa tiene en cuenta el primer término (signo) el segundo término.
En el caso de las potencias hay tres opciones: serán el primer término al cuadrado, ese número al cubo y x la n ;es decir, el primer número elevado al segundo número.
Otra de las opciones: calcula el porcentaje usando ambos términos n2%(n1), como se puede ver en el ejemplo que sería el 2%(de -4).
En el caso de los logaritmos se agregó un texto en el caso de que no exista como en este caso; al encontrar un valor negativo en el número devuelve Nan, y mostrará este texto, sino devolverá la respuesta.
Encontramos también las funciones trigonométricas: seno, coseno y tangente del primer registro.
Otra función es |n| o abs, que retorna el valor absoluto.
Como funciones también podemos obtener el valor de constantes, que son el número de Euler y el número pi.
Por último, se implementó una raíz en la que el primer número es el índice y el segundo el radicando.
SIGNIFICADO DE LOS COMANDOS UTILIZADOS 
EN EL MAIN 
-	La línea 1 importa todas las clases del paquete java.swing, es la biblioteca estándar de java 
-	En la línea 5 crea una instancia de la clase JFrame que es la venta principal de la interfaz gráfica.
-	En la línea 6 se configura el contenido de la ventana principal, utilizamos un objeto de la clase que esta como form1 que contienen componentes de interfaz grafica 
-	En la línea 7 se encuentra como configurar la operación de cierre de la ventana y también indica que el programa se cerrera cuando el usuario cierre la venta principal. 
-	Con la linea 10 se hace visible la ventana principal con el true permite que la interfaz grafica sea visible para el usuario. 
EN EL FORM 1
-	Las dos primeras líneas son indispensables para las clases necesarios para manejar eventos de acción en la interfaz grafica 
-	Las líneas desde la 5 en adelante son componentes de interfaz como Jpanel que se ocupó en el menú principal el JTextFiel que se uso para los dos números, el JLabel que se uso para el resultado y el JButton que es para los 16 botones que se usaron la suma, resta, multiplicación etc.
-	En la fila 29 solamente es para dar el clic en el botón y que se ejecutara cuando se realice la acción en este caso de la suma, de igual manera para con los demás botones como la resta, multiplicación entre otros que se coloco en el trabajo. 
-	En la fila 32 se imprime el mensaje en la consola y nos indica que la operación se ha finalizado. 
-	En la línea   34 se obtiene el texto ingresado en el campo y lo almacena en la variable n1
-	En la línea 35 de igual manera que en la línea 3 obtiene el texto ingresado en el campo y lo almacena en la variable ente caso en la n2
-	En la línea 37 declara variables para almacenar el resultado y los números convertidos de cada entero
-	En la línea 38 y 39 convierten las cadenas a valores enteros y se almacenan en las variables que tenemos como nombre número1 y numero2 
-	En la fila 40 solamente se realiza la operación de suma y almacena el resultado en la variable resultado. 
-	Por último, en la fila 44 y 45 convierte el resultado de la suma a una cadena y lo almacena en la variable r3
-	Y el fila 46 establece el texto del JLabel para mostrar el resultado de la suma 
Este pequeño código muestra la suma de dos números ingresados por el usuario en los campos de texto, cuando el botón SUMAButton es dado clic muestra el resultado de igual manera de las demás operaciones cada que hacemos un clic muestra el resultado de la operación que queramos. 
INTERFACES 
-	Por ultimo se indica un formulario o ventana de interfaces graficas de usuario GUI que se utilizó para la creación de la calculadora manipulando e interactuando con la aplicación. 


<video src="https://github.com/lennynT02/Calculadorav1/assets/145746963/b60d5465-7ebd-499f-8200-aceb811681d9" controls title="Funcionamiento" style="width: 900px; margin: 20px 20%;"></video>


## INTEGRANTES 
>
>Jennyfer Guayanay: Elaboración readme - 4 funciones matemáticas 
>
>Francisco Caero: Diseño de la calculadora - 4 funciones matemáticas
>
>Jhonatan Bautista: Implementación de textareas y las funciones de lectura de los datos - 4 funciones matemáticas
>
>Lenin Masapanta: 4 funciones matemáticas

