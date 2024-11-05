package com.example.myhelloactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DisplayMassageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_massage);

        Intent intent = getIntent();//נביא את האינטנט שגרם לאקטיביטי הזה להווצר!
        String massage = intent.getStringExtra(MainActivity.Massage_Key);
        //פנינו לאינטנט שיצר את הפעילות, ביקשנו ממנו את המחרוזת האקסטרה מתוך המפתח של הפעילות העיקרית
        // כך בעצם זה יביא לנו את הערך massage שנששמור אותו גם אצלנו בתור massage
        TextView textView = (TextView) findViewById(R.id.massage_display_textview);
        textView.setText(massage);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}
