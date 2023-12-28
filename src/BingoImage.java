import javax.swing.*;

public class BingoImage {

    private String IMAGE_ABSOLUTE_PATH;
    private ImageIcon image = new ImageIcon(IMAGE_ABSOLUTE_PATH);
    private JLabel imageLabel = new JLabel(image);

    protected BingoImage(int Xposition, int Yposition, int width, int high, String IMAGE_FILE_NAME, BingoPanel bingoPanel){
        this.IMAGE_ABSOLUTE_PATH = Main.getAbsolutePathToDirImg() + "\\" + IMAGE_FILE_NAME;
        this.imageLabel.setBounds(Xposition, Yposition, width, high);
        bingoPanel.getBingoPanel().add(imageLabel);
    }
    protected BingoImage(int Xposition, int Yposition, int width, int high, String IMAGE_FILE_NAME, BingoPanel bingoPanel, int zOrder){
        this.IMAGE_ABSOLUTE_PATH = Main.getAbsolutePathToDirImg() + "\\" + IMAGE_FILE_NAME;
        this.imageLabel.setBounds(Xposition, Yposition, width, high);
        bingoPanel.getBingoPanel().add(imageLabel);
        bingoPanel.getBingoPanel().setComponentZOrder(imageLabel, zOrder);
    }

    protected BingoImage(int Xposition, int Yposition, int width, int high, String IMAGE_FILE_NAME, BingoPanel bingoPanel, boolean visible){
        this.IMAGE_ABSOLUTE_PATH = Main.getAbsolutePathToDirImg() + "\\" + IMAGE_FILE_NAME;
        this.imageLabel.setBounds(Xposition, Yposition, width, high);
        bingoPanel.getBingoPanel().add(imageLabel);
        bingoPanel.getBingoPanel().setVisible(visible);
    }

    protected JLabel getImageLabel(){
        return this.imageLabel;
    }

}
