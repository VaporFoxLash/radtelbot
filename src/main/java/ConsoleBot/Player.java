package ConsoleBot;

/**
 * Telegram bot
 * @author Radebe Donald
 * @author Rayan Tamim
 * @version 1.1
 * @since 23.11.2020
 */

class Player {
    String playerName;
    int playerId;

    public Player(String playerName, int playerId){
        this.playerName = playerName;
        this.playerId = playerId;
    }

    public void setPlayerId(){
        this.playerId = (int) (Math.random() * (1000 - 100 + 1) + 100);
    }
}
