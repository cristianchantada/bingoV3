import javax.swing.*;
import java.awt.*;

public class BingoPanel extends JFrame {

    private JPanel bingoPanel = (JPanel) this.getContentPane();

    protected BingoPanel(){
        setSize(842, 750);
        setTitle("Bingooooooooo !!!");
        setResizable(true);
        setLocation(25, 25);
        setVisible(true);

        bingoPanel.setLayout(null);
        bingoPanel.setBackground(Color.decode("#FFC482"));
    }

    protected void addInBingoPanel (JLabel label){
        bingoPanel.add(label);
    }

    protected void addInBingoPanel (JButton button){
        bingoPanel.add(button);
    }

    protected JPanel getBingoPanel(){
        return bingoPanel;
    }


}
