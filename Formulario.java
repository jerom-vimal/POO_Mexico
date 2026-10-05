import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField; 

public class Formulario extends JFrame {
    private JLabel lbl;
    private JTextField txtNombre; // Ajout du champ de texte
    private JButton btn;

    public Formulario() {
        this.setBounds(20, 50, 600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        // Label modifié
        lbl = new JLabel("Como te llamas!");
        lbl.setBounds(10, 10, 200, 30);
        this.getContentPane().add(lbl);

        // Champ de texte 
        txtNombre = new JTextField("Escribe tu nombre");
        txtNombre.setBounds(10, 50, 200, 30);
        this.getContentPane().add(txtNombre);

        // Bouton 
        btn = new JButton("Saludar");
        btn.setBounds(10, 90, 100, 40);
        this.getContentPane().add(btn);

        // Classe anonyme 
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nombre = txtNombre.getText();
                lbl.setText("Hola " + nombre + "!");
            }
        });
    }
}