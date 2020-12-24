package ConsoleBot;

/**
 * Telegram bot
 * @author Radebe Donald
 * @author Rayan Tamim
 * @version 1.1
 * @since 23.11.2020
 */

public class Player {
    String playerName;
    int playerId;
    int score = 0;

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public String getPlayerName(){
        return playerName;
    }

    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void increaseScore(){
        score++;
    }

    public int getScore() {
        return score;
    }
}
