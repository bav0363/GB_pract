package geekbrains_seminar_6.srp1;

public class SquareDrawer {
    // region Private Fields
    private SquareV2 squareV2;

    private int scale = 1;

    //endregion

    //region Constructors

    public SquareDrawer(SquareV2 squareV2) {
        this.squareV2 = squareV2;
    }

    public SquareDrawer(SquareV2 squareV2, int scale) {
        this.squareV2 = squareV2;
        this.scale = scale;
    }

    //endregion

    //region Public Getters And Setters (Properties)

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    // endregion

    //region Public Methods
    public void draw(){
        for (int i = 0; i < squareV2.getSide() * 2 * scale; i ++){
            System.out.printf("* ");
        }
        System.out.println();
        for (int i = 0; i < squareV2.getSide() * scale; i ++){
            System.out.printf("*");
            for (int j = 1; j < squareV2.getSide() * scale; j ++){
                System.out.printf("    ");
            }
            System.out.println(" *");
        }
        for (int i = 0; i < squareV2.getSide() * 2 * scale; i ++){
            System.out.printf("* ");
        }
        System.out.println();
    }
    // endregion
}
