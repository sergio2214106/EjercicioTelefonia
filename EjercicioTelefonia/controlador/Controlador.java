package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.EjercicioTelefonia;
//import javax.swing.JOptionPane;
import modelo.EjercicioTelefonia;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private EjercicioTelefonia model;

    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, EjercicioTelefonia pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("registrar"))
        {   
            
        }

        if(comando.equals("pagar"))
        {
            //model.setHoras(Integer.parseInt(venPrin.miPanelEntradaDatos.gettfHoras()));
            //model.PagarCantidad();
            //venPrin.miPanelResultado.mostrarResultado("Valor a pagar salario: " + model.getHoras() + "\n Valor pagar auxilio de transporte= " + model.getvalorAuxilio());
        }
        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }    
}
