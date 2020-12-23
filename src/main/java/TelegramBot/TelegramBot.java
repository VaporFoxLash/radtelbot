package TelegramBot;

import PrivateData.Defaults;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

import java.util.List;

public class TelegramBot extends TelegramLongPollingBot {
    /**
     * This method is called when receiving updates via GetUpdates method
     *
     * @param update Update received
     */
    @Override
    public void onUpdateReceived(Update update) {

    }

    /**
     * This method is called when receiving updates via GetUpdates method.
     * If not reimplemented - it just sends updates by one into {@link #onUpdateReceived(Update)}
     *
     * @param updates list of Update received
     */
    @Override
    public void onUpdatesReceived(List<Update> updates) {

    }

    /**
     * Return bot username of this bot
     */
    @Override
    public String getBotUsername() {
        return Defaults.BOT_NAME;
    }

    /**
     * Returns the token of the bot to be able to perform Telegram Api Requests
     *
     * @return Token of the bot
     */
    @Override
    public String getBotToken() {
        return Defaults.BOT_TOKEN;
    }

    /**
     * Called when the BotSession is being closed
     */
    @Override
    public void onClosing() {

    }
}
