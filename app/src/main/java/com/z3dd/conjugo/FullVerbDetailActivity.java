package com.z3dd.conjugo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FullVerbDetailActivity extends AppCompatActivity {

    private TextView verbNameTextView;
    private EditText verbNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_verb_detail_display);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.verb_detail_layout);
        RelativeLayout.LayoutParams textViewParams =
                new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
        textViewParams.addRule(RelativeLayout.ALIGN_END, R.id.definition_text_view);

        verbNameTextView = new TextView(this);
        verbNameEditText = new EditText(this);
        verbNameTextView.setText("Verb Name");
        verbNameTextView.setLayoutParams(textViewParams);

        RelativeLayout.LayoutParams editTextViewParams =
                new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
        editTextViewParams.addRule(RelativeLayout.ALIGN_START, R.id.nos_text_view);


        verbNameEditText.setLayoutParams(editTextViewParams);

        relativeLayout.addView(verbNameTextView);
        relativeLayout.addView(verbNameEditText);

    }

}
