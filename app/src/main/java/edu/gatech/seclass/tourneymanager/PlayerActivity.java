package edu.gatech.seclass.tourneymanager;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import java.util.List;
import edu.gatech.seclass.Team49.Data.PlayerData;
import edu.gatech.seclass.dao.PlayerDAO;
import edu.gatech.seclass.db.TournamentManagerContract;
import android.app.ListActivity;

public class PlayerActivity extends ListActivity {

    private PlayerDAO pObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        displayPlayersInDB();
    }

    private void displayPlayersInDB() {
        //TextView displayView = (TextView) findViewById(R.id.text_view_players);
        pObj = new PlayerDAO(this);
        pObj.open();
        List<PlayerData> players = pObj.getAllPlayers();
        ArrayAdapter<PlayerData> adapter = new ArrayAdapter<PlayerData>(this,
                android.R.layout.simple_list_item_1, players);
        setListAdapter(adapter);

    }

    public void onClick(View view) {

        ArrayAdapter<PlayerData> adapter = (ArrayAdapter<PlayerData>) getListAdapter();
        PlayerData player = null;
        switch (view.getId()) {
            case R.id.add:
                PlayerData playerObj = new PlayerData();
                playerObj.setUsername("roger");
                playerObj.setName("Roger T");
                playerObj.setPhoneNum(123123123);
                playerObj.setDeckChoice(TournamentManagerContract.PlayerDB.DECK_FIVE);
                playerObj.setWinnings(10000.00f);
                // save the new comment to the database
                player = pObj.createPlayer(playerObj);
                adapter.add(player);
                break;
            case R.id.delete:
                if (getListAdapter().getCount() > 0) {
                    player = (PlayerData) getListAdapter().getItem(0);
                    pObj.deletePlayer(player);
                    adapter.remove(player);
                }
                break;
        }
        adapter.notifyDataSetChanged();
    }
    @Override
    protected void onResume() {
        pObj.open();
        super.onResume();
    }

    @Override
    protected void onPause() {
        pObj.close();
        super.onPause();
    }
}
