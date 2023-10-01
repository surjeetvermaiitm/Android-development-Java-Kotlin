package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText myEditText = findViewById(R.id.editText);

        String inputText = myEditText.getText().toString();

        TextView myTextView = findViewById(R.id.myTextView);

        myTextView.setText("Hi "+ inputText +"!!!"+"\n"+"How are you?");

        Button myBtn = findViewById(R.id.myButton);

        myBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this," Your name is "+inputText+"Button is clicked !!!",Toast.LENGTH_SHORT).show();
            }
        });

        ImageView myImageView = findViewById(R.id.myImg);
        myImageView.setImageResource(R.drawable.photo);






    }
}