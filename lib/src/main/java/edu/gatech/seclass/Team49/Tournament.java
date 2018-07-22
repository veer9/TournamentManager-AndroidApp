package edu.gatech.seclass.Team49;

import java.util.ArrayList;
import java.util.Date;

import edu.gatech.seclass.Team49.Data.TournamentData;

public class Tournament
{
    private String m_name;
    private Date m_date;
    private ArrayList<Player> m_players;
    private Player m_firstPlaceWinner;
    private Player m_secondPlaceWinner;
    private Player m_thirdPlaceWinner;
    private int m_houseCut;
    private int m_entryPrice;
    private double m_houseWinnings;
    private double m_firstPrize;
    private double m_secondPrize;
    private double m_thirdPrize;
    private ArrayList<Match> m_matches;

    public void LoadFromPersistence(TournamentData data)
    {

    }

    public void SaveToPersistence()
    {

    }

    public void StartTournament()
    {

    }

    public void EndTournament()
    {

    }

    private void CalculatePrizesAndProfit()
    {

    }

    public ArrayList<Match> GetAllMatches()
    {
        return m_matches;
    }

    public ArrayList<Player> GetAllPlayers()
    {
        return m_players;
    }

    public Player GetFirstPlaceWinner()
    {
        return m_firstPlaceWinner;
    }

    public Player GetSecondPlaceWinner()
    {
        return m_secondPlaceWinner;
    }

    public Player GetThirdPlaceWinner()
    {
        return m_thirdPlaceWinner;
    }

    private void Refund()
    {

    }
}
