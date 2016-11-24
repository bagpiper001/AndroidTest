package com.example.rberkel.bignerdranch;

/**
 * Created by RBERKEL on 24-11-2016.
 */

public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse (int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion(){
        return mQuestion;
    }

    public boolean getTrueQuestion() {
        return mTrueQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
