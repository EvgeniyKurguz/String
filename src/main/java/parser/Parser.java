package parser;


import entity.Paragraph;
import entity.Sentence;
import entity.Text;
import entity.Word;

public class Parser {

    public static Text parseText(String textSourceString) {
        Text text = new Text();
        String[] parSourceStrings = textSourceString.split("\n");
        for (String parSourceString : parSourceStrings) {
            Paragraph paragraph = parseParagraph(parSourceString);
            text.add(paragraph);
        }
        return text;
    }

    private static Paragraph parseParagraph(String parSourceString) {
        Paragraph paragraph = new Paragraph();
        String[] senSourceStrings = parSourceString.split("[\\.!?]");
        for (String senSourceString : senSourceStrings) {
            Sentence sentence = parseSentence(senSourceString);
            paragraph.add(sentence);
        }
        return paragraph;
    }

    public static Sentence parseSentence(String senSourceString) {
        Sentence sentence = new Sentence();
        String[] wordSourceStrings = senSourceString.split("[\\s\\p{Punct}]?");
        for (String wordSourceString : wordSourceStrings) {
            Word word = parseWord(wordSourceString);
            sentence.add(word);
        }
        return sentence;
    }

    public static Word parseWord(String wordSourceString) {
        Word word = new Word();
        String[] symbSourceStrings = wordSourceString.split("");
        for (String symbSourceString : symbSourceStrings) {
            char[] chars = symbSourceString.toCharArray();
            word.add(chars);

        }
        return word;
    }
}