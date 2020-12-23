package TelegramBot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;

public class BotUtils {
    public void welcomeMessage(Update update, long chatId){

    }

    public void sendReply(Update update, long chatId, String string) {
        String call_data = update.getCallbackQuery().getData();
        long message_id = update.getCallbackQuery().getMessage().getMessageId();

        SendMessage message = new SendMessage().setChatId(chatId)
                .setText(string);

    }

    public void addKeyboardLayOut(String buttonName){

    }
}
