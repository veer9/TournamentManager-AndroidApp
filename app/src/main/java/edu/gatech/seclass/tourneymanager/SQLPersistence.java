package edu.gatech.seclass.tourneymanager;

import java.util.ArrayList;

import edu.gatech.seclass.Team49.Data.IPersistence;
import edu.gatech.seclass.Team49.Data.ManagerData;
import edu.gatech.seclass.Team49.Data.MatchData;
import edu.gatech.seclass.Team49.Data.PlayerData;
import edu.gatech.seclass.Team49.Data.PlayerWinningsData;
import edu.gatech.seclass.Team49.Data.TournamentData;
import android.database.sqlite.*;

/**
 * Created by jeanf on 2/23/2017.
 */

public class SQLPersistence implements IPersistence
{
    @Override
    public ManagerData GetManagerData()
    {
        return null;
    }

    @Override
    public ArrayList<TournamentData> GetTournamentsSortByDateDesc()
    {
        return null;
    }

    @Override
    public ArrayList<PlayerData> GetPlayersSortByTotalsDesc()
    {
        return null;
    }

    @Override
    public ArrayList<String> GetPlayersForTournament(String tournament)
    {
        return null;
    }

    @Override
    public ArrayList<MatchData> GetMatchesForTournament(String tournament)
    {
        return null;
    }

    @Override
    public ArrayList<PlayerWinningsData> GetWinningsForPlayer(String username)
    {
        return null;
    }

    @Override
    public void SaveManagerData(ManagerData manager)
    {

    }

    @Override
    public void AddPlayer(PlayerData player)
    {

    }

    @Override
    public void RemovePlayer(String username)
    {

    }

    @Override
    public void AddPlayerWinning(PlayerWinningsData winnings)
    {

    }

    @Override
    public void CreateTournament(TournamentData tournament)
    {

    }

    @Override
    public void UpdateTournament(TournamentData tournament)
    {

    }

    @Override
    public void CreateMatch(MatchData match)
    {

    }

    @Override
    public void UpdateMatch(MatchData match)
    {

    }
}
