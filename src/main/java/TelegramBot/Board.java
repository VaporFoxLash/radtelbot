package TelegramBot;

import ConsoleBot.Player;

/**
 * Telegram bot
 * @author Tamim
 * This interface is used to define a the leaderboard
 */

public interface Board {
    void addToTheBoard(Player player);
    String getBoard();
}
