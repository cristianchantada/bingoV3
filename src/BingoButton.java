import javax.swing.*;

public class BingoButton {

    private final JButton button;

    protected BingoButton(int xPosition, int yPosition, int width, int high, String textContent){
        this.button = new JButton(textContent);
        this.button.setBounds(xPosition, yPosition, width, high);
    }

    protected BingoButton(int xPosition, int yPosition, int width, int high, String textContent,boolean enabled){
        this.button = new JButton(textContent);
        this.button.setBounds(xPosition, yPosition, width, high);
        this.button.setEnabled(enabled);
    }

    protected JButton getButton(){
        return button;
    }

}
