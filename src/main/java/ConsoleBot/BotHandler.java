package ConsoleBot;

import java.io.*;
import java.util.Scanner;

/**
 * Telegram bot
 * @author Radebe Donald
 * @version 1.1
 * @since 23.11.2020
 */

public class BotHandler {

    public void runBot(){

    }

    public void play(){

    }

    public void getLeaderBoard(){
        try {
            InputStream input = getClass().getResourceAsStream("leaderBoard.txt");
            File myObj = new File("leaderBoard.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void saveProgress(){

    }

}
