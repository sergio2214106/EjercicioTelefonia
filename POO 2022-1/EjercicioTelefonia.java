public class EjercicioTelefonia 

{

    //-------------------------------
    //-------------ATRIBUTOS---------
    //-------------------------------

    private String numTelefono;
    private String operador;
    private int cantidadMinutos;
    private int valorMinuto;
    private Boolean movilujo;
    private int cantidadPagar;




    //-------------------------------
    //-------------METODOS-----------
    //-------------------------------

    /* METODO CONTRUCTOR */

    public EjercicioTelefonia()
    {
        numTelefono= "3152715299";
        operador= "movistar";
        cantidadMinutos= 10;
        movilujo= false;
        valorMinuto=100;
    }

    public EjercicioTelefonia(String nNumTelefono, String nOperador, int nCantidadMinutos, boolean nMovilujo, int nValorMinuto) 
    {
        this.numTelefono= nNumTelefono;
        this.operador= nOperador;
        this.cantidadMinutos= nCantidadMinutos;
        this.movilujo= nMovilujo;
        this.valorMinuto=nValorMinuto;
    }

    //contructor de cpia

    public EjercicioTelefonia(EjercicioTelefonia t)
    {
        numTelefono= t.getNumTelefono();
        operador= t.getOperador();
        cantidadMinutos= t.getCantidadMinutos();
        movilujo= t.getMovilujo();
        valorMinuto= t.getValorMinuto();
    }

    public void setCantidadMinutos(int cantidadMinutos) 
    {
        this.cantidadMinutos = cantidadMinutos;
    }
    public int getCantidadMinutos() 
    {
        return cantidadMinutos;
    }
    public void setNumTelefono(String numTelefono) 
    {
        this.numTelefono = numTelefono;
    }
    public String getNumTelefono() 
    {
        return numTelefono;
    }
    public void setOperador(String operador) 
    {
        this.operador = operador;
    }
    public String getOperador() 
    {
        return operador;
    }
    public void setValorMinuto(int valorMinuto) 
    {
        this.valorMinuto = valorMinuto;
    }
    public int getValorMinuto() 
    {
        return valorMinuto;
    }
    public void setMovilujo(Boolean movilujo) 
    {
        this.movilujo = movilujo;
    }
    public Boolean getMovilujo() 
    {
        return movilujo;
    }
    public void setCantidadPagar() 
    {
        if (movilujo==false )
        {
            cantidadPagar= valorMinuto*cantidadMinutos;
        }
        else
        {
            cantidadPagar= (valorMinuto*cantidadMinutos)/2;
        }
    }
    public int getCantidadPagar() 
    {
        return cantidadPagar;
    }

    public String toString()
    {
        return "numero de telefono: " + numTelefono + "\nOperador: " + operador + "\nCantidad de minutos usados: " + cantidadMinutos + "\n----------------------------------" + "\nCantidad a pagar: " + cantidadPagar + "\n----------------------------------";
    }



    public static void main(String[] args) 
    {
    EjercicioTelefonia f1= new EjercicioTelefonia();
    f1.setCantidadPagar();
    System.out.println("Objeto 1: " + f1.toString());
    EjercicioTelefonia f2= new EjercicioTelefonia("3132715288","claro",32,false,150);
    f2.setCantidadPagar();
    System.out.println("Objeto 2: " + f2.toString());
    }


}
