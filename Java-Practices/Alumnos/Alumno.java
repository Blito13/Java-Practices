public class Alumno
{
    /*
     * Las clases en la POO son abstracciones de los elementos  que
     * forman parte de mi sistema. Todas las clases tienen 2 elementos
     * los atributos y los metodos
     * los atributos son variables que representan los datos relevantes
     * de mi clase para el sistema
     * Los metodos son todas las acciones que llevan cabo un clase
     * 
     */
    
    /*Definimos los atributos, de cada uno de ellos debemos indicar el tipo
     * de dato que representa. Los tipos principales son String para texto
     * int para numeros entereos y float para numeros reales (o con decimales)
     * Todos los atributos se declara como privados para que no puedan ser 
     * modificados por otras clases
     * Los nombres de los atributos y variables van todo en minuscula
     */
    
    private String nombre;
    private String apellido;
    private int dni;
    private int nota1;
    private int nota2;
    private int nota3;
    
    /*
     * Luego de definir los atributos, debemos declarar los metodos
     * los metodos son las acciones que lleva a cabo en el sistema una clase
     * Dentro de los metodos, hay uno muy especial que se llama el constructor
     * que es el metodo que se ejecuta al crear un objeto de la clase
     * Otros metodos muy importantes y que toda clase tiene son los metodos de seteo
     * los cuales me permite que modificar y devolver el valor de los atributos
     * (recordemos que los atributos por seguridad los declaramos todos como privados)
     */
    
    
    /* empezaremos con el constructor. El constructor es el metodo que se ejecuta
     * al crear un objeto de la clase y la finalidad del mismo es darle
     * valor genericos a los atributos ya que el JAVA (y en casi todos los lenuajes)
     * las variables deben inicializarse para poder usarlas.
     */   
    public Alumno()
    {
         nombre = "";
         apellido = "";
         dni = 0;
         nota1 = 0;
         nota2 = 0;
         nota3 = 0;
    }
    
    /* Definimos los metodos que permitan modificar (set) y devolver (get) los atributos
     * Todos los metodos, a excepcion del constructor que es un metodo especial
     * se declaran de la siguiente forma
     * -public/private (habitualmente public)  
     * - tipo de retorno/ void (indicamos el tipo de dato que devuelve o void si no 
     * si no devuelve nada) 
     * - nombre (empiezan en minuscula y si esta formado por mas de una palabra
     *   no se deja espacio pero comienza con mayuscula ej: calcularInteres
     * - luego entre parentesis definimos los argumentos (los datos que me envian
     * desde el exterior para ejecutar el metodo)
     */
    
    // empezaremos con los metodos set, los cuales modifican los atributos
    public void setNombre(String nuevo)
    {
        // modifico el atributo nombre con el valor del argumento
        nombre = nuevo;
    }
    
    public void setApellido(String nuevo)
    {
        apellido = nuevo;
    }
    
    public void setDni(int nuevo)
    {
        dni = nuevo;
    }
    
    public void setNota1(int nuevo)
    {
        nota1 = nuevo;
    }
    
    public void setNota2(int nuevo)
    {
        nota2 = nuevo;        
    }
    
    public void setNota3(int nuevo)
    {
        nota3 = nuevo;
    }

    // Agregamos los metodos get que devuelven el valor del atributo
    public String getNombre()
    {
        return nombre;
    }
    
    public String getApellido()
    {
        return apellido;
    }
    
    public int getDni()
    {
        return dni;
    }
       
    public int getNota1()
    {
        return nota1;
    }
    
    public int getNota2()
    {
        return nota2;
    }
    
    
    public int getNota3()
    {
        return nota3;
    }
    
    /* Hasta aqui, es lo minimo que tiene cualquier clase, es decir los atributos
    * el constructor, los metodos set y get. De ahora en adelante agregamos todos
    * los metodos exclusivamente de la clase alumno y que lo diferencian de cualquier
    * otra clase
    * Los nombres de los metodos, habitualmente se escriben como acciones en
    * ej: calcularPromedio, registrarBaja, 
    */
    
    public float calcularPromedio()
     {
         //este metodo calculara y devolvera el promedio del alumno
         
         // declaramos la variable donde se almacenara el promedio para luego devolverlo
         float promedio;
         
         // calculamos el promedio
         promedio = (nota1 + nota2 + nota3) / 3;
     
         return promedio;        
     }
    
}   // fin de la clase 