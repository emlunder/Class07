package com.example.android.class07;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        Person xi = new Person("Xi", 100);

        //adds a string to it
//        intent.putExtra(Keys.STRING, "HELLOOOOO");
//        intent.putExtra(Keys.NUM, 100);
        intent.putExtra(Keys.PERSON, xi);

        startActivity(intent);
    }
}
