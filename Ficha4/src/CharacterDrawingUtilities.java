public class CharacterDrawingUtilities {
    public static void drawElement (char c){
        System.out.print(c);
    }
    public static void drawNewLine (){
        System.out.println(" ");
    }

    public static void drawHorizontalSegmentWith(char c, int width) {
        for (int i = 0; i < width; i++) {
            drawElement(c);
        }
    }

    public static void drawFilledRectangleWith(char c, int width, int height) {
        for (int i = 0; i < height; i++) {
            drawHorizontalSegmentWith(c,width);
            drawNewLine();
        }
    }

    public static void drawEmptyRectangleWith(char c, int width, int heigth) {
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == heigth  -1 || j == 0 || j == width -1 )
                drawElement(c);
                else System.out.print(" ");
            }
            drawNewLine();
        }
    }
}
