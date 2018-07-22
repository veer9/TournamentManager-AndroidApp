package edu.gatech.seclass.Team49;

import java.util.ArrayList;
import java.util.Dictionary;

import edu.gatech.seclass.Team49.Data.PlayerData;
import edu.gatech.seclass.Team49.Data.PlayerWinningsData;

public class Player
{
    private String m_name;
    private String m_userName;
    private int m_phone;
    private int m_deckChoice;
    private double m_totalWinnings;
    private Dictionary<String, Double> m_winningHistory;

    public void LoadFromPersistence(PlayerData data, ArrayList<PlayerWinningsData> winnings)
    {

    }

    public void SaveToPersistence()
    {

    }

    public double GetTotalWinnings()
    {
        return m_totalWinnings;
    }

    public Dictionary<String, Double> GetWinningHistory()
    {
        return m_winningHistory;
    }

    public void SetTournamentWinnings(String tournament, double prize)
    {
        m_winningHistory.put(tournament, prize);
    }
}
