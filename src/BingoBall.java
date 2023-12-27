public class BingoBall {

    private int value;
    private final int BALL_IMAGE_Y_POSITION_IN_BALL_IMAGES_ROW = 563;
    private int ballXPositionInBallsRow;
    private int xPanelPosition;
    private int yPanelPosition;
    private final int IMAGE_WIDTH = 55;
    private final int IMAGE_HEIGHT = 55;
    private String imagePath;

    private BingoPanel bingoPanel;

    private BingoImage ballImageInBallImagesRow = new BingoImage(
            ballXPositionInBallsRow,
            BALL_IMAGE_Y_POSITION_IN_BALL_IMAGES_ROW,
            IMAGE_WIDTH,
            IMAGE_HEIGHT,
            imagePath,
            bingoPanel,
            false);

    private BingoImage ballImageInBingoCard = new BingoImage(
            xPanelPosition,
            yPanelPosition,
            IMAGE_WIDTH,
            IMAGE_HEIGHT,
            imagePath,
            bingoPanel,
            false);

    // Ball constructor:
    protected BingoBall(int value, int ballXPositionInBallsRow, int xPanelPosition, int yPanelPosition, String imagePath, BingoPanel bingoPanel){
        this.value = value;
        this.ballXPositionInBallsRow = ballXPositionInBallsRow;
        this.xPanelPosition = xPanelPosition;
        this.yPanelPosition = yPanelPosition;
        this.imagePath = imagePath;
        this.bingoPanel = bingoPanel;
    }

    protected BingoImage getBallImageInBallImagesRow (){
        return ballImageInBallImagesRow;
    }

    protected BingoImage getBallImageInBingoCard(){
        return ballImageInBingoCard;
    }

}