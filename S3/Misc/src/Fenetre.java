import javax.swing.*;

public class Fenetre extends JFrame {

    public Fenetre() {
        this.setSize(500, 100);
        this.setTitle("Rechercher auteur");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

        JPanel panel = new JPanel();
        JTextField textField = new JTextField();
        textField.setColumns(10);
        panel.add(textField);
        this.setContentPane(panel);

    }

}
