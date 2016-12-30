package com.example.rberkel.bignerdranch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by RBERKEL on 27-12-2016.
 */

public class CheatActivity extends Activity {
    public final static String EXTRA_ANSWER_IS_TRUE = "com.example.rberkel.bignerdranch.answer_is_true";
    private boolean mAnswerIsTrue;
    private TextView mAnswerTextView;
    private Button mShowAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        mAnswerTextView = (TextView)findViewById(R.id.answerTextView);

        mShowAnswer = (Button)findViewById(R.id.showAnswerButton);
        mShowAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mAnswerIsTrue) {
                    mAnswerTextView.setText(R.string.true_button);
                } else {
                    mAnswerTextView.setText(R.string.false_button);
                }
            }
        });

    }
}
