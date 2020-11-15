package com.example.quiz_app;


import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {
    TextView tv, tv2, tv3;
    Button btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        tv3 = (TextView)findViewById(R.id.tvres3);
        btnRestart = (Button) findViewById(R.id.btnRestart);


        StringBuffer sb3 = new StringBuffer();
        sb3.append("Your Score is : " + QuestionsActivity.correct + "\n");

        tv3.setText(sb3);

        QuestionsActivity.correct=0;
        QuestionsActivity.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });
    }

}
