import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BingoButton implements ActionListener {

    private JButton button;

    protected BingoButton(int Xposition, int Yposition, int width, int high, String textContent, JPanel bingoPanel){
        this.button = new JButton(textContent);
        this.button.addActionListener(this);
        this.button.setBounds(Xposition, Yposition, width, high);
        bingoPanel.add(button);

    }

    protected BingoButton(int Xposition, int Yposition, int width, int high, String textContent, JPanel bingoPanel, boolean enabled){
        this.button = new JButton(textContent);
        this.button.addActionListener(this);
        this.button.setBounds(Xposition, Yposition, width, high);
        bingoPanel.add(button);
        button.setEnabled(enabled);
    }

    protected JButton getButton(){
        return button;
    }

    protected void setEnabled(boolean enabled){
        button.setEnabled(enabled);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
