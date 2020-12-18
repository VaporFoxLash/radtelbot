package ConsoleBot;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Telegram bot
 * @author Radebe Donald
 * @version 1.1
 * @since 23.11.2020
 */

public class BotHandler {
    List<String> board = new ArrayList<>();
    List<String> questions = new ArrayList<>();

    public void runBot(){

    }

    public void play(){

    }

    public ArrayList<String> readFile(String fileName){
        ArrayList<String> retList = new ArrayList<>();
        try {
            final InputStream inputStream = this.getClass().getResourceAsStream("/"+fileName);
            String newLine = System.getProperty("line.separator");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder result = new StringBuilder();
            boolean flag = false;
            for (String line; (line = reader.readLine()) != null; ) {
                result.append(flag? newLine: "").append(line);
                flag = true;
            }
            retList.addAll(Collections.singleton(result.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retList;
    }

    public void getLeaderBoard(){
        board = readFile("leaderBoard.txt");
    }

    public ArrayList<String> getQuestions(){
        questions = readFile("questions.txt");
        return (ArrayList<String>) questions;
    }

    public void saveProgress(){

    }

}
