
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bingo extends JFrame implements ActionListener {

    private static String ABSOLUTE_PATH_TO_DIR_IMG;

    // Creación JPanel:
    private BingoPanel bingoPanel = new BingoPanel();
    // Imágenes del bingo:
    private BingoImage numbersTable = new BingoImage(477, 15, 298, 247, "tableroNumeros.png", bingoPanel);
    private BingoImage valDoAsmaLogoImage = new BingoImage(49, 12, 300, 249, "bingoIESVDA.png", bingoPanel);
    private BingoImage bingoCardImage = new BingoImage(113, 263,600, 297, "cartonBingoEnBlanco.png", bingoPanel);

    // Botones del bingo:
    private BingoButton extractButton = new BingoButton(105, 622, 200, 25, "Sacar número", bingoPanel);
    private BingoButton placeButton = new BingoButton(315, 622, 200, 25,"Colocar números", bingoPanel, false);
    private BingoButton resetButton = new BingoButton(315, 622, 200, 25, "Restablecer", bingoPanel);

    // Array con las bolas del bingo:
    private BallsArray ballsArray = new BallsArray(bingoPanel);

    public Bingo(String ABSOLUTE_PATH_TO_DIR_IMG){
        setABSOLUTE_PATH_TO_DIR_IMG(ABSOLUTE_PATH_TO_DIR_IMG);

    }

    protected void setABSOLUTE_PATH_TO_DIR_IMG(String ABSOLUTE_PATH_TO_DIR_IMG){
        Bingo.ABSOLUTE_PATH_TO_DIR_IMG = ABSOLUTE_PATH_TO_DIR_IMG;
    }

    protected static String getABSOLUTE_PATH_TO_DIR_IMG(){
        return ABSOLUTE_PATH_TO_DIR_IMG;
    }

    int extractions = 1;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==placeButton.getButton()){

            if(extractions >= 15){
                extractButton.getButton().setEnabled(false);
                placeButton.getButton().setEnabled(true);
            }

            for(int i = 0; i < 15; i++){
                ballsArray.makeBallImageInBallImagesRowVisible(i);
                extractions++;
            }

        } else if (e.getSource()== placeButton.getButton()){

            placeButton.getButton().setEnabled(false);
            for(int i = 0; i < 15; i++) {
                ballsArray.makeBallImageInBingoCardVisible(i);
            }

        } else if (e.getSource()== resetButton.getButton()){
            dispose();
            Main.main(null);
        }
    }
}






