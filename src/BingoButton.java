import javax.swing.*;

public class BingoButton {

    private final JButton button;

    protected BingoButton(int Xposition, int Yposition, int width, int high, String textContent){
        this.button = new JButton(textContent);
        this.button.setBounds(Xposition, Yposition, width, high);
    }

    protected BingoButton(int Xposition, int Yposition, int width, int high, String textContent,boolean enabled){
        this.button = new JButton(textContent);
        this.button.setBounds(Xposition, Yposition, width, high);
        this.button.setEnabled(enabled);
    }

    protected JButton getButton(){
        return button;
    }

}
