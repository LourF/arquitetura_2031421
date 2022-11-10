public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //parametros
        Point p0 = new Point(0, 0);
        Point p1 = new Point(3, 0);
        Point p2 = new Point(2, 3);

        double distance = p0.distanceTo(p1);
        System.out.println(distance);

        //construtor
        Triangle tr = new Triangle();
        Triangle tr1 = new Triangle(p0, p1, p2);
        Triangle tr2 = new Triangle(new Point(), new Point(3, 0), new Point(2, 3));

        //modificador
        tr.setA(new Point(10, 10));

        //seletor
        Point b = tr2.getB();
        double x = tr2.getC().getX();
        tr1.setABC(new Point(2, 2), p0, b);

        double base = tr2.base();
        System.out.println(base);

        double height = tr2.height();
        System.out.println(height);

        double area = tr2.area();
        System.out.println(area);


        Point p = new Point(2, 3);
        Rectangle rect1 = new Rectangle(new Point(0, 3), 5, 3);

        double areaR = rect1.areaRect();
        System.out.println(areaR);

        double perimenter = rect1.perimeter();
        System.out.println(perimenter);

        boolean contains = rect1.containsPoint(p);
        System.out.println(contains);

    }
}