package fr.damien.entity;

public class Sentence {
    private int sentence_id;
    private String sentence_name;
    private String sentence_text;

    public int getSentenceId() {
        return sentence_id;
    };

    public String getSentenceName() {
        return sentence_name;
    };

    public void setSentenceName(String sentence_name) {
        this.sentence_name = sentence_name;
    };

    public String getSentenceText() {
        return sentence_text;
    };

    public void setSentenceText(String sentence_text) {
        this.sentence_text = sentence_text;
    }
}
