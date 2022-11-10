public class Rectangle {
    //parametros
    private Point topLeftPoint;
    private double height;
    private double width;

    //construtor omissao
    public Rectangle() {
        this.topLeftPoint = new Point();
        this.height = 0;
        this.width = 0;
    }

    //construtor por omissao
    public Rectangle(Point topLeftPoint, double height, double width) {
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    //seletor
    public Point TopLeftPoint() {
        return topLeftPoint;
    }

    public double Height() {
        return height;
    }

    public double Width() {
        return width;
    }

    //modificador
    public void TopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void Height(double height) {
        this.height = height;
    }

    public void Width(double width) {
        this.width = width;
    }

    public double areaRect() {
        return height * width;
    }

    public double perimeter() {
        return (height * 2) + (width * 2);
    }

    public boolean containsPoint(Point point) {

        Point bottomLeftPoint = new Point(topLeftPoint.getX(), topLeftPoint.getY() - height);
        Point bottomRightPoint = new Point(bottomLeftPoint.getX() + width, bottomLeftPoint.getY());
        Point topRightPoint = new Point(bottomRightPoint.getX(), topLeftPoint.getY());

        if (point.getX() > topLeftPoint.getX() && point.getX() < topRightPoint.getX()
                && point.getY() > bottomLeftPoint.getY() && point.getY() < topLeftPoint.getY()) {
            return true;
        } else {
            return false;
        }
    }
}
