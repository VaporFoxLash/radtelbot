package ConsoleBot;

import java.nio.file.WatchEvent;
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
    String wellcomeMessage = "Wellcome, to get started type /start";
    String errorMessage = "Wrong command please refer to /start for help";
    int userId;
    static String[] commands = {"/start",  "/trivia", "/leaderBoard"};


    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }

    public void printWelcomeMessage(){
        System.out.println(this.wellcomeMessage);
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

    public void sendMessage(String message){
        System.out.println(getMessage());
    }

//    public void addToTheBoard(){
//        board.add(new LeaderBoard(number, username, score);
//    }
}
