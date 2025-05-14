import javax.swing.JFrame;

public class App 
{
    public static void main(String[] args) 
    {
        // Crea un panel que contiene nuestro dibujo 
        PanelDibujo panel = new PanelDibujo ();
        //Crea un nuevo marcop para contener el panel
        JFrame aplicacion = new JFrame();

        //Establece el marco para salir cuando se cierrre
        aplicacion.add(panel);//Agrega el panel al marco
        aplicacion.setSize(400, 250);//Establece el tamaño del marco
        aplicacion.setVisible(true);//Hace que el marco sea visible 
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}//Fin de la clase App