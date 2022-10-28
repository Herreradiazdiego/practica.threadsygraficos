import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class values extends JPanel{
    int anguloDepa1;
    int anguloDepa2;
    int anguloDepa3;
    int anguloDepa4;

    public values(int r3_1, int r3_2, int r3_3, int r3_4) {
        anguloDepa1 = r3_1;
        anguloDepa2 = r3_2;
        anguloDepa3 = r3_3;
        anguloDepa4 = r3_4;
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Arc2D.Float arco = new Arc2D.Float(Arc2D.PIE);
        arco.setFrame(50,10,400,400);

        //departamento1
        arco.setAngleStart(0);
        arco.setAngleExtent(anguloDepa1);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.MAGENTA);
        g2.fill(arco);

        //departamento2
        arco.setAngleStart(anguloDepa1);
        arco.setAngleExtent(anguloDepa2);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(arco);

        //departamento3
        arco.setAngleStart(anguloDepa1+anguloDepa2);
        arco.setAngleExtent(anguloDepa3);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.PINK);
        g2.fill(arco);

        //departamento4
        arco.setAngleStart(anguloDepa1+anguloDepa2+anguloDepa3);
        arco.setAngleExtent(anguloDepa4);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.YELLOW);
        g2.fill(arco);
    }
}