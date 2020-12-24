package ConsoleBot;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Telegram bot
 * @author Radebe Donald & Tamim Rayan
 * @version 1.1
 * @since 23.11.2020
 */

public class LeaderBoard {
    int number;
    String username;
    int score;

    public LeaderBoard(int number, String username, int score){
        this.number = number;
        this.username = username;
        this.score = score;


        try {

            FileWriter myWriter = new FileWriter(System.getProperty("user.dir")+"/src/main/resources/leaderBoard.txt",true);
            myWriter.append("\n").append(String.valueOf(number)).append(" - ").append(username).append(" - ").append(String.valueOf(score));
            myWriter.close();
            System.out.println("Player details saved to dataBase");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }




}
