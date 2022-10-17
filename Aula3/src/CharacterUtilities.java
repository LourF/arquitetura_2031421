public class CharacterUtilities {
    public static char lowerLetterSuccessorOf(char character) {
        if (character == 'z')
            return 'a';
        int code = (int) character;
        code++;
        return (char) code;
    }
    public static char lowerLetterPredecessorOf(char letter){
        if ( letter == 'a'){
            return 'z';
        }
        else{
            letter--;
            return letter;
        }
    }

    public static char lowerLetterSuccessorStepsOf(char character, int value) {
        if (character == 'z') {
            character = 'a';
            character += (value - 1);
        }
        else {
            character += value;
        }
        return character;
    }
    public static char lowerLetterPredecessorStepsOf(char character, int value){
        char next = character;
        for (int i = 0; i < value; i++) {
            next = lowerLetterPredecessorOf(next);
        }
        return next;
    }

    public static int occurrencesOfCharacterIn(char [] characters, char character){
        int count = 0;
        for(int i=0; i<characters.length;i++){
            if(characters[i]== character)
                count++;
        }
        return count;
    }
    public static char[] replaceCharacterIn(char [] array, char ch, char replace) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                array[i] = replace;
            }
        }
        return array;
    }
    public static char [] concatenationOf(char [] array, char [] array2){
        char [] newarray = new char[array.length+array2.length];
        for(int i=0;i<array.length;i++)
            newarray[i]=array[i];
        for(int i=0; i<array2.length;i++)
            newarray[i+array.length] = array2[i];
        return newarray;
    }
    public static char[] copyOfPartOf(char[] array, int indexStart, int indexEnd){
        char[] result = new char[indexEnd - indexStart + 1];
        int o = 0;
        for (int i = indexStart; i <= indexEnd; i++){
            result[o] = array[i];
            o++;
        }
        return result;
    }

}
