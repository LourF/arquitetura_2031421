public class Triangle {
    //atributos
    private Point a;
    private Point b;
    private Point c;

    //construtor por omisao
    public Triangle(){
        a = new Point();
        b = new Point(3,0);
        c = new Point(2,3);
    }

    // contrutor por parametro
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //seletor
    public Point getA(){
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    //modificador

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setABC(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double base(){
       return a.distanceTo(b);

    }

    public double height(){
        return a.distanceTo(c);
    }

    public double area(){
        return ((base() * height()) / 2);
    }

}
