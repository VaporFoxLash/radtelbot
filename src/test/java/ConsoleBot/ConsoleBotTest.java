package ConsoleBot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Testing Console bot
 * @author Tamim Rayan
 */
class ConsoleBotTest {


    /**
     * Test getMessage.
     */
    @Test
     public void getMessageTest(){
        var consoleBot = new ConsoleBot();
        consoleBot.message = "hello";
        Assert.assertEquals("hello", consoleBot.getMessage());
    }


    /**
     * Test getResponse when user enter a command.
     */
    @Test
     public void getResponseTest(){
        var consoleBot = new ConsoleBot();
        var msg = consoleBot.message = "/start";
        Assert.assertEquals(msg, consoleBot.getResponse("/start"));
    }




}