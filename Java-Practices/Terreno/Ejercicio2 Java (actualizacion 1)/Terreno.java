/*Crear un clase Terreno con los siguientes atributos
 * Direccion
 * Metros de Frente
 * Metros de Fondo
 * Precio
 * Luego crear el constructor, los metodos sey y get para cada atributo y los siguientes
 * metodos:
 * calcularValorMetro: calcula y devuelve el valor por metro
 * calcularSuperficie: calcula y devuelve la superficie
 * calcularPerimetro: calcula y devuelve el perimetro
 * categorizarTerreno: Si el terreno es de mas de 10000 metros2 se lo considera campo
 * sino terreno familiar
 * calcularComisionInmobiliaria: Si el terreno es de mas de $500000 es el 3% del valor, sino
 * el 5%
 * calcularCostoCercado: Debera recibir el precio por poste y el valor por metro del alambre,
 * calcular teniendo en cuenta que cada 5 mts se coloca un poste.
 * 
 */

public class Terreno
{
    // Declaro los atributos
    private String direccion; //Texto
    private int mts_frente; //Entero
    private int mts_fondo; // Entero
    private float precio; // Numero con Decimal
    
    // declaro los metodos
    
    // constructor
     // Recordemos que el constructor le da valores iniciales a los atributos
    public Terreno()
    {
       
        direccion = "";
        mts_frente = 0;
        mts_fondo = 0;
        precio = 0;
    }
    
    // metodos set y get
    // Recordemos que los set permiten modificar los valores de los atributos desde otras
    // clases y los metodos get permiten consultar el valor de un atributo desde otra clase
    
    // metodos get que devuelven el valor de los atributos
    public String getDireccion()
    {
        return direccion;
    }
    
    public int getMts_Frente()
    {
        return mts_frente;
    }
    
    public int getMts_Fondo()
    {
        return mts_fondo;
    }
    
    public float getPrecio()
    {
        return precio;
    }
    
    // metodos set que modifican el valor de un atributo desde otra clase
    public void setDireccion(String nuevo)
    {
        direccion = nuevo;
    }
        
    public void setMts_Frente(int nuevo)
    {
        mts_frente = nuevo;
    }
    
    public void setMts_Fondo(int nuevo)
    {
        mts_fondo = nuevo;
    }
    
    public void setPrecio(float nuevo)
    {
        precio = nuevo;
    }
    
    // Metodos especificos de la clase
    
    public int calcularSuperficie()
    {
        int superficie;
        superficie = mts_frente * mts_fondo;
        return superficie;        
    }
    
    public int calcularPerimetro()
    {
        int perimetro;
        perimetro = mts_frente * 2 + mts_fondo * 2;
        return perimetro;
    }
    
    public float calcularValorMetro()
    {
        float valor_metro;
        // opcion 1:
        int superficie = mts_frente * mts_fondo;
        valor_metro = (float) precio / superficie;
        
        // opcion 2
        // valor_metro = (float) precio / calcularSuperficie();
        return valor_metro;
    }
    
    
    
} // Fin de la clase
