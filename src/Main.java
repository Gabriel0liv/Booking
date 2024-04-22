import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JPanel MainPanel;
    private JButton cliqueEmMimButton;

    public Main() {
        setContentPane(MainPanel); // invoca o form
        setTitle("ESTGA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // finalizar programa quando clica no X
        setSize(400,400 );
        setLocationRelativeTo(null);
        setVisible(true);


        cliqueEmMimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Main.this, "Hello World");
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }

}
