package TelegramBot;

import ConsoleBot.BotHandler;
import ConsoleBot.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BotUtils implements Board {
    int quizCount = 0;

    @Override
    public void addToTheBoard(Player player) {
        if (player.getScore()>=3){
            BotHandler.saveProgress(player);
        }
    }


    @Override
    public String getBoard() {
        List<String> leaderBoard = BotHandler.getLeaderBoard();
        String board = new String();
        for (int i = 0; i < leaderBoard.size(); i++) {
            board += leaderBoard.get(i) + "\n";
        }
        return board;
    }

    public List<String> getNextQuestion(){
        List<String> question = new ArrayList<>();
        question.addAll(Arrays.asList(BotHandler.getQuestions().get(quizCount).split(", ")));
        quizCount++;
        return question;
    }

    public void exit(Player player){
        player.setPlayerName(null);
        player.setPlayerId(0);
    }

}
