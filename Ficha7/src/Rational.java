import java.util.Comparator;
import java.util.Objects;

public class Rational implements Comparable <Rational> {
    private int numerator;
    private int dominator;

    public Rational() {
        this.numerator = 0;
        this.dominator = 0;
    }

    public Rational(int numerator, int dominator) {
        this.numerator = numerator;
        this.dominator = dominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDominator() {
        return dominator;
    }

    public void setDominator(int dominator) {
        this.dominator = dominator;
    }

    @Override
    public boolean equals(Object o){
    Rational other = (Rational) o;
    return this.numerator == other.numerator
            && this.dominator == other.dominator;
    }

    @Override
    public int compareTo(Rational o) {
        int numDiff =  this.getNumerator() - o.getNumerator();
        int denoDiff = this.getDominator() - o.getDominator();
        return numDiff + denoDiff;

    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, dominator);
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", dominator=" + dominator +
                '}';
    }
}
