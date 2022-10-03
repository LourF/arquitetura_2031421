public class ArrayUtilities {
    public static String toString(int[] array){
        String str = "[ ";
        for (int i = 0; i < array.length; i++){
            if (i < array.length -1){
                str += array[i] + ", ";
            }
            else{
                str += array[i];
            }
        }
        str += " ]";
        return str;
    }
    public static int maximumOf(int [] array) {
        int max= array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
    public static int minimumOf(int [] array){
        int min= array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static int[] copyOf(int[] array){
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }
    public static boolean contains(int[] array, int number){
        boolean contains = false;
        for (int i = 0; i < array.length;i++){
            if(array[i] == number) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public static boolean containsDuplicates(int[] array){
        int[] duplicateArray = new int[array.length];
        boolean contains = false;
        for (int i = 0; i < array.length; i++){
            duplicateArray[i] = array[i];
            for (int o = 0; o < i; o++) {
                if (duplicateArray[o] == array[i]){
                    contains = true;
                    break;
                }
            }
        }
        return contains;
    }

    public static String indexOf(int[] array, int number){
        String indexOf = "";
        for (int i = 0; i < array.length;i++){
            if (array[i] == number){
                if (indexOf.length() == 0){
                    indexOf += i;
                }
                else {
                    indexOf = indexOf + "," + i;
                }
            }
        }
        return indexOf;
    }

    public static int[] add(int[] array, int number){
        int [] newArray = new int[array.length + 1];
        for (int i = 0; i < newArray.length; i++){
            if (i == newArray.length-1){
                newArray[i] = number;
            }
            else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }

    public static int[] remove(int[] array, int index){
        int [] newArray = new int[array.length - 1];
        int o = 0;
        for (int i = 0; i < array.length; i++){
            if(i != index){
                newArray[o] = array[i];
                o++;
            }
        }
        return newArray;
    }

}
