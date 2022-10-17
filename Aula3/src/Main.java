public class Main {
    public static void main(String[] args) {

        int [] array = {1,2,3};
        char next = CharacterUtilities.lowerLetterPredecessorOf('a');

        System.out.println(CharacterUtilities.lowerLetterSuccessorOf('z'));
        System.out.println(CharacterUtilities.lowerLetterPredecessorOf('a'));
        System.out.println(CharacterUtilities.lowerLetterSuccessorStepsOf('b', 1));
        System.out.println(CharacterUtilities.lowerLetterPredecessorStepsOf('z', 3));
        System.out.println(CharacterUtilities.occurrencesOfCharacterIn(new char[] {'a','b', 'a'}, 'a'));
        System.out.println(CharacterUtilities.replaceCharacterIn(new char[]{'a','b','c','a'}, 'a','c'));
        System.out.println(CharacterUtilities.concatenationOf(new char []{'a','b','c'}, new char []{'d','e'}));
        //System.out.println(CharacterUtilities.copyOfPartOf(new char[]{}));
        System.out.println(CaesarCipherDecipherer.cipher(2,"a"));
        System.out.println(CaesarCipherDecipherer.decipher(2,"c"));
    }
}