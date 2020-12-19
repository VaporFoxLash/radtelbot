package ConsoleBot;

/**
 * Telegram bot
 * @author Radebe Donald
 * @version 1.1
 * @since 23.11.2020
 */

public class ConsoleMainClass {
    // Run Bot methods.
    public static void main(String args[]) {
        BotHandler handler = new BotHandler();
//        System.out.println(handler.getLeaderBoard());
        handler.runBot();
    }
}
