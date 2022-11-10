public class Point {
   // atributos
    private double x;
    private double y;
    // construtor por omisao
    public Point () {
        x = 0.0;
        y = 0.0;
    }

    //seletor
    public double getX(){
        return x;
    }
    public double getY() {
        return y;
    }

    // construtor por parametro
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //modificador
    public void setY(double y){

        this.y = y;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double distanceTo(Point other) {
        double distance = 0;
        distance = Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y-this.y, 2)) ;
        return distance;
    }
}
