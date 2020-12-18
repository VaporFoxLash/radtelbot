package ConsoleBot;

import java.util.ArrayList;
import java.util.List;

/**
 * Telegram bot
 * @author Radebe Donald
 * @version 1.1
 * @since 23.11.2020
 */

public class ConsoleBot {

    String message;
    String response;
    String errorMessage = "Wrong command please refer to /start for help";
    int userId;
    static String[] commands = {"/start",  "/trivia", "/leaderBoard"};
    List<String> board = new ArrayList<>();


    public String getMessage(){
        return this.message;
    }

    public String getResponse(String response){
        for (int i = 0; i < commands.length; i++) {
            if (this.message.equals(commands[i])){
                this.response = response;
            }else {
                this.response = this.errorMessage;
            }
        }
        return response;
    }

//    public void addToTheBoard(){
//        board.add(new LeaderBoard(number, username, score);
//    }
}
