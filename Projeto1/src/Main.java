public class Main {
    public static float perimeter(float width, float length){
        float p = width + width + length + length;
        return p;

    }
    public static float perimeter2(float length,float height ,float width){
        float p =   length * width * height;
        return p;

    }
    public static float temperature(float farenheit){
        float c = (farenheit - 32) * 5/9;
        return c;
    }
    public static float time(float hours, float minutes, float secs ){
        float h = hours * 3600;
        float m = minutes * 60;
        float s = h + m + secs;
        return s;
    }

    private static int max(int[] array) {
        int max= array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
    private static int min(int[] array) {
        int min= array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }
    private static float average(float[] array){
        float med = array[0];
        for (int i = 1; i < array.length; i++){
            med += array[i];
        }
        return med/ array.length;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(perimeter(4, 2));
        System.out.println(perimeter2(5,6,3));
        System.out.println("A temperatura em celsius é"+temperature(100));
        System.out.println(time(1,1,30));
        int [] array = {4,6,7,1,3};
        System.out.println(max(array));
        System.out.println(min(array));
        System.out.println(average(array));
    }

}