public class BingoBall {

    private final BingoImage ballImageInBallImagesRow;
    private final BingoImage ballImageInBingoCard;

    // Ball constructor:
    protected BingoBall(int ballXPositionInBallsRow, int xPanelPosition, int yPanelPosition, String imagePath){

        final int BALL_IMAGE_Y_POSITION_IN_BALL_IMAGES_ROW = 563;
        final int IMAGE_WIDTH = 55;
        final int IMAGE_HEIGHT = 55;

        this.ballImageInBallImagesRow = new BingoImage(
                ballXPositionInBallsRow,
                BALL_IMAGE_Y_POSITION_IN_BALL_IMAGES_ROW,
                IMAGE_WIDTH,
                IMAGE_HEIGHT,
                imagePath,
                false);

        this.ballImageInBingoCard = new BingoImage(
                xPanelPosition,
                yPanelPosition,
                IMAGE_WIDTH,
                IMAGE_HEIGHT,
                imagePath,
                false);

    }

    protected BingoImage getBallImageInBallImagesRow (){
        return ballImageInBallImagesRow;
    }

    protected BingoImage getBallImageInBingoCard(){
        return ballImageInBingoCard;
    }

    protected void setImageInRowVisibility (){
        ballImageInBallImagesRow.getImageLabel().setVisible(true);
    }

    protected void setImageInCardVisibility(){
        ballImageInBingoCard.getImageLabel().setVisible(true);
    }

}
