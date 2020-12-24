package TelegramBot;

import ConsoleBot.Player;
import PrivateData.Defaults;
import ConsoleBot.BotHandler;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.toIntExact;

public class TelegramBot extends TelegramLongPollingBot implements Comands {
    /**
     * This method is called when receiving updates via GetUpdates method
     *
     * @param update Update received
     */
    @Override
    public void onUpdateReceived(Update update) {
        long chatId = update.getMessage().getChatId();
        Player player = new Player();
        player.setPlayerName(update.getMessage().getFrom().getFirstName());
        player.setPlayerId((int) chatId);

        if (update.hasMessage() && update.getMessage().hasText()) {
            String message = update.getMessage().getText();


            if (message.equals(START)){
                sendReply(chatId, help);
                System.out.println("starting a session...");
            }else if (message.equals(TRIVIA)){
                for (int i = 0; i < 5; i++) {
                    List<String> question = new ArrayList<>();
                    question.addAll(Arrays.asList(BotHandler.getQuestions().get(i).split(", ")));


                }
            }else if (message.equals(EXIT)){
                sendReply(chatId, "Goodbye " + player.getPlayerName());
                new BotUtils().exit(player);
            }else if (message.equals(LEADER_BOARD)){
                sendReply(chatId, "");
            }

        }else if (update.hasCallbackQuery()){
//            buttonListener(update, chatId, Quiz);
        }
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

    /**
     * Method for creating a message and sending it.
     * @param chat_id chat id
     * @param string The String that you want to send as a message.
     */
    public SendMessage sendReply(long chat_id, String string) {
        SendMessage message = new SendMessage()
                .setChatId(chat_id)
                .setText(string);
        try {
            Message message1 = sendMessage(message);// Sending our message object to user
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        return message;
    }

}
