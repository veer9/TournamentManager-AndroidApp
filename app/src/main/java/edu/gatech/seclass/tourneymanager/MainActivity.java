package edu.gatech.seclass.tourneymanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.gatech.seclass.Team49.*;
import edu.gatech.seclass.Team49.Data.Persistence;
import edu.gatech.seclass.db.TournamentManagerDbHelper;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    Button buttonP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Persistence.Initialize(new SQLPersistence());

            Manager.Initialize(false);
            Manager man = Manager.GetInstance();
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);

            TournamentManagerDbHelper mDbHelper = new TournamentManagerDbHelper(this);
            SQLiteDatabase db = mDbHelper.getReadableDatabase();

            addListenerOnButton();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonP = (Button) findViewById(R.id.buttonPlayer);

        buttonP.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, PlayerActivity.class);
                startActivity(intent);

            }

        });
    }
}
