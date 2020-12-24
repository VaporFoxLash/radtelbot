package TelegramBot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


/**
 * Testing Telegram bot
 * @author Tamim Rayan
 */
public class TelegramBotTest {

    /**
     * Test the Bot username
     */
    @Test
    public void getBotUsernameTest(){
        var telegramBot = new TelegramBot();

        Assert.assertEquals("",telegramBot.getBotUsername());
    }
}
