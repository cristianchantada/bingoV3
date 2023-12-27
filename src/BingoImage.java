import javax.swing.*;

public class BingoImage {

    private String IMAGE_ABSOLUTE_PATH;
    private ImageIcon image = new ImageIcon(IMAGE_ABSOLUTE_PATH);
    private JLabel imageLabel = new JLabel(image);

    protected BingoImage(int Xposition, int Yposition, int width, int high, String IMAGE_FILE_NAME){
        this.IMAGE_ABSOLUTE_PATH = Bingo.getABSOLUTE_PATH_TO_DIR_IMG() + "\\" + IMAGE_FILE_NAME;
        this.imageLabel.setBounds(Xposition, Yposition, width, high);
    }

    protected BingoImage(int Xposition, int Yposition, int width, int high, String IMAGE_FILE_NAME, BingoPanel bingoPanel){
        this.IMAGE_ABSOLUTE_PATH = Bingo.getABSOLUTE_PATH_TO_DIR_IMG() + "\\" + IMAGE_FILE_NAME;
        this.imageLabel.setBounds(Xposition, Yposition, width, high);
        bingoPanel.addInBingoPanel(imageLabel);
    }

    protected BingoImage(int Xposition, int Yposition, int width, int high, String IMAGE_FILE_NAME, BingoPanel bingoPanel, int zOrder){
        this.IMAGE_ABSOLUTE_PATH = Bingo.getABSOLUTE_PATH_TO_DIR_IMG() + "\\" + IMAGE_FILE_NAME;
        this.imageLabel.setBounds(Xposition, Yposition, width, high);
        bingoPanel.addInBingoPanel(imageLabel);
        bingoPanel.setComponentZOrder(imageLabel, zOrder);
    }

    protected BingoImage(int Xposition, int Yposition, int width, int high, String IMAGE_FILE_NAME, BingoPanel bingoPanel, boolean visible){
        this.IMAGE_ABSOLUTE_PATH = Bingo.getABSOLUTE_PATH_TO_DIR_IMG() + "\\" + IMAGE_FILE_NAME;
        this.imageLabel.setBounds(Xposition, Yposition, width, high);
        bingoPanel.addInBingoPanel(imageLabel);
        bingoPanel.setVisible(visible);
    }

    protected JLabel getImageLabel(){
        return this.imageLabel;
    }

}
