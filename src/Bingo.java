import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bingo extends JFrame implements ActionListener {

    // Control variable for ball visibility.
    private int iPosition;

    // Bingo buttons:
    private final BingoButton extractButtonConstructor = new BingoButton(105, 622, 200, 25, "Sacar número");
    private final JButton extractButton = extractButtonConstructor.getButton();
    private final BingoButton placeButtonConstructor = new BingoButton(315, 622, 200, 25,"Colocar números",false);
    private final JButton placeButton = placeButtonConstructor.getButton();
    private final BingoButton resetButtonConstructor = new BingoButton(525, 622, 200, 25, "Restablecer");
    private final JButton resetButton = resetButtonConstructor.getButton();

    // Array with bingo balls:
    private final BallsArray ballsArrayConstructor = new BallsArray();
    private final BingoBall[] ballsArray = ballsArrayConstructor.getBingoBallsArray();

    public Bingo(){

        // JPanel creation:
        JPanel bingoPanel = (JPanel) this.getContentPane();

        setSize(842, 750);
        setTitle("Bingooooooooo !!!");
        setResizable(true);
        setLocation(25, 25);

        bingoPanel.setLayout(null);
        bingoPanel.setBackground(Color.decode("#FFC482"));

        // Bingo images:
        BingoImage numbersTable = new BingoImage(477, 15, 298, 247, "tableroNumeros.png");
        BingoImage valDoAsmaLogoImage = new BingoImage(49, 12, 300, 249, "bingoIESVDA.png");
        BingoImage bingoCardImage = new BingoImage(113, 263, 600, 297, "cartonBingoEnBlanco.png");
        // Adding images to the panel:
        bingoPanel.add(numbersTable.getImageLabel());
        bingoPanel.add(valDoAsmaLogoImage.getImageLabel());
        bingoPanel.add(bingoCardImage.getImageLabel());
        bingoPanel.setComponentZOrder(bingoCardImage.getImageLabel(), 1);

        // Adding buttons to the panel:
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

            ballsArray[iPosition++].setImageInRowVisibility();
            extractions++;

        } else if (e.getSource()== placeButton){

            placeButton.setEnabled(false);
            for(int i = 0; i < 15; i++) {
                ballsArray[i].setImageInCardVisibility();
            }

        } else if (e.getSource()== resetButton){
            dispose();
            Main.main(null);
        }
    }
}






