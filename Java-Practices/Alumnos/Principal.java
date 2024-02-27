/* La clase Principal es la clase que ejecutara un metodo llamado main
 * que es punto inicial de nuestra aplicacion, es decir a partir de donde
 * empieza a ejecutar las acciones. No es una clase de entidad (es decir 
 * una clase que represente uno de los elementos que forman parte de mi problema)
 * por lo tanto no tiene atributos
 */
public class Principal
{
    
    /* El metodo mas importante de la clase Principal (y muchas veces el unico)
     * es el metodo main el cual se ejecuta al iniciar el programa
     */
    public static void main(String args[])
    {
       System.out.println("Bievenido"); 
       
       /* Vamos a crear un alumno, cargarle los datos para calcular y mostrar 
        * el promedio.
        * Recordemos que clase es la definicion abstracta de lo que es la entidad
        * en este caso que representa un alumno para nuestro sistema
        * Los objetos son creaciones o instancias de una clase, es decir si yo
        * para mi programa necesito cargar 20 alumnos, creare 20 objetos de la clase
        * Alumno
        */
       
       // declaramos un objeto de la clase Alumno
       // Clase nombreobjeto
       Alumno alumno1; 
       
       // para utilizar el objeto, debo inicializarlo llamando constructor
       alumno1 = new Alumno();
       
       // En este punto el alumno ya existe pero todos los atributos tiene valores
       // genericos, deberemo asignarles valores a los atributos utilizando los metodos set
       
       System.out.println("Ingrese el nombre del alumno");
       
       /* Leeremos lo que ingrese el usuario utilizando la clase Teclado
        * la clase Teclado permite caputara lo que ingrese el usuario 
        * a traves de los siguientes metodos
        * leerLinea() cuando quiero leer un String
        * leerEntero() cuando quiero leer un int
        * leerFloat() cuando quiero leer un float
        */       
       String nombre = Teclado.leerLinea();
       
       // modificamos el nombre del objeto alumno1
       // para llamar a un metodo, sepone el nombre del objeto un punto y 
       // y el nombre del objeto
       alumno1.setNombre(nombre);
       
       System.out.println("Ingrese el apellido del alumno");
       // si no me interesa guardar en una variable lo ingresado por teclado
       // sino que directamente pasarselo al setApellido
       alumno1.setApellido(Teclado.leerLinea());
       
       System.out.println("Ingrese el DNI");
       alumno1.setDni(Teclado.leerEntero());
       
       System.out.println("Ingrese la primer nota");
       alumno1.setNota1(Teclado.leerEntero());
       
       System.out.println("Ingrese la segunda nota");
       alumno1.setNota2(Teclado.leerEntero());
       
       System.out.println("Ingrese la tercer nota");
       alumno1.setNota3(Teclado.leerEntero());
       
       // con todos los atributos cargados, mostramos el promedio del alumno
       System.out.println("Promedio del alumno:");
       // Llamamos al metodo calcularPromedio y al resultado lo mostramos en pantalla
       System.out.println(alumno1.calcularPromedio());
      
    }
}
