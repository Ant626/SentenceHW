public class Word extends Sentence{


    private String noVowelWord;

    public Word(String s, String w){

        super(s);

        noVowelWord = w.replaceAll("[aeiouAEIOU]*", "");

    }


    public String getNoVowelWord() {

        return noVowelWord;
    }

    public boolean isSubstring(){

       return super.getSentence().contains(getNoVowelWord());


    }










}