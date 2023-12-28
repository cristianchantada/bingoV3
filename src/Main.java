public class Main {

    /**
     * Set the following configuration variables:
     *
     * 1--> Set the absolute path to the directory of your project in which you have the bingo images:
     *      ABSOLUTE_PATH_TO_DIR_IMG = "C:\\myProject\\img"
     */

    private final static String ABSOLUTE_PATH_TO_DIR_IMG = "C:\\Users\\Usuario\\Desktop\\bingoV3\\bingoV3\\img";

    protected static String getAbsolutePathToDirImg(){
        return ABSOLUTE_PATH_TO_DIR_IMG;
    }

    public static void main(String[] args) {
        new Bingo();
    }

}
