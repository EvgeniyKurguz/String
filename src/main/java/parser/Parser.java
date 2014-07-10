package parser;

import entity.Paragraph;
import entity.Sentence;
import entity.Symbol;
import entity.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Parser {

    public static List<Symbol> parseToSymbols(String originalString) {
        List<Symbol> resultList = new ArrayList<>();
        String[] result = originalString.split("");
        for (String res : result) {
            resultList.add(new Symbol(res));
        }
        return resultList;
    }

    public static List<Word> parseToWords(List<Symbol> symbols) {
        List<Symbol> originSymbol = new ArrayList<>();
        List<Word> resultList = new ArrayList<>();
        Pattern pattern = Pattern.compile("[\\s\\p{Punct}]?");
        for (Symbol symbol : symbols) {
            if (!pattern.matcher(symbol.toString()).matches()) {
                originSymbol.add(symbol);
            } else {
                Word word = new Word(originSymbol);
                word.setType(Word.Type.WORD);
                resultList.add(word);

                originSymbol = new ArrayList<>();
                originSymbol.add(symbol);

                word = new Word(originSymbol);
                word.setType(Word.Type.SEPARATOR);
                resultList.add(word);

                originSymbol = new ArrayList<>();
            }
        }
        return resultList;
    }

    public static List<Paragraph> parseToParagraphs(List<Sentence> sentences) {
        List<Sentence> originSentence = new ArrayList<>();
        List<Paragraph> resultList = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\n");
        for (Sentence sentence : sentences) {
            if (!pattern.matcher(sentence.toString()).matches()) {
                originSentence.add(sentence);
            } else {
                resultList.add(new Paragraph(originSentence));
                originSentence = new ArrayList<>();
                originSentence.add(sentence);
            }
        }
        return resultList;
    }
}