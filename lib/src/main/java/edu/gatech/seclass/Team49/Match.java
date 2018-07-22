package edu.gatech.seclass.Team49;

import edu.gatech.seclass.Team49.Data.MatchData;

public class Match
{
    Player m_player1;
    Player m_player2;
    Player m_winner;
    MatchStatus m_status;

    public void LoadFromPersistence(MatchData data)
    {

    }

    public void SaveToPersistence()
    {

    }

    public void StartMatch()
    {

    }

    public void EndMatch()
    {

    }

    public void CancelMatch()
    {

    }

    public Player GetWinner()
    {
        return m_winner;
    }

    public Player GetLoser()
    {
        return m_winner == m_player1 ? m_player2 : m_player1;
    }

    public MatchStatus GetStatus()
    {
        return m_status;
    }
}
