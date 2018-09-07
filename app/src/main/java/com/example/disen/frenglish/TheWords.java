package com.example.disen.frenglish;

/**
 * Created by disen on 6/6/2017.
 */

public class TheWords {

    private String EnglishWord;
    private String FrenchTranslation;
    private int Image;


    public TheWords(String defaultWord, String Translation, int image) {
        EnglishWord = defaultWord;
        FrenchTranslation = Translation;
        Image = image;
    }

    public String getWOrd() {
        return EnglishWord;
    }

    public String getFrenchTranslation() {
        return FrenchTranslation;
    }

    public int getImage() {
        return Image;
    }
}
