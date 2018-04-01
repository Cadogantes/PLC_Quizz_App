package com.example.android.quizzapp2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaration of global variables
    float score;
    EditText etQ1a1;
    RadioButton rbQ2a1;

    RadioButton rbQ2a2;
    RadioButton rbQ2a3;
    RadioButton rbQ3a1;
    RadioButton rbQ3a2;
    RadioButton rbQ3a3;
    ImageView ivQ4;
    RadioButton rbQ4a1;
    RadioButton rbQ4a2;
    RadioButton rbQ4a3;
    CheckBox rbQ5a1;
    CheckBox rbQ5a2;
    CheckBox rbQ5a3;
    RadioButton rbQ6a1;
    RadioButton rbQ6a2;
    RadioButton rbQ6a3;
    RadioButton rbQ7a1;
    RadioButton rbQ7a2;
    RadioButton rbQ7a3;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        AnswersListeners();
    }

    void initialize() {
        score = 0;
        etQ1a1 = findViewById(R.id.q1et);
        rbQ2a1 = findViewById(R.id.q2a1);
        rbQ2a2 = findViewById(R.id.q2a2);
        rbQ2a3 = findViewById(R.id.q2a3);
        rbQ3a1 = findViewById(R.id.q3a1);
        rbQ3a2 = findViewById(R.id.q3a2);
        rbQ3a3 = findViewById(R.id.q3a3);
        ivQ4 = findViewById(R.id.ivQ4);
        rbQ4a1 = findViewById(R.id.q4a1);
        rbQ4a2 = findViewById(R.id.q4a2);
        rbQ4a3 = findViewById(R.id.q4a3);
        rbQ5a1 = findViewById(R.id.q5a1);
        rbQ5a2 = findViewById(R.id.q5a2);
        rbQ5a3 = findViewById(R.id.q5a3);
        rbQ6a1 = findViewById(R.id.q6a1);
        rbQ6a2 = findViewById(R.id.q6a2);
        rbQ6a3 = findViewById(R.id.q6a3);
        rbQ7a1 = findViewById(R.id.q7a1);
        rbQ7a2 = findViewById(R.id.q7a2);
        rbQ7a3 = findViewById(R.id.q7a3);
        btnSubmit = findViewById(R.id.submitAnswers);
    }

    private void AnswersListeners() {
        rbQ2a1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (rbQ2a2.isChecked()) rbQ2a2.setChecked(false);
                if (rbQ2a3.isChecked()) rbQ2a3.setChecked(false);
            }


        });
        rbQ2a2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (rbQ2a1.isChecked()) rbQ2a1.setChecked(false);
                if (rbQ2a3.isChecked()) rbQ2a3.setChecked(false);
            }


        });
        rbQ2a3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (rbQ2a1.isChecked()) rbQ2a1.setChecked(false);
                if (rbQ2a2.isChecked()) rbQ2a2.setChecked(false);
            }


        });

        rbQ3a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ3a2.isChecked()) rbQ3a2.setChecked(false);
                if (rbQ3a3.isChecked()) rbQ3a3.setChecked(false);
            }
        });
        rbQ3a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ3a1.isChecked()) rbQ3a1.setChecked(false);
                if (rbQ3a3.isChecked()) rbQ3a3.setChecked(false);
            }
        });
        rbQ3a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ3a1.isChecked()) rbQ3a1.setChecked(false);
                if (rbQ3a2.isChecked()) rbQ3a2.setChecked(false);
            }
        });

        rbQ4a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ4a2.isChecked()) rbQ4a2.setChecked(false);
                if (rbQ4a3.isChecked()) rbQ4a3.setChecked(false);
            }


        });

        rbQ4a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ4a2.isChecked()) rbQ4a2.setChecked(false);
                if (rbQ4a3.isChecked()) rbQ4a3.setChecked(false);
            }
        });
        rbQ4a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ4a1.isChecked()) rbQ4a1.setChecked(false);
                if (rbQ4a3.isChecked()) rbQ4a3.setChecked(false);
            }
        });
        rbQ4a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ4a1.isChecked()) rbQ4a1.setChecked(false);
                if (rbQ4a2.isChecked()) rbQ4a2.setChecked(false);
            }
        });

        rbQ6a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ6a2.isChecked()) rbQ6a2.setChecked(false);
                if (rbQ6a3.isChecked()) rbQ6a3.setChecked(false);
            }
        });
        rbQ6a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ6a1.isChecked()) rbQ6a1.setChecked(false);
                if (rbQ6a3.isChecked()) rbQ6a3.setChecked(false);
            }
        });
        rbQ6a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ6a1.isChecked()) rbQ6a1.setChecked(false);
                if (rbQ6a2.isChecked()) rbQ6a2.setChecked(false);
            }
        });

        rbQ7a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ7a2.isChecked()) rbQ7a2.setChecked(false);
                if (rbQ7a3.isChecked()) rbQ7a3.setChecked(false);
            }
        });
        rbQ7a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ7a1.isChecked()) rbQ7a1.setChecked(false);
                if (rbQ7a3.isChecked()) rbQ7a3.setChecked(false);
            }
        });
        rbQ7a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbQ7a1.isChecked()) rbQ7a1.setChecked(false);
                if (rbQ7a2.isChecked()) rbQ7a2.setChecked(false);
            }
        });
    }

    void submitAnswers(View view) {
        int points = 0;
        //q1
        if ("SPS".equals(etQ1a1.getText().toString())) points++;
        else if ("sps".equals(etQ1a1.getText().toString())) points++;
        else if ("Sps".equals(etQ1a1.getText().toString())) points++;

        //q2
        if (rbQ2a2.isChecked()) points++;
        //q3
        if (rbQ3a3.isChecked()) points++;
        //q4
        if (rbQ4a1.isChecked()) points++;
        //q5
        if (rbQ5a1.isChecked()&&rbQ5a3.isChecked()&&!rbQ5a2.isChecked()) points++;
        //q6
        if (rbQ6a3.isChecked()) points++;
        //q7
        if (rbQ7a3.isChecked()) points++;
        //summary
        Toast.makeText(this, getString(R.string.summary) + " " + points, Toast.LENGTH_LONG).show();
    }
}
