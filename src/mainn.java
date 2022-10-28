import javax.swing.*;
import java.awt.*;

public class mainn {
    public static void main(String[] args) throws InterruptedException {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Grafica");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.white);
        ventana.setSize(800,800);

        values graph = new values();
        ventana.add(graph);
        ventana.setVisible(true);
        do {
            r1 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
            r2 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
            r3 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
            r4 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
            Thread t = new Thread(new runnables(r1, r2, r3, r4));
            t.start();
            t.sleep(10000L);
        } while (r1 != 0);
    }
}