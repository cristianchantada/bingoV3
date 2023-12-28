import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bingo extends JFrame implements ActionListener {

    // Variable de control para la visibilidad de las bolas.
    private int iPosition;

    // Creación JPanel:
    private final JPanel bingoPanel = (JPanel) this.getContentPane();


    // Imágenes del bingo:
    private final BingoImage numbersTable = new BingoImage(477, 15, 298, 247, "tableroNumeros.png");
    private JLabel numbersTableImageLabel= numbersTable.getImageLabel();
    private final BingoImage valDoAsmaLogoImage = new BingoImage(49, 12, 300, 249, "bingoIESVDA.png");
    private JLabel valDoAsmaLogoImageLabel = valDoAsmaLogoImage.getImageLabel();
    private final BingoImage bingoCardImage = new BingoImage(113, 263,600, 297, "cartonBingoEnBlanco.png");
    private JLabel bingoCardImageLabel = bingoCardImage.getImageLabel();

    // Botones del bingo:
    private final BingoButton extractButtonConstructor = new BingoButton(105, 622, 200, 25, "Sacar número");
    private JButton extractButton = extractButtonConstructor.getButton();
    private final BingoButton placeButtonConstructor = new BingoButton(315, 622, 200, 25,"Colocar números",false);
    private JButton placeButton = placeButtonConstructor.getButton();
    private final BingoButton resetButtonConstructor = new BingoButton(525, 622, 200, 25, "Restablecer");
    private JButton resetButton = resetButtonConstructor.getButton();

    // Array con las bolas del bingo:
    private final BallsArray ballsArrayConstructor = new BallsArray();
    private BingoBall[] ballsArray = ballsArrayConstructor.getBingoBallsArray();

    public Bingo(){
        setSize(842, 750);
        setTitle("Bingooooooooo !!!");
        setResizable(true);
        setLocation(25, 25);

        bingoPanel.setLayout(null);
        bingoPanel.setBackground(Color.decode("#FFC482"));

        // Añadiendo imágenes al panel
        bingoPanel.add(numbersTableImageLabel);
        bingoPanel.add(valDoAsmaLogoImageLabel);
        bingoPanel.add(bingoCardImageLabel);
        bingoPanel.setComponentZOrder(bingoCardImageLabel, 1);

        // Añadiendo botones al panel
        extractButton.addActionListener(this);
        placeButton.addActionListener(this);
        resetButton.addActionListener(this);
        bingoPanel.add(extractButton);
        bingoPanel.add(placeButton);
        bingoPanel.add(resetButton);

        for(int i = 0; i < 15 ; i++){
            bingoPanel.add(ballsArray[i].getBallImageInBingoCard().getImageLabel());
            bingoPanel.setComponentZOrder(ballsArray[i].getBallImageInBingoCard().getImageLabel(), 0);
            bingoPanel.add(ballsArray[i].getBallImageInBallImagesRow().getImageLabel());
        }

        setVisible(true);
    }

    int extractions = 1;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==extractButton){

            if(extractions >= 15){
                extractButton.setEnabled(false);
                placeButton.setEnabled(true);
            }

            ballsArray[iPosition++].setImageInRowVisibility(true);
            extractions++;

        } else if (e.getSource()== placeButton){

            placeButton.setEnabled(false);
            for(int i = 0; i < 15; i++) {
                ballsArray[i].setImageInCardVisibility(true);
            }

        } else if (e.getSource()== resetButton){
            dispose();
            Main.main(null);
        }
    }
}






