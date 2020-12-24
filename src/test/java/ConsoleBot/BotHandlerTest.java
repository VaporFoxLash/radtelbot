package ConsoleBot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Testing Bot Handler class
 * @author Tamim Rayan
 */
public class BotHandlerTest {

    /**
     * Test when user enter an answer, its correct or not .
     */
    @Test
    public void compareAnswerTest(){
        var botHandler = new BotHandler();

        Assert.assertTrue(botHandler.compareAnswer("java", "java"));
    }


    /**
     * Test getting all existence players in DataBase .
     */
    @Test
    public void getLeaderBoardTest(){
        var botHandler = new BotHandler();
        List<String> leaderBoard = new ArrayList<>(Arrays.asList(botHandler.readFile("leaderBoard.txt").split("\\r?\\n")));
        Assert.assertEquals(leaderBoard,botHandler.getLeaderBoard());

    }


    /**
     * Test getting all existence questions in DataBase .
     */
    @Test
    public void getQuestionsTest(){
        var botHandler = new BotHandler();
        List<String> quizList = new ArrayList<>(Arrays.asList(botHandler.readFile("questions.txt").split("\\r?\\n")));
        Assert.assertEquals(quizList,botHandler.getQuestions());

    }


    /**
     * Test reading data from files .
     */
    @Test
    public void readFileTest(){
        var botHandler = new BotHandler();
        StringBuilder file = new StringBuilder();

        try {
            final InputStream inputStream = this.getClass().getResourceAsStream("/"+"leaderBoard.txt");
            String newLine = System.getProperty("line.separator");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            boolean flag = false;
            for (String line; (line = reader.readLine()) != null; ) {
                file.append(flag? newLine: "").append(line);
                flag = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(file.toString() ,botHandler.readFile("leaderBoard.txt"));
    }


}
