package TelegramBot;

/**
 * Define the commands that user can give to the bot
 * @author Donald
 */

public interface Comands {
    String START = "/start";
    String TRIVIA = "/trivia"; //trivia game
    String LEADER_BOARD = "/leaderBoard";
    String EXIT = "/exit";

    String help = "Use following commands to interact with the bot:" +
            "\n /trivia - to play a trivia game" +
            "\n /leaderBoard - to view the top player arranged by their score" +
            "\n /exit - to exit the bot";
}
