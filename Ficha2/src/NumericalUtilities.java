public class NumericalUtilities {


    public static int powerOf (int base, int exponent) {
        int res = base;
        for (int i = 1;i < exponent; i++){
             res = res * base;
        }
        return res;
    }

    public static  int sumOfNaturalNumbersUpTo (int num){
        int n1= 1;
        int res= 0;
        for (int i = 0; i < num; i++){
            res += n1;
            n1++;

        }
        return res;
    }

    public static int sumOfNaturalNumbersBetween (int num, int num2){
        int result= 0;
        int number = num;
        for (int i = num; i <= num2; i++){
            result += number;
            number ++;
        }
        return result;
    }

    public static int sumOfEvenNumbersBetween (int num, int num2){
        int result = 0;
        int number = num;
        for (int i = num; i <= num2; i++){
        if (i % 2 == 0){
            result += number;
        }
        number++;
        }
    return result;
    }
    public static int numberOfDivisorsOf(int num){
        int result=0;
        for (int i=1; i<=num; i++){
            if(num%i==0){
                result++;
            }
        }
        return result;
    }

    public static boolean isPrime(int num){
        int result=0;
        for (int i=1; i<=num; i++){
            if(num%i==0){
                result++;
            }
        }
        if (result==2){
            return true;
        }
        else {
            return false;
        }
    }
}

