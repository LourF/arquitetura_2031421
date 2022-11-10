public class Point implements  Comparable<Point>{
    //parametros
    private double x;
    private double y;

    //construtor omissao
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    //construtor por parametro
    public Point(final double x, final double y){
        this.x=x;
        this.y=y;
    }

    //modificador
    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    //seletor
    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double distanceTo(Point other) {
        double distance = 0;

        distance = Math.sqrt(Math.pow(other.x- this.x,2) + Math.pow(other.y- this.y,2));

        return distance;
    }
    @Override
    public String toString(){
        return getClass().getSimpleName() + " x= " + x +" y= "+ y;
    }

    @Override
    public int compareTo(Point o){
        //crescente
        int diff = (int)((this.x - o.x) + (this.y - o.y));
        //decrescente
        //int diff = (int)((o.x - this.x ) + (o.y - this.y));
    return diff;
    }
}
