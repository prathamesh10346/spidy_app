package com.example.myapplicationpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    Button button;
    Button button2;
    private String[] question = { "1. Is that spiderman?", "2. Spiderman is from marvel?", "3. DC also include spiderman?","4. Spiderman is a peter parker?","5. Spiderman can fly?"};
    private boolean[] answer={true,true,false,true,false};
    private int index =0;
    private int score = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        textView.setText(question[index]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=question.length-1){
                    if(answer[index]==true){
                        score++;

                    }
                    index++;
                    if (index<=question.length-1){
                        textView.setText(question[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "your score is:"+score, Toast.LENGTH_SHORT).show();
                    }

                }
                else {


                    Toast.makeText(MainActivity.this, "!!! Restart the app again !!!", Toast.LENGTH_SHORT).show();
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=question.length-1){
                    if(answer[index]==false){
                        score++;

                    }
                    index++;
                    if (index<=question.length-1){
                        textView.setText(question[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "your score is:"+score, Toast.LENGTH_SHORT).show();
                    }

                }
                else {


                    Toast.makeText(MainActivity.this, "!!! Restart the app again !!!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}