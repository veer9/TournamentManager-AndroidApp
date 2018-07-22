package edu.gatech.seclass.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import edu.gatech.seclass.Team49.Player;
import edu.gatech.seclass.db.TournamentManagerContract.*;

//import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Database helper for Pets app. Manages database creation and version management.
 */
public class TournamentManagerDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = TournamentManagerDbHelper.class.getSimpleName();

    /** Name of the database file */
    private static final String DATABASE_NAME = "tournamentmanagement.db";

    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Constructs a new instance of {@link TournamentManagerDbHelper}.
     *
     * @param context of the app
     */
    public TournamentManagerDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_MANAGER_TABLE =  "CREATE TABLE " + Manager.TABLE_NAME + " ("
                + Manager._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Manager.COLUMN_CURRENT_TOURNAMENT + " TEXT , "
                + Manager.COLUMN_MANAGER_MODE + " INTEGER NOT NULL ); ";

        String SQL_CREATE_TOURNAMENT_TABLE =  "CREATE TABLE " + Tournament.TABLE_NAME + " ("
                +  Tournament._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                +  Tournament.COLUMN_TOURNAMENT_NAME + " TEXT , "
                +  Tournament.COLUMN_DATE+ " TEXT, "
                +  Tournament.COLUMN_ENTRY_PRICE+ " INTEGER NOT NULL, "
                +  Tournament.COLUMN_FIRST_PRIZE + " REAL,"
                +  Tournament.COLUMN_FIRST_WINNER + " TEXT ,"
                +  Tournament.COLUMN_HOUSE_CUT + " INTEGER NOT NULL,"
                +  Tournament.COLUMN_HOUSE_WINNINGS + " REAL,"
                +  Tournament.COLUMN_SECOND_PRIZE+" REAL,"
                +  Tournament.COLUMN_SECOND_WINNER+" TEXT,"
                +  Tournament.COLUMN_THIRD_PRIZE+" REAL,"
                +  Tournament.COLUMN_THIRD_WINNER+" TEXT);";

        String SQL_CREATE_PLAYER_TABLE =  "CREATE TABLE " + PlayerDB.TABLE_NAME + " ("
                + PlayerDB._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PlayerDB.COLUMN_USERNAME + " TEXT , "
                + PlayerDB.COLUMN_PLAYER_NAME+ " TEXT, "
                + PlayerDB.COLUMN_PHONE_NUM + " INTEGER, "
                + PlayerDB.COLUMN_DECK_CHOICE + " INTEGER, "
                + PlayerDB.COLUMN_TOTAL_WINNING + " REAL);";

        String SQL_CREATE_MATCH_TABLE =  "CREATE TABLE " + Match.TABLE_NAME + " ("
                + Match._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Match.COLUMN_PLAYER_ONE + " TEXT, "
                + Match.COLUMN_PLAYER_TWO + " TEXT, "
                + Match.COLUMN_TOURNAMENT_NAME + " TEXT, "
                + Match.COLUMN_MATCH_STATUS+"INTEGER,"
                + Match.COLUMN_WINNER + "TEXT);";

        String SQL_CREATE_PLAYERTOURNAMENT_TABLE =  "CREATE TABLE " + PlayerTournament.TABLE_NAME + " ("
                + PlayerTournament._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PlayerTournament.COLUMN_TOURNAMENT_NAME + " TEXT, "
                + PlayerTournament.COLUMN_PLAYER_USERNAME + " TEXT, "
                + PlayerTournament.COLUMN_WINNING + " REAL);";


        // Execute the SQL statement
        db.execSQL(SQL_CREATE_MANAGER_TABLE);
        db.execSQL(SQL_CREATE_TOURNAMENT_TABLE);
        db.execSQL(SQL_CREATE_PLAYER_TABLE);
        db.execSQL(SQL_CREATE_MATCH_TABLE);
        db.execSQL(SQL_CREATE_PLAYERTOURNAMENT_TABLE);
    }

    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Manager.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Tournament.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + PlayerDB.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Match.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + PlayerTournament.TABLE_NAME);
        onCreate(db);
    }
}