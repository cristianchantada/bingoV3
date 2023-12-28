import java.util.Arrays;

public class BallsArray {

    private BingoBall[] bingoBallsArray = new BingoBall[15];

    protected BallsArray(){
        // Number of balls to be selected from each ten balls.
        // (All tens select 2 balls, except for 30, 60 and 80 which select 1).
        int[] ballsQuantity = {2, 2, 2, 1, 2, 2, 1, 2, 1};
        randomBallSelector(ballsQuantity);
    }

    protected BingoBall[] getBingoBallsArray(){
        return bingoBallsArray;
    }

    protected void randomBallSelector(int[] ballsQuantity){

        int number;
        int max = 10;
        int min = 1;
        int ballsQuantityLength = ballsQuantity.length;
        int ballPositionInRow = 0;
        Integer[] repeatedBallCheckerArray = new Integer[15];
        int counter = 0;

        int[][] ballCoordinates = {
                {26, 40}, {26, 122}, {87, 122}, {87, 204}, {149,40},
                {149, 204}, {211, 122},{273,40}, {273, 204}, {336, 40},
                {336, 122}, {397,204}, {459,122}, {459,204}, {522, 40}
        };

        for(int i = 0; i < ballsQuantityLength; i++) {
            for(int j = 0; j < ballsQuantity[i]; j++) {
                do {
                    number = min + (int) (Math.random() * (max - min + 1));
                } while (Arrays.asList(repeatedBallCheckerArray).contains(number));

                repeatedBallCheckerArray[counter++] = number;

            }
            max += 10;
            min += 10;
        }

        Arrays.sort(repeatedBallCheckerArray);

        for(int i = 0; i < repeatedBallCheckerArray.length; i++){
            String ballStr = repeatedBallCheckerArray[i] + ".png";
            bingoBallsArray[i] = new BingoBall(
                    repeatedBallCheckerArray[i], ballPositionInRow, ballCoordinates[i][0] + 113, ballCoordinates[i][1] + 263, ballStr);
            ballPositionInRow += 55;
        }
    }
}
