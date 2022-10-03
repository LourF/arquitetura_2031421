public class Main {
    public static void main(String[] args) {
        System.out.println(NumericalUtilities.powerOf(2,3));
        System.out.println(NumericalUtilities.sumOfNaturalNumbersUpTo(100));
        System.out.println(NumericalUtilities.sumOfNaturalNumbersBetween(0,10));
        System.out.println(NumericalUtilities.sumOfEvenNumbersBetween(0,8));
        System.out.println(NumericalUtilities.numberOfDivisorsOf(100));
        System.out.println(NumericalUtilities.isPrime(100));
        int [] array = {2,7,3,3,9};
        System.out.println(ArrayUtilities.toString(array));
        System.out.println(ArrayUtilities.maximumOf(array));
        System.out.println(ArrayUtilities.minimumOf(array));
        int [] copy = ArrayUtilities.copyOf(array);
        System.out.println(ArrayUtilities.toString(copy));
        System.out.println((ArrayUtilities.contains(array, 9)));
        System.out.println(ArrayUtilities.containsDuplicates(array));
        System.out.println(ArrayUtilities.indexOf(array,3));
        System.out.println(ArrayUtilities.add(array,10));
        System.out.println(ArrayUtilities.remove(array,3));
    }
}
