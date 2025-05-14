import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class PanelDibujo extends JPanel
{
    //Dibuja una x desde las esquinas del panel
    public void paintComponent(Graphics g )
    {
        //Llama a paintComponent para asegurar que el panel se muestre correctamente 
        super.paintComponent(g);
        setBackground(Color.BLACK);//Establece el fondo de color
    
        int anchura = getWidth();//Anchura total
        int altura = getHeight();// Altura total

        //Da color a la linea 
        g.setColor(Color.red);
        //Dibuja una linea de la esquina superior izquierda a la esquina inferior derecha
        g.drawLine(0, 0, anchura, altura);
        //Da color a la linea 
        g.setColor(Color.CYAN);
        //Dibuja una linea de la esquina inferior izquierda a la esquina inferior derecha
        g.drawLine(0, altura, anchura, 0);
    }
}//Fin clase PanelDibujo


//Fill -> Para llenar figura
//Draw -> Para dibujar figura 
