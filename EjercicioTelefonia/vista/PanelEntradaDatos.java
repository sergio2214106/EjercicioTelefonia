package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
//import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    //private JLabel lbImagen;
    //private ImageIcon iImagen;
    private JLabel lbNumTelefono;
    private JLabel lbOperador;
    private JLabel lbNumMinutos;
    private JLabel lbValorMinuto;
    private JTextField tfNumTelefono;
    private JTextField tfOperador;
    private JTextField tfNumMinutos;
    private JTextField tfValorMinutos;
    public Color colorGrisBonito= new Color(112,123,124);
    private JComboBox hola ;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(colorGrisBonito);
        
        //Creación y adicion de la imagen
        //iImagen = new ImageIcon(getClass().getResource("/vista/carro.png"));
        //lbImagen = new JLabel(iImagen);
        //lbImagen.setBounds(10,20,126,126);
        //add(lbImagen);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbNumTelefono = new JLabel("Telefono: ");
        lbNumTelefono.setBounds(140,20,60,20);
        lbNumTelefono.setBackground(Color.WHITE);
        add(lbNumTelefono);
        
        lbOperador = new JLabel("Operador: ");
        lbOperador.setBounds(140,50,160,20);
        add(lbOperador);
        
        lbNumMinutos = new JLabel("Cantidad minutos: ");
        lbNumMinutos.setBounds(140,80,160,20);
        add(lbNumMinutos);

        lbValorMinuto = new JLabel("Valor minuto: ");
        lbValorMinuto.setBounds(140,110,160,20);
        add(lbValorMinuto);


        
        
        //Creación y adición de campos de texto
        tfNumTelefono = new JTextField("");
        tfNumTelefono.setBounds(300, 20, 60, 20);
        add(tfNumTelefono);
        
        tfOperador = new JTextField("");
        tfOperador.setBounds(300, 50, 60, 20);
        add(tfOperador);
        
        tfNumMinutos = new JTextField("");
        tfNumMinutos.setBounds(300, 80, 60, 20);
        add(tfNumMinutos);

        tfValorMinutos = new JTextField("");
        tfValorMinutos.setBounds(300, 110, 60, 20);
        add(tfValorMinutos);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.WHITE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String gettfNumTelefono()
    {
        return tfNumTelefono.getText();
    }
    
    public String gettfOperador()
    {
        return tfOperador.getText();
    }
    
    public String gettfNumMinutos()
    {
        return tfNumMinutos.getText();
    }
    public String gettfValorMinutos()
    {
        return tfValorMinutos.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNumTelefono.setText("");
        tfOperador.setText("");
        tfNumMinutos.setText("");
        tfValorMinutos.setText("");
    }
}