package TelegramBot;

import ConsoleBot.BotHandler;
import ConsoleBot.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Telegram bot
 * @author Radebe Donald
 * @version 1.1
 * @since 23.12.2020
 *
 * Handle Bot utilities
 */

public class BotUtils implements Board {
    int quizCount = 0;

    /**
     * Add the Player to the leaderBoard
     * Only if their score is 3 or more
     * @param player
     */
    @Override
    public void addToTheBoard(Player player) {
        if (player.getScore()>=3){
            BotHandler.saveProgress(player);
        }
    }


    /**
     * Get the leader board from the txt file
     * return it to be sent to the user when they request it
     */
    @Override
    public String getBoard() {
        List<String> leaderBoard = BotHandler.getLeaderBoard();
        String board = new String();
        for (int i = 0; i < leaderBoard.size(); i++) {
            board += leaderBoard.get(i) + "\n";
        }
        return board;
    }


    /**
     * This methd return the next question when the user press continue button
     * The questions are store in a  text file which is read by ConsoleBot handler
     * A better way could be implemented for this
     */
    public List<String> getNextQuestion(){
        List<String> question = new ArrayList<>();
        question.addAll(Arrays.asList(BotHandler.getQuestions().get(quizCount).split(", ")));
        quizCount++;
        return question;
    }

    /**
     * this method initializes the player attributes tonull and 0 when they exit
     * Getting a state of the bot-user interaction could make this method better
     */
    public void exit(Player player){
        player.setPlayerName(null);
        player.setPlayerId(0);
    }

}
