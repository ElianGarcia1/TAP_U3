
import javax.swing.JFrame;


public class Lienzo extends JFrame{
    public static void main(String args[]){
        LienzoCanvas Paint = new LienzoCanvas();
        JFrame Ventana = new JFrame();
        Ventana.add(Paint);
        Ventana.setSize(610, 430);
        Ventana.setLocationRelativeTo(null);
        Ventana.setResizable(false);
        Ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }
}
