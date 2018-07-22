package edu.gatech.seclass.Team49.Data;

import java.util.ArrayList;

public interface IPersistence
{
    ManagerData GetManagerData();
    ArrayList<TournamentData> GetTournamentsSortByDateDesc();
    ArrayList<PlayerData> GetPlayersSortByTotalsDesc();
    ArrayList<String> GetPlayersForTournament(String tournament);
    ArrayList<MatchData> GetMatchesForTournament(String tournament);
    ArrayList<PlayerWinningsData> GetWinningsForPlayer(String username);

    void SaveManagerData(ManagerData manager);

    void AddPlayer(PlayerData player);
    void RemovePlayer(String username);
    void AddPlayerWinning(PlayerWinningsData winnings);

    void CreateTournament(TournamentData tournament);
    void UpdateTournament(TournamentData tournament);

    void CreateMatch(MatchData match);
    void UpdateMatch(MatchData match);
}