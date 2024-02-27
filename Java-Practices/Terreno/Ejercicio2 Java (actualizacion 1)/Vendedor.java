public class Vendedor
{
    private String nombre;
    private String apellido;
    private int dni;
    private float sueldo_bruto;
    private int anio_ingreso;
    
    public Vendedor()
    {
        nombre = "";
        apellido = "";
        dni = 0;
        sueldo_bruto = 0;
        anio_ingreso = 0;
    }
    
    public void setNombre(String nuevo)
    {
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
    
    public void setSueldo_Bruto(float nuevo)
    {
        sueldo_bruto = nuevo;
    }
        
    public void setAnio_Ingreso(int nuevo)
    {
        anio_ingreso = nuevo;
    }
    
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
        
    public float getSueldo_Bruto()
    {
        return sueldo_bruto;
    }
        
    public int getAnio_Ingreso()
    {
        return anio_ingreso;
    }
    
    public int calcularAntiguedad()
    {
        int antiguedad = 2017 - anio_ingreso;
        return antiguedad;
    }
    
    public float calcularSueldoNeto(float ventas)
    {
        float sueldo_neto;
        // descuentos del 18% del sueldo Bruto
        float descuentos = sueldo_bruto * 0.18f;
        
        // las comisiones son el 3% de lo vendido
        float comisiones = ventas * 0.03f;
        
        // El plus por antiguedad es un 1% del sueldo bruto por cada año trabajado
        float plus_antiguedad = sueldo_bruto * (0.01f * calcularAntiguedad());
        
        sueldo_neto = sueldo_bruto - descuentos + comisiones + plus_antiguedad;
        
        return sueldo_neto;
    }
    
    public float calcularImpuestoGanancias()
    {
        float impuesto_ganancias = 0;
        // si el sueldo bruto es mayor a 30000, se paga el 35% del monto excedente. Es decir si cobra $ 40.000, pagara el 35% de $ 10.000
        
        if (sueldo_bruto>30000)
        {
            float base_imponible = sueldo_bruto - 30000;
            impuesto_ganancias = base_imponible * 0.35f;
        }
        return impuesto_ganancias;
    }
}