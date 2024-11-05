package com.example.myhelloactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    public static final String Massage_Key = "com.example.myhelloactivity.Massage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setTitle("My App");
        if(getSupportActionBar() != null)
        {
            toolbar.setTitle("My App");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public void ButtonClicked(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String massage = editText.getText().toString();
        Intent intent = new Intent(this,DisplayMassageActivity.class);
        intent.putExtra(Massage_Key,massage);
    }

    /*public void ButtonClicked(View view){//מקפיץ הודעה קצרה עם התוכן של מה שכתבנו
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String massage = editText.getText().toString();
        Toast.makeText(this,massage,Toast.LENGTH_SHORT).show();
        Log.d("Debug", "the massage is " + massage);
    }
*/




}