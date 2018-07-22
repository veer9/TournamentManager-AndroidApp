package edu.gatech.seclass.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import edu.gatech.seclass.Team49.Data.PlayerData;

import java.util.ArrayList;
import java.util.List;

import edu.gatech.seclass.db.TournamentManagerDbHelper;
import edu.gatech.seclass.db.TournamentManagerContract.*;
/**
 * Player related db methods.
 */

public class PlayerDAO {
    // Database fields
    private SQLiteDatabase database;
    private TournamentManagerDbHelper dbHelper;
    private String[] allColumns = { PlayerDB.COLUMN_USERNAME, PlayerDB.COLUMN_PLAYER_NAME,
            PlayerDB.COLUMN_PHONE_NUM, PlayerDB.COLUMN_DECK_CHOICE, PlayerDB.COLUMN_TOTAL_WINNING };

    public PlayerDAO(Context context) {
        dbHelper = new TournamentManagerDbHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public PlayerData createPlayer(PlayerData player) {
        ContentValues values = new ContentValues();
        values.put(PlayerDB.COLUMN_USERNAME, player.getUsername());
        values.put(PlayerDB.COLUMN_PLAYER_NAME, player.getName());
        values.put(PlayerDB.COLUMN_PHONE_NUM, player.getPhoneNum());
        values.put(PlayerDB.COLUMN_DECK_CHOICE, player.getDeckChoice());
        values.put(PlayerDB.COLUMN_TOTAL_WINNING, player.getWinnings());
        long insertId = database.insert(PlayerDB.TABLE_NAME, null,
                values);
        Cursor cursor = database.query(PlayerDB.TABLE_NAME,
                allColumns, PlayerDB._ID + " = " + insertId, null,
                null, null, null);
        cursor.moveToFirst();
        PlayerData newplayer = cursorToPlayerData(cursor);
        cursor.close();
        return newplayer;
    }

    public void deletePlayer(PlayerData player) {
        String id = player.getUsername();
        System.out.println("Player deleted with id: " + id);
        database.delete(PlayerDB.TABLE_NAME, PlayerDB.COLUMN_USERNAME
                + " = \"" + id + "\"", null);
    }

    public List<PlayerData> getAllPlayers() {
        List<PlayerData> players = new ArrayList<PlayerData>();

        Cursor cursor = database.query(PlayerDB.TABLE_NAME,
                allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            PlayerData player = cursorToPlayerData(cursor);
            players.add(player);
            cursor.moveToNext();
        }
        // make sure to close the cursor
        cursor.close();
        return players;
    }

    private PlayerData cursorToPlayerData(Cursor cursor) {
        PlayerData player = new PlayerData();
        player.setUsername(cursor.getString(cursor.getColumnIndex(PlayerDB.COLUMN_USERNAME)));
        player.setName(cursor.getString(cursor.getColumnIndex(PlayerDB.COLUMN_PLAYER_NAME)));
        player.setPhoneNum(cursor.getInt(cursor.getColumnIndex(PlayerDB.COLUMN_PHONE_NUM)));
        player.setDeckChoice(cursor.getInt(cursor.getColumnIndex(PlayerDB.COLUMN_DECK_CHOICE)));
        player.setWinnings(cursor.getFloat(cursor.getColumnIndex(PlayerDB.COLUMN_TOTAL_WINNING)));
        return player;
    }
}
