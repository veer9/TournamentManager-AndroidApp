package edu.gatech.seclass.Team49.Data;

/**
 * Data transfer object for class Player
 */

public class PlayerData
{
    private String username;
    private String name;
    private Integer deckChoice;
    private Integer phoneNum;
    private Float winnings;

    public Float getWinnings() {
        return winnings;
    }

    public void setWinnings(float winnings) {
        this.winnings = winnings;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getDeckChoice() {
        return deckChoice;
    }

    public void setDeckChoice(Integer deckChoice) {
        this.deckChoice = deckChoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return
                username +','+
                 name + ',' +
                 deckChoice +  ',' +
                  phoneNum + ',' +
                winnings ;
    }

}
