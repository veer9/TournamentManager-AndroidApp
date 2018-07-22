package edu.gatech.seclass.db;

/**
 * DB schema
 */
import android.provider.BaseColumns;



public final class TournamentManagerContract {

    private TournamentManagerContract() {
    }

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class Manager implements BaseColumns {

        /** Name of database table  */
        public final static String TABLE_NAME = "Manager";

        /**
         * Unique ID number for the pet (only for use in the database table).
         *
         * Type: INTEGER
         */

        public final static String COLUMN_CURRENT_TOURNAMENT ="current_tournament";
        public final static String COLUMN_MANAGER_MODE ="manager_mode";

        public static final int MANAGE_MODE_ON = 0;
        public static final int MANAGE_MODE_OFF = 1;
    }

    public static final class Tournament implements BaseColumns {

        /** Name of database table  */
        public final static String TABLE_NAME = "Tournament";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_TOURNAMENT_NAME ="name";
        public final static String COLUMN_DATE ="date";
        public final static String COLUMN_FIRST_WINNER ="first_winner";
        public final static String COLUMN_SECOND_WINNER ="second_winner";
        public final static String COLUMN_THIRD_WINNER ="third_winner";
        public final static String COLUMN_HOUSE_CUT ="house_cut";
        public final static String COLUMN_ENTRY_PRICE ="entry_price";
        public final static String COLUMN_HOUSE_WINNINGS ="house_winnings";
        public final static String COLUMN_FIRST_PRIZE ="first_prize";
        public final static String COLUMN_SECOND_PRIZE ="second_prize";
        public final static String COLUMN_THIRD_PRIZE ="third_prize";


    }

    public static final class PlayerDB implements BaseColumns {

        /** Name of database table  */
        public final static String TABLE_NAME = "Player";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_USERNAME ="username";
        public final static String COLUMN_PLAYER_NAME ="player_name";
        public final static String COLUMN_PHONE_NUM ="phone_num";
        public final static String COLUMN_DECK_CHOICE ="deck_choice";
        public final static String COLUMN_TOTAL_WINNING ="total_winning";

        public static final int DECK_ONE = 1;
        public static final int DECK_TWO = 2;
        public static final int DECK_THREE = 3;
        public static final int DECK_FOUR = 4;
        public static final int DECK_FIVE = 5;
        public static final int DECK_SIX = 6;
        public static final int DECK_SEVEN = 7;
        public static final int DECK_EIGHT = 8;
    }

    public static final class Match implements BaseColumns {

        /** Name of database table  */
        public final static String TABLE_NAME = "Match";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_TOURNAMENT_NAME ="tournament_name";
        public final static String COLUMN_PLAYER_ONE ="player_one";
        public final static String COLUMN_PLAYER_TWO ="player_two";
        public final static String COLUMN_MATCH_STATUS ="match_status";
        public final static String COLUMN_WINNER ="winner";

        public final static String MATCH_READY ="ReadyToStart";
        public final static String MATCH_IN_PROGRESS ="InProgress";
        public final static String MATCH_FINISHED ="Finished";
        public final static String MATCH_CANCELLED ="Cancelled";

    }

    public static final class PlayerTournament implements BaseColumns {

        /** Name of database table  */
        public final static String TABLE_NAME = "PlayerTournament";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_TOURNAMENT_NAME ="tournament_name";
        public final static String COLUMN_PLAYER_USERNAME ="player_username";
        public final static String COLUMN_WINNING ="winning";

    }


}
