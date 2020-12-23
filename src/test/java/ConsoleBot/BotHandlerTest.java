package ConsoleBot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BotHandlerTest {

    @Test
    public void compareAnswerTest(){
        var botHandler = new BotHandler();

        Assert.assertTrue(botHandler.compareAnswer("java", "java"));
        Assert.assertFalse(botHandler.compareAnswer("kotlin", "java"));
    }

    @Test
    public void getLeaderBoardTest(){
        var botHandler = new BotHandler();
        List<String> leaderBoard = new ArrayList<>(Arrays.asList(botHandler.readFile("leaderBoard.txt").split("\\r?\\n")));
        Assert.assertEquals(leaderBoard,botHandler.getLeaderBoard());

    }

    @Test
    public void getQuestionsTest(){
        var botHandler = new BotHandler();
        List<String> quizList = new ArrayList<>(Arrays.asList(botHandler.readFile("questions.txt").split("\\r?\\n")));
        Assert.assertEquals(quizList,botHandler.getQuestions());

    }

}
