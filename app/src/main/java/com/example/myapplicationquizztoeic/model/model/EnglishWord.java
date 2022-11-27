package com.example.myapplicationquizztoeic.model.model;

import androidx.annotation.NonNull;

import java.util.List;

public class EnglishWord {
    //Declaration des variables pour stocker les propositions de traduction des EnglishWords
    // avec création automatique du constructeur et des getters et setters correspondants
    private String mEnglishWord;
    private List<String> mTraductionListe; // Liste des traductions proposées
    private int mChoixIndex;


    // Constructeur de la classe EnglishWord
    public EnglishWord(@NonNull String EnglishWord, @NonNull List<String> TraductionListe, int ChoixIndex) {
        mEnglishWord = EnglishWord;
        mTraductionListe = TraductionListe;
        mChoixIndex = ChoixIndex;
    }

    // Getter & Setter de mEnglishWord
    public String getEnglishWord() {
        return mEnglishWord;
    }

    public void setEnglishWord(String mEnglishWord) {
        this.mEnglishWord = mEnglishWord;
    }

    // Getter & Setter de mTraductionListe
    public List<String> getTraductionListe() {
        return mTraductionListe;
    }

    public void setTraductionListe(List<String> mTraductionListe) {
        this.mTraductionListe = mTraductionListe;
    }


    // Getter & Setter de mChoixIndex
    public int getChoixIndex() {
        return mChoixIndex;
    }

    public void setChoixIndex(int mChoixIndex) {
        this.mChoixIndex = mChoixIndex;
    }


}
