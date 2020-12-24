package TelegramBot;

import TelegramBot.TelegramBot;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Telegram bot
 * @author Radebe Donald
 * @author Rayan Tamim
 * @version 1.0
 * @since 23.11.2020
 */


public class MainClass {
    public static void main(String[] args) {

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new TelegramBot());
            System.out.println("Bot is running...");

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}