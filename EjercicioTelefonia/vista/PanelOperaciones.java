package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bPagar;
    public JButton bRegistrar;
    public JButton bAcelerar;
    public JButton bFrenar;
    public Color colorGrisBonito= new Color(112,123,124);
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(colorGrisBonito);
        
        //Creación y adicion de los botones
        bPagar = new JButton("Pagar");
        bPagar.setFont(new Font("Arial", BOLD, 12));
        bPagar.setBounds(10,20,90,20);
        bPagar.setBackground(Color.LIGHT_GRAY);
        add(bPagar);
        bPagar.setActionCommand("pagar");
        
        
        bRegistrar = new JButton("Borrar");
        bRegistrar.setFont(new Font("Arial", BOLD, 12));
        bRegistrar.setBounds(140,20,90,20);
        bRegistrar.setBackground(Color.LIGHT_GRAY);
        add(bRegistrar);
        bRegistrar.setActionCommand("borrar");
        
        bAcelerar = new JButton("Salir");
        bAcelerar.setFont(new Font("Arial", BOLD, 12));
        bAcelerar.setBounds(265,20,90,20);
        bAcelerar.setBackground(Color.LIGHT_GRAY);
        add(bAcelerar);
        bAcelerar.setActionCommand("salir");
        
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.WHITE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        bPagar.addActionListener(pAL);
        bRegistrar.addActionListener(pAL);
        bAcelerar.addActionListener(pAL);
        bFrenar.addActionListener(pAL);
    }
}