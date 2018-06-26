package com.project.balascageorge.jokesdisplaylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DisplayJokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_jokes_activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView myAwesomeTextView = findViewById(R.id.textView);

        String joke =  getIntent().getStringExtra("joke");
        if(!joke.isEmpty())
            myAwesomeTextView.setText(joke);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                //NavUtils.navigateUpFromSameTask(this);
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
