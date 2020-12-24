package ConsoleBot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Testing Player class
 * @author Tamim Rayan
 */
public class PlayerTest {

    /**
     * Test setPlayerName  when player enter his/her name.
     */
    @Test
    public void setPlayerNameTest(){
        var player = new Player();
        player.setPlayerName("Ahmad");

        Assert.assertEquals("Ahmad",player.playerName );
    }


    /**
     * Test getPlayerName  when player enter his/her name.
     */
    @Test
    public void getPlayerNameTest(){
        var player = new Player();
        player.playerName = "Ahmad";
        var playerName = player.playerName;
        Assert.assertEquals(playerName, player.getPlayerName());
    }


    @Test
    public void getPlayerIdTest(){
        var player = new Player();
        player.playerId = 5;
        var playerID = player.playerId;
        Assert.assertEquals(playerID, player.getPlayerId());
    }


    /**
     * Test Increasing Score when player enter a correct answer.
     */
    @Test
    public void increaseScoreTest(){
        var player = new Player();
        player.increaseScore();

        Assert.assertEquals(1, player.score );
    }

}
