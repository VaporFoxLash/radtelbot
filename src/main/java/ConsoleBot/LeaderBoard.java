package ConsoleBot;

import java.util.HashMap;
import java.util.Map;

/**
 * Telegram bot
 * @author Radebe Donald & Tamim Rayan
 * @version 1.1
 * @since 23.11.2020
 */

public class LeaderBoard {
    int number;
    String username;
    int score;

    public LeaderBoard(int number, String username, int score){
        this.number = number;
        this.username = username;
        this.score = score;
    }

}
