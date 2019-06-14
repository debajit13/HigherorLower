package com.e.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int random;

    public void generateRandomNumber(){

        Random rand = new Random();
        random = rand.nextInt(20) + 1;

    }

    public void guessFunction(View view){

        EditText editText = (EditText )findViewById(R.id.editText);

        int checkNumInt = Integer.parseInt(editText.getText().toString());

        String message;


        if(checkNumInt < random) {
            message = "Higher!";
        }

        else if(checkNumInt > random) {
            message = "Lower";
        }

        else {
            message = "You got it! Try Again!";
            generateRandomNumber();
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}
