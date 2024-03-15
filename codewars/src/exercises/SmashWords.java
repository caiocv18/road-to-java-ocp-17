package exercises;
/*
Sentence Smash
Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!

Example
['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
*/
public class SmashWords {

    public static String smash(String... words) {
        if(words.length == 0){
            return "";
        }else{
            StringBuilder smashedWord = new StringBuilder();
            for(String word : words){
                smashedWord.append(word).append(" ");
            }
            smashedWord.deleteCharAt(smashedWord.length() - 1);
            return smashedWord.toString();
        }
    }

    public static String smashBestSolution(String... words) {
        return String.join(" ", words);
    }
}