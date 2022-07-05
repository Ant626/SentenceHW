public class Sentence {

    private String sentence;

    public Sentence(String sentence){

        this.sentence = sentence;
    }

    public String getSentence() {

        return sentence;
    }

    public  boolean isequals(Sentence sentence){

        if (this.sentence.equals(sentence.sentence)){

            return true;
        }else {
            return false;
        }

    }

}