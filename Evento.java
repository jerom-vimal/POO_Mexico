import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Evento implements ActionListener {
    int numeroClics = 0;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Hola " + numeroClics + " !");
        numeroClics++;
    }
}
