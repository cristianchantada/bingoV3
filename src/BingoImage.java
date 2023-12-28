import javax.swing.*;

public class BingoImage {

    private final JLabel imageLabel;

    protected BingoImage(int xPosition, int yPosition, int width, int high, String IMAGE_FILE_NAME){
        this.imageLabel = new JLabel(new ImageIcon(Main.getAbsolutePathToDirImg() + "\\" + IMAGE_FILE_NAME));
        this.imageLabel.setBounds(xPosition, yPosition, width, high);
    }

    protected BingoImage(int xPosition, int yPosition, int width, int high, String IMAGE_FILE_NAME, boolean isVisible){
        this.imageLabel = new JLabel(new ImageIcon(Main.getAbsolutePathToDirImg() + "\\" + IMAGE_FILE_NAME));
        this.imageLabel.setBounds(xPosition, yPosition, width, high);
        this.imageLabel.setVisible(isVisible);
    }

    protected JLabel getImageLabel(){
        return this.imageLabel;
    }

}
