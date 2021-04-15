package com.twalter18.geoquiz2021;

public class Question {

    private int mTextRedId;
    private boolean mAnswerTrue;

    public Question(int textRedId, boolean answerTrue) {
        mTextRedId = textRedId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextRedId;
    }

    public void setTextResId(int textRedId) {
        mTextRedId = textRedId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
