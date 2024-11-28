package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
	
	
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar
    	
    	
    	JLabel labNombre = new JLabel("Nombre: ");
    	add(labNombre);
    	txtNombre = new JTextField();
    	add(txtNombre);
    	

        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar
    	
    	
    	JLabel labCalificacion = new JLabel("Calificacion: ");
    	add(labCalificacion);
    	cbbCalificacion = new JComboBox<String>();
    	add(cbbCalificacion);
    	cbbCalificacion.addItem(Integer.toString(1));
    	cbbCalificacion.addItem(Integer.toString(2));
    	cbbCalificacion.addItem(Integer.toString(3));
    	cbbCalificacion.addItem(Integer.toString(4));
    	cbbCalificacion.addItem(Integer.toString(5));
    	

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar
    	
    	JLabel labVisitado = new JLabel("Visitado: ");
    	add(labVisitado);
    	cbbVisitado = new JComboBox<String>();
    	add(cbbVisitado);
    	cbbVisitado.addItem("Sí");
    	cbbVisitado.addItem("No");

        // Agregar todos los elementos al panel
        // TODO completar
    	
    	setLayout(new GridLayout(3, 2, 10, 10));

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
    	String opcion = (String) cbbVisitado.getSelectedItem();
    	
    	if ("Sí".equals(opcion)) {
    		return true;
    		
    	}else {
    		return false;
    	}
        
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar
    	
    	String nombreRes = txtNombre.getText();
        return nombreRes;
    }
}
