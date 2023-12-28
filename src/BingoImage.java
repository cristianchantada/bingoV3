import javax.swing.*;

public class BingoImage {

    private JLabel imageLabel;

    protected BingoImage(int Xposition, int Yposition, int width, int high, String IMAGE_FILE_NAME){
        this.imageLabel = new JLabel(new ImageIcon(Main.getAbsolutePathToDirImg() + "\\" + IMAGE_FILE_NAME));
        this.imageLabel.setBounds(Xposition, Yposition, width, high);
    }

    protected BingoImage(int Xposition, int Yposition, int width, int high, String IMAGE_FILE_NAME, boolean isVisible){
        this.imageLabel = new JLabel(new ImageIcon(Main.getAbsolutePathToDirImg() + "\\" + IMAGE_FILE_NAME));
        this.imageLabel.setBounds(Xposition, Yposition, width, high);
        this.imageLabel.setVisible(isVisible);
    }

    protected JLabel getImageLabel(){
        return this.imageLabel;
    }

}
