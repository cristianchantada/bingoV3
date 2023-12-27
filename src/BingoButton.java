import javax.swing.*;
import java.awt.event.ActionListener;

public class BingoButton {

    private JButton button;

    protected BingoButton(int Xposition, int Yposition, int width, int high, String textContent, BingoPanel bingoPanel){
        this.button = new JButton(textContent);
        this.button.addActionListener((ActionListener) this);
        this.button.setBounds(Xposition, Yposition, width, high);
        bingoPanel.addInBingoPanel(button);
    }

    protected BingoButton(int Xposition, int Yposition, int width, int high, String textContent, BingoPanel bingoPanel, boolean enabled){
        this.button = new JButton(textContent);
        this.button.addActionListener((ActionListener) this);
        this.button.setBounds(Xposition, Yposition, width, high);
        bingoPanel.addInBingoPanel(button);
        button.setEnabled(enabled);
    }

    protected JButton getButton(){
        return button;
    }

    protected void setEnabled(boolean enabled){
        button.setEnabled(enabled);
    }

}
