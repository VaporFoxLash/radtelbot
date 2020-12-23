package ConsoleBot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleBotTest {


    @Test
     public void getMessageTest(){
        var consoleBot = new ConsoleBot();
        consoleBot.message = "hello";
        Assert.assertEquals("hello", consoleBot.getMessage());
    }


    @Test
     public void getResponseTest(){
        var consoleBot = new ConsoleBot();
        var msg = consoleBot.message = "/start";
        Assert.assertEquals(msg, consoleBot.getResponse("/start"));
    }




}