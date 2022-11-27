package com.example.myapplicationquizztoeic.model.model;

import java.util.Collections;
import java.util.List;

// Cette classe gère les englishswords et traductions possibles

public class TraductionBank {
    private List<EnglishWord> mEnglishWordList;
    private int mNextEnglishWordIndex;

    public TraductionBank(List<EnglishWord> EnglishWordList) {
        // Shuffle the question list before storing it
        mEnglishWordList = EnglishWordList;
        Collections.shuffle(mEnglishWordList); // Utilisation de la méthode shuffle pour mélanger les EnglishWords

    }

    public EnglishWord getCurrentEnglishWord(){
        return mEnglishWordList.get(mNextEnglishWordIndex);
    }


    public EnglishWord getNextEnglishWord() {
        // Loop over the questions and return a new one at each call
        mNextEnglishWordIndex++;

        return getCurrentEnglishWord();
    }
}
