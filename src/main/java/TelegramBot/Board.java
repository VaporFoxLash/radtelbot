package TelegramBot;

import ConsoleBot.Player;

public interface Board {
    void addToTheBoard(Player player);
    String getBoard();
}
