package edu.gatech.seclass.Team49;

import java.util.ArrayList;
import edu.gatech.seclass.Team49.Data.*;

public class Manager
{
    private static Manager instance = null;

    public static void Initialize(boolean managerMode)
    {
        if(instance == null)
            instance = new Manager(managerMode);
    }

    public static Manager GetInstance()
    {
        return instance;
    }

    private boolean m_isManagerMode = false;
    private Tournament m_currentTournament;
    private ArrayList<Tournament> m_allTournaments;
    private ArrayList<Player> m_allPlayers;

    private Manager(boolean managerMode)
    {
        m_isManagerMode = managerMode;

        LoadFromPersistence(Persistence.GetInstance().GetManagerData());
    }

    private void LoadFromPersistence(ManagerData data)
    {

    }

    public void SaveToPersistence()
    {

    }

    public Player AddPlayer(String name, String userName, int phone, int deckChoice)
    {
        return null;
    }

    public void RemovePlayer(String userName)
    {

    }

    public Tournament CreateTournament(String name, int houseCut, int entryPrice, ArrayList<String> players)
    {
        return null;
    }

    public void EndTournament(Tournament tournament)
    {

    }

    public ArrayList<Player> GetUserTotals()
    {
        return m_allPlayers;
    }

    public ArrayList<Tournament> GetPastTournaments()
    {
        return m_allTournaments;
    }

    public Tournament GetCurrentTournament()
    {
        return m_currentTournament;
    }
}
