
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bingo extends JFrame implements ActionListener {

    private final JPanel bingoPanel = (JPanel) this.getContentPane();

    private String ABSOLUTE_PATH_TO_DIR_IMG;
    private BingoImage numbersTable;
    private BingoImage valDoAsmaLogoImage;
    private BingoImage bingoCardImage;

    // Botones del bingo:
    private BingoButton extractButton;
    private BingoButton placeButton;
    private BingoButton resetButton;

    // Array con las bolas del bingo:
    private BallsArray ballsArray;

    private void bingoPanelBuilder(){
        // Imágenes del bingo:
        numbersTable = new BingoImage(477, 15, 298, 247, "tableroNumeros.png", bingoPanel);
        valDoAsmaLogoImage = new BingoImage(49, 12, 300, 249, "bingoIESVDA.png",  bingoPanel);
        bingoCardImage = new BingoImage(113, 263,600, 297, "cartonBingoEnBlanco.png", bingoPanel);

        // Botones del bingo:
        extractButton = new BingoButton(105, 622, 200, 25, "Sacar número", bingoPanel);
        //JButton extractionButton = extractButton.getButton();
        //bingoPanel.add(extractionButton);
        placeButton = new BingoButton(315, 622, 200, 25,"Colocar números", bingoPanel, false);
        resetButton = new BingoButton(315, 622, 200, 25, "Restablecer", bingoPanel);

        // Array con las bolas del bingo:
        ballsArray = new BallsArray(bingoPanel);
    }

    // Creación JPanel:
    //private final BingoPanel bingoPanel = new BingoPanel();


    public Bingo(String ABSOLUTE_PATH_TO_DIR_IMG){
        setSize(842, 750);
        setTitle("Bingooooooooo !!!");
        setResizable(true);
        setLocation(25, 25);

        bingoPanel.setLayout(null);
        bingoPanel.setBackground(Color.decode("#FFC482"));
        //bingoPanelBuilder();
        setVisible(true);

        this.ABSOLUTE_PATH_TO_DIR_IMG = ABSOLUTE_PATH_TO_DIR_IMG;
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






