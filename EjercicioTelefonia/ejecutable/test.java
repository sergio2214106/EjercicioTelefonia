package ejecutable;

import modelo.EjercicioTelefonia;
import controlador.Controlador;
import modelo.EjercicioTelefonia;
import vista.VentanaPrincipal;

public class test 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        EjercicioTelefonia empresa = new EjercicioTelefonia();
        Controlador miControlador = new Controlador(miVentana, empresa );
    }
}
