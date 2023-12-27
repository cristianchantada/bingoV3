import java.util.Arrays;

public class BallsArray {

    private BingoBall[] bingoBallsArray = new BingoBall[15];
    private BingoPanel bingoPanel;

    protected BallsArray(BingoPanel bingoPanel){

        this.bingoPanel = bingoPanel;

        // Number of balls to be selected from each ten balls.
        // (All tens select 2 balls, except for 30, 60 and 80 which select 1).
        int[] ballsQuantity = {2, 2, 2, 1, 2, 2, 1, 2, 1};
        randomBallSelector(ballsQuantity);
    }

    protected void makeBallImageInBallImagesRowVisible(int i){
        bingoBallsArray[i].getBallImageInBallImagesRow().getImageLabel().setVisible(true);
    }

    protected void  makeBallImageInBingoCardVisible(int i){
        bingoBallsArray[i].getBallImageInBingoCard().getImageLabel().setVisible(true);
    }

    protected void randomBallSelector(int[] ballsQuantity){

        int number;
        String ballStr;
        int max = 10;
        int min = max - 9;
        int ballsQuantityLength = ballsQuantity.length;
        int ballPositionInRow = 0;
        int[] repeatedBallCheckerArray = new int[15];

        int[][] ballCoordinates = {
                {26, 40}, {149,40}, {273,40}, {336, 40}, {522, 40},
                {26, 122}, {87, 122},{211, 122}, {336, 122}, {459, 122},
                {87, 204}, {149, 204}, {273, 204}, {397,204}, {459,204}
        };

        for(int i = 0; i < ballsQuantityLength; i++) {
            for(int j = 0; j < ballsQuantity[i]; j++) {
                do {
                    number = min + (int) (Math.random() * (max - min + 1));
                    ballStr = number + ".png";

                } while (Arrays.asList(repeatedBallCheckerArray).contains(number));

                max += 10;
                repeatedBallCheckerArray[i + j] = number;
                bingoBallsArray[i] = new BingoBall(
                        number, ballPositionInRow, ballCoordinates[i + j][0], ballCoordinates[i + j][1], ballStr
                );

                ballPositionInRow += 55;
            }
        }
    }

}
