package com.example.android.myquizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.myquizapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score = 0; String name;

    public void evaluation()
    {   EditText name_field = findViewById(R.id.name);
        name = name_field.getText().toString();

        EditText ans_1 = findViewById(R.id.ans1);
        String ans1 = ans_1.getText().toString();

        EditText ans_2 = findViewById(R.id.ans2);
        String ans2 = ans_2.getText().toString();

        EditText ans_3 = findViewById(R.id.ans3);
        String ans3 = ans_3.getText().toString();

        CheckBox opt4a = findViewById(R.id.opt4a);
        boolean isans4a = opt4a.isChecked();

        CheckBox opt4b = findViewById(R.id.opt4b);
        boolean isans4b = opt4b.isChecked();

        CheckBox opt4c = findViewById(R.id.opt4c);
        boolean isans4c = opt4c.isChecked();

        CheckBox opt4d = findViewById(R.id.opt4d);
        boolean isans4d = opt4d.isChecked();

        CheckBox opt5a = findViewById(R.id.opt5a);
        boolean isans5a = opt5a.isChecked();

        CheckBox opt5b = findViewById(R.id.opt5b);
        boolean isans5b = opt5b.isChecked();

        CheckBox opt5c = findViewById(R.id.opt5c);
        boolean isans5c = opt5c.isChecked();

        CheckBox opt5d = findViewById(R.id.opt5d);
        boolean isans5d = opt5d.isChecked();

        RadioButton ques6 = findViewById(R.id.opt6c);
        boolean isans6 = ques6.isChecked();

        RadioButton ques7 = findViewById(R.id.opt7b);
        boolean isans7 = ques7.isChecked();

        RadioButton ques8 = findViewById(R.id.opt8c);
        boolean isans8 = ques8.isChecked();

        RadioButton ques9 = findViewById(R.id.opt9b);
        boolean isans9 = ques9.isChecked();

        RadioButton ques10 = findViewById(R.id.opt10b);
        boolean isans10 = ques10.isChecked();

        if(ans1.equalsIgnoreCase("Purlicue"))
            score++;

        if(ans2.equalsIgnoreCase("Bilingual"))
            score++;

        if(ans3.equalsIgnoreCase("Somniloquy" ) )
            score++;

        if(isans4a && isans4b && isans4c && isans4d)
            score++;

        if (isans5b && isans5d && !isans5a && !isans5c)
            score++;

        if (isans6)
            score++;

        if (isans7)
            score++;

        if (isans8)
            score++;

        if (isans9)
            score++;

        if (isans10)
            score++;

    }

    public void submit(View view)
    {   evaluation();
        if (score == 10) {
            Toast toast = Toast.makeText(this, "Weldone", Toast.LENGTH_LONG);
            toast.show();
        } else if (score >= 7 && score < 10) {
            Toast toast = Toast.makeText(this, "Can do better", Toast.LENGTH_LONG);
            toast.show();
        } else if (score >= 4 && score < 7) {
            Toast toast = Toast.makeText(this, "Improvement required", Toast.LENGTH_LONG);
            toast.show();
        } else if (score < 4) {
            Toast toast = Toast.makeText(this, "Lots of hard work required", Toast.LENGTH_LONG);
            toast.show();
        }
        display();
    }

    private void display()
    {
        String message = "Name: "+ name +"\nYour score is "+ score + " out of 10"+ "\nThank you for taking the quiz";
        TextView response = findViewById(R.id.result);
        response.setText(message);
        score = 0;
    }

}
