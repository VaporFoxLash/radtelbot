package ConsoleBot;

/**
 * Telegram bot
 * @author Radebe Donald & Tamim Rayan
 * @version 1.1
 * @since 23.11.2020
 */

class Player {
    String playerName;
    int playerId;
    int score = 0;

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public void setPlayerId(){
        this.playerId = (int) (Math.random() * (1000 - 100 + 1) + 100);
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public void increaseScore(){
        this.score++;
    }
}
