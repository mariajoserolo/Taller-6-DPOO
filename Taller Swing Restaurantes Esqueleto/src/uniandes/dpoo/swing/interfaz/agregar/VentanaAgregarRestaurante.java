package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal;

@SuppressWarnings("serial")
public class VentanaAgregarRestaurante extends JFrame
{
	
	public JPanel PSur;
    /**
     * El panel donde se editan los detalles del restaurante
     */
    private PanelEditarRestaurante panelDetalles;

    /**
     * El panel con los botones para agregar un restaurante o cerrar la ventana
     */
    private PanelBotonesAgregar panelBotones;

    /**
     * El panel para marcar la ubicación del restaurante
     */
    private PanelMapaAgregar panelMapa;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaPrincipal ventanaPrincipal;

    public VentanaAgregarRestaurante( VentanaPrincipal principal )
    {
        this.ventanaPrincipal = principal;
        setLayout( new BorderLayout( ) );

        // Agrega el panel donde va a estar el mapa
        // TODO completar
        panelMapa = new PanelMapaAgregar();
        add(panelMapa, BorderLayout.NORTH);
        

        // Agrega en el sur un panel para los detalles del restaurante y para los botones
        // TODO completar
        PSur = new JPanel(new GridLayout());
        panelDetalles = new PanelEditarRestaurante();
        panelBotones = new PanelBotonesAgregar(this);
        PSur.add(panelDetalles, BorderLayout.CENTER);
        PSur.add(panelBotones, BorderLayout.SOUTH);
        add(PSur, BorderLayout.SOUTH);

        // Termina de configurar la ventana
        pack( );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setResizable( false );
    }

    /**
     * Le pide al panelDetalles los datos del nuevo restaurante y se los envía a la ventana principal para que cree el nuevo restaurante, y luego cierra la ventana.
     */
    public void agregarRestaurante( )
    {
        // TODO completar
    	String txtNombre = panelDetalles.getNombre();
    	int calificacion = panelDetalles.getCalificacion();
    	boolean visitado = panelDetalles.getVisitado();
    	
    	int[] coordenadas = panelMapa.getCoordenadas();
    	int coordenadaX = coordenadas[0];
    	int coordenadaY = coordenadas[1];
    	
    	ventanaPrincipal.agregarRestaurante(txtNombre, calificacion, coordenadaX, coordenadaY, visitado);
    	
    	
    }

    /**
     * Cierra la ventana sin crear un nuevo restaurante
     */
    public void cerrarVentana( )
    {
        dispose( );
    }

}
