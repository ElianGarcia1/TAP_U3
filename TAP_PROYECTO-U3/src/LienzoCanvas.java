import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class LienzoCanvas extends Canvas{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        this.setBackground(Color.WHITE);
        //Semaforos
        g.setColor(Color.darkGray);
        g.fillRect(188, 5, 60, 120);
        g.fillRect(362, 262, 60, 120);
        //calles
        g.setColor(Color.gray);
        g.fillRect(0, 155, 600, 75);
        g.fillRect(255, 0, 75, 400);
        g.setColor(Color.darkGray);
        //Leds del semaforo
        g.setColor(Color.red);
        g.fillOval(203, 8, 30, 30);
        //Semaforo2
        g.fillOval(378, 265, 30, 30);
        g.setColor(Color.yellow);
        g.fillOval(203, 42, 30, 30);
        //semaforo2
        g.fillOval(378, 300, 30, 30);
        g.setColor(Color.green);
        g.fillOval(203, 79, 30, 30);
        //semaforo2
        g.fillOval(378, 335, 30, 30);
        //Lineas horizontales
        g.setColor(Color.WHITE);
        g.fillRect(10, 190, 20, 5);
        g.fillRect(50, 190, 20, 5);
        g.fillRect(90, 190, 20, 5);
        g.fillRect(130, 190, 20, 5);
        g.fillRect(170, 190, 20, 5);
        g.fillRect(210, 190, 20, 5);
        g.fillRect(250, 190, 20, 5);
        g.fillRect(330, 190, 20, 5);
        g.fillRect(370, 190, 20, 5);
        g.fillRect(410, 190, 20, 5);
        g.fillRect(450, 190, 20, 5);
        g.fillRect(490, 190, 20, 5);
        g.fillRect(530, 190, 20, 5);
        g.fillRect(570, 190, 20, 5);
        //Lineas verticales
        g.fillRect(290, 10, 5, 20);
        g.fillRect(290, 50, 5, 20);
        g.fillRect(290, 90, 5, 20);
        g.fillRect(290, 130, 5, 20);
        g.fillRect(290, 170, 5, 20);
        g.fillRect(290, 210, 5, 20);
        g.fillRect(290, 250, 5, 20);
        g.fillRect(290, 290, 5, 20);
        g.fillRect(290, 330, 5, 20);
        g.fillRect(290, 370, 5, 20);
        g.fillRect(290, 410, 5, 20);
        //Carro Rojo
        g.setColor(Color.red);
        g.fillRect(10, 160, 50, 30);
        g.setColor(Color.WHITE);
        g.fillRect(15, 165, 30, 20);
        g.setColor(Color.red);
        g.fillRect(18, 160, 20, 30);
        g.setColor(Color.BLACK);
        g.fillRect(12, 158, 10, 2);
        g.fillRect(42, 158, 10, 2);
        g.fillRect(12, 190, 10, 2);
        g.fillRect(42, 190, 10, 2);
        //Carro Rosa
        g.setColor(Color.PINK);
        g.fillRect(545, 195, 50, 30);
        g.setColor(Color.WHITE);
        g.fillRect(560, 200, 30, 20);
        g.setColor(Color.PINK);
        g.fillRect(566, 195, 20, 30);
        g.setColor(Color.BLACK);
        g.fillRect(555, 193, 10, 2);
        g.fillRect(580, 193, 10, 2);
        g.fillRect(555, 225, 10, 2);
        g.fillRect(580, 225, 10, 2);
        //Carro Negro
        g.setColor(Color.BLACK);
        g.fillRect(300, 10, 30, 50);
        g.setColor(Color.WHITE);
        g.fillRect(305, 15, 20, 30);
        g.setColor(Color.BLACK);
        g.fillRect(300, 18, 30, 20);
        g.setColor(Color.WHITE);
        g.fillRect(298, 14, 2, 10);
        g.fillRect(348, 14, 2, 10);
        g.fillRect(298, 40, 2, 10);
        g.fillRect(348, 40, 2, 10);
        //Carro Blanco
        g.setColor(Color.WHITE);
        g.fillRect(258, 340, 30, 50);
        g.setColor(Color.BLACK);
        g.fillRect(263, 352, 20, 30);
        g.setColor(Color.WHITE);
        g.fillRect(258, 358, 30, 20);
        g.setColor(Color.BLACK);
        g.fillRect(256, 343, 2, 10);
        g.fillRect(288, 343, 2, 10);
        g.fillRect(256, 371, 2, 10);
        g.fillRect(288, 371, 2, 10);
    }
}
